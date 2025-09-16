public class ex040203 {
    public static void main(String[] args) {
        int dice1, dice2;

        while (true) {
            dice1 = (int)(Math.random() *6) + 1;
            dice2 = (int)(Math.random() *6) + 1;
            //Math.random() → 0.0 <= 값 < 1.0 사이의 실수 반환
            //Math.random() * 6 결과 → 0.0 <= 값 < 6.0
            //(int)형변환(Math.random() * 6) 소수점 버림 → 0, 1, 2, 3, 4, 5 중 하나
            //(int)(Math.random() * 6) + 1 모든 값에 1 더하기 (범위 → 1, 2, 3, 4, 5, 6)

            System.out.println("(" + dice1 + ", " + dice2 + ")");

            if (dice1 + dice2 == 5) {
                break;
            }

        }
        System.out.println("합이 5라서 종료!");
    }
}
