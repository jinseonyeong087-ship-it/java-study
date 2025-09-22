package src2.java.exam05;

public class MovieThread extends Thread {
    @Override
    public void run() {
        while(true) {
            System.out.println("동영상을 재생합니다.");
            if(this.isInterrupted()) {
                  // ✅ 메인 스레드에서 interrupt()가 호출되면 플래그가 true가 됨
                break;
                 // 반복문 탈출
            }
        }
    }
}
