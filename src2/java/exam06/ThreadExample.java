package src2.java.exam06;

// (중요) 다른 패키지의 MovieThread import 하지 마세요.

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new MovieThread();

        // 메인 종료 시 함께 끝나도록 데몬 스레드로 지정
        thread.setDaemon(true);

        thread.start();

        try { Thread.sleep(3000); } catch (InterruptedException e) {}
        // 메인 스레드 종료 → 데몬 스레드도 함께 종료
    }
}
