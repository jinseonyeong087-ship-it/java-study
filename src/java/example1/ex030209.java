import java.util.Scanner;

public class ex030209 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 수: ");
        double num1 = Double.parseDouble(sc.nextLine());

        System.out.print("두 번째 수: ");
        double num2 = Double.parseDouble(sc.nextLine());

        System.out.println("-----------------");
        if (num2 != 0.0) {
            double result = num1 / num2;
            System.out.printf("결과: %.1f%n", result);
            //소수점 첫번째 까지만 나오게(반올림)

        } else {
            System.out.println("결과: 무한대");
        }

    }
}
