import java.util.Scanner;

public class ex040104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("어떤 혜택을 원하세요?");
        char grade = sc.nextLine().charAt(0);
        // char grade = 'C';
        switch(grade) {
            case 'A' : System.out.println("VVIP 혜택을 받으실 수 있습니다."); break;
            case 'B' : System.out.println("VIP 혜택을 받으실 수 있습니다."); break;
            case 'C' : System.out.println("우수 회원 혜택을 받으실 수 있습니다."); break;
            case 'D' : System.out.println("일반 회원 혜택을 받으실 수 있습니다."); break;
            default : System.out.println("혜택이 없습니다.");
        }
        System.out.println("감사합니다.");
    }
}
