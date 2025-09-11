import java.util.Scanner;

public class ex020403 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("[필수 정보 입력]");

         System.out.print("1. 이름: ");
         String name = scanner.nextLine();

         System.out.print("2. 주민번호 앞 6자리: ");
         String num = scanner.nextLine();

         System.out.print("3. 전화번호(앞자리): ");
         String tel1 = scanner.nextLine();

         System.out.print("4. 전화번호(중간자리): ");
         String tel2 = scanner.nextLine();

         System.out.print("5. 전화번호(뒷자리): ");
         String tel3 = scanner.nextLine();

         System.out.println();

         System.out.println("[입력된 내용]");
         System.out.println("1. 이름: " + name);
         System.out.println("2. 주민번호 앞 6자리: " + num);
         System.out.printf("3. 전화번호: %s-%s-%s", tel1, tel2, tel3);

         scanner.close();


    }
    
}
