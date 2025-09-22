import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 파일 스트림을 닫지 않은 채,
 * 두 스레드가 서로 반대 순서로 락을 획득하려다 교착상태에 빠지는 데모.
 */
public class DecoratorIODeadlockDemo {

    // 서로 다른 두 락(모니터)
    private final Object LOCK_A = new Object();
    private final Object LOCK_B = new Object();

    // 공용 I/O 자원 (일부러 close() 하지 않음)
    private final FileInputStream fis;
    private final InputStreamReader isr;
    private final BufferedReader br;

    public DecoratorIODeadlockDemo(String path) throws IOException {
        fis = new FileInputStream(path);
        isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        br  = new BufferedReader(isr);
    }

    // 스레드 1이 호출: A → (대기) → B 순서로 락을 잡으려 함
    public void readWithLockOrderAB() {
        System.out.println("[T1] trying LOCK_A");
        synchronized (LOCK_A) {
            System.out.println("[T1] got LOCK_A");
            sleep(500); // 교착 유도용 대기
            System.out.println("[T1] trying LOCK_B");
            synchronized (LOCK_B) {
                System.out.println("[T1] got LOCK_B");
                readSomeLines("T1"); // 공용 BufferedReader 사용 (닫지 않음)
            }
        }
    }

    // 스레드 2가 호출: B → (대기) → A 순서로 락을 잡으려 함
    public void readWithLockOrderBA() {
        System.out.println("[T2] trying LOCK_B");
        synchronized (LOCK_B) {
            System.out.println("[T2] got LOCK_B");
            sleep(500); // 교착 유도용 대기
            System.out.println("[T2] trying LOCK_A");
            synchronized (LOCK_A) {
                System.out.println("[T2] got LOCK_A");
                readSomeLines("T2"); // 공용 BufferedReader 사용 (닫지 않음)
            }
        }
    }

    // 파일에서 몇 줄만 읽어보는 메소드(자원은 닫지 않음)
    private void readSomeLines(String tag) {
        try {
            for (int i = 0; i < 2; i++) {
                String line = br.readLine(); // 끝까지 읽으면 null
                System.out.println("[" + tag + "] read: " + line);
                if (line == null) break;
            }
        } catch (IOException e) {
            System.out.println("[" + tag + "] I/O error: " + e.getMessage());
        }
    }

    private static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException ignored) {}
    }

    public static void main(String[] args) throws Exception {
        // ⚠ 경로 오타 주의: 보통 resource 디렉터리입니다.
        String path = "C:/jsy.java/java-study/src/resorce/test.txt";
        DecoratorIODeadlockDemo demo = new DecoratorIODeadlockDemo(path);

        Thread t1 = new Thread(demo::readWithLockOrderAB, "T1");
        Thread t2 = new Thread(demo::readWithLockOrderBA, "T2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // 의도적으로 close()하지 않음: 파일 핸들이 열린 채로 남아있음
        System.out.println("끝 (이 메시지까지 오기 어렵습니다: 교착상태 예상)");
    }
}
