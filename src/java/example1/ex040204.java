public class ex040204 {
    
    public static void main(String[] args) {
        for(int x = 1; x <= 10; x++ ) {
            for(int y = 1; y <= 10; y++ ) {
                //for문은 반드시 3개의 식 for (초기식; 조건식; 증감식)
                if((4 * x + 5 * y) == 60) {
                    System.out.println("(" + x + ", " + y + ")");

                }
            }
        }
      
    }
}
