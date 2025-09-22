package src2.java.exam05;

import src2.java.exam04.MovieThread;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new MovieThread();
        thread.start();

        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        thread.interrupt();  // ✅ 무비 스레드에 인터럽트 신호 전송
    }
}
