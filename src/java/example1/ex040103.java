import java.util.Scanner;

public class ex040103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
        int score = sc.nextInt();

        // int score = 85;

        System.out.println("등급은");
        if(score < 70) {
            System.out.println("D");
        } else if(score < 80) {
            System.out.println("C");
        } else if (score < 90) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
        System.out.println("입니다.");

        sc.close();
    }
}
