package src2.java.exam04;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new MovieThread();
        thread1.start();

        Thread thread2 = new Thread(//코드작성);
        thread2.start();
    }
}
