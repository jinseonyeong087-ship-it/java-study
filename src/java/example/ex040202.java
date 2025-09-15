public class ex040202 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {   // 3으로 나눈 나머지가 0 → 3의 배수
                sum += i;
            }
        }

        System.out.println("1~100 3의 배수 총합 : " + sum);
    }
}
