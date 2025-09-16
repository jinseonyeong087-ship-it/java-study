import java.util.Scanner;

public class ex040207 {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 0;
        Scanner sc = new Scanner(System.in);

        // while (run) {
        // System.out.println("-------------------------------------");
        // System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
        // System.out.println("-------------------------------------");
        // System.out.print("선택> ");
        // int num = sc.nextInt();

        // if (num == 1) {
        // System.out.println("예금액>10000");
        // } else if ( num == 2) {
        // System.out.println("출금액>2000");
        // } else if ( num == 3) {
        // System.out.println("잔고>8000");
        // } else if ( num == 4 ) {
        // System.out.println();
        // run = false;
        // }

        // }
        // System.out.println("프로그램 종료");
        // sc.close();
        // }
        // }
        
        //개선 코드
        while (run) {
            System.out.println("-------------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------------");
            System.out.print("선택> ");
            int num = sc.nextInt();

            if (num == 1) {
                System.out.print("예금액> ");
                int deposit = sc.nextInt();
                balance += deposit; // 🔹 잔고 증가
            } else if (num == 2) {
                System.out.print("출금액> ");
                int withdraw = sc.nextInt();

                if (withdraw > balance) {
                    System.out.println("잔고 부족!");
                } else {
                    balance -= withdraw; // 🔹 잔고 감소
                }
            } else if (num == 3) {
                System.out.println("잔고> " + balance);
            } else if (num == 4) {
                run = false; // 🔹 while 종료
                System.out.println("프로그램 종료");
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }

        sc.close();
    }
}
