import java.util.Scanner;   // ← Scanner 클래스 가져오기

public class ScannerExample {
    public static void main(String[] args) {
        // 1. Scanner 객체 생성 (System.in = 키보드 입력)
        Scanner sc = new Scanner(System.in);

        // 2. 문자열 입력
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        // System.out.println("이름: " + name);

        // 3. 정수 입력
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        // System.out.println("나이: " + age);

        // 4. 실수 입력
        System.out.print("키를 입력하세요: ");
        double height = sc.nextDouble();
        // System.out.println("키: " + height);

        // 출력
        System.out.println("\n[입력 결과]");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "세");
        System.out.println("키: " + height + "cm");

        // 5. Scanner 닫기
        sc.close();
    }
}
