import java.util.Scanner; 

public class ex040207 {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 0;
        Scanner sc = new Scanner(System.in);

        while (run) {
            System.out.println("-------------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------------");
            System.out.print("선택> ");
            int num = sc.nextInt();
            
            if (num == 1) {
                System.out.println("예금액>10000");
            } else if ( num == 2) {
                System.out.println("출금액>2000");
            } else if ( num == 3) {
                System.out.println("잔고>8000");
            } else if ( num == 4 ) {
                System.out.println();
                run = false;
            }
        
        } 
        System.out.println("프로그램 종료"); 
       sc.close();
    }
}

