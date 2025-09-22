package src2.java.exam04;

public class MovieThread //코드작성{
   @Override
   public void run() {
    for(int i=0;i<3;i++) {
        System.out.println("동영상을 재생합니다.");
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            
        }
    }
   }
    
}
