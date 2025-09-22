import java.util.Scanner;

public class ex020402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 수: ");
        String strNum1 = scanner.nextLine();

        System.out.print("두 번째 수: ");
        String strNum2 = scanner.nextLine();

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

// Scanner.nextLine() 이든, 파일에서 읽든, 입력받는 데이터는 처음엔 문자열(String) 로 들어옵니다.
// 예를 들어 키보드로 123 을 입력해도, 실제로는 "123" (문자열) 로 저장
// 문자열 "123" 은 숫자가 아니기 때문에 +, -, * 같은 산술 연산을 할 수 없어요.
// 그래서 자바에서 제공하는 Wrapper 클래스(Integer, Double 등)의 parseXXX() 메소드를 사용해 문자열을 숫자로 바꿔야 합니다.

        int result = num1 + num2;
        System.out.println("덧셈 결과: " + result);

    }
    
}
