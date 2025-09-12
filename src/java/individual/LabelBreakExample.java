public class LabelBreakExample {
    public static void main(String[] args) {
        outer: // <-- 여기가 라벨
        for (int i = 2; i <= 9; i++) {
            System.out.println("=== " + i + "단 ===");

            for (int j = 1; j <= 9; j++) {
                int result = i * j;
                System.out.println(i + " x " + j + " = " + result);

                // 조건: 결과가 20 이상이면 바깥 for문까지 탈출
                if (result >= 20) {
                    System.out.println("조건 만족! 바깥 for문까지 탈출");
                    break outer; // ← 바깥 for문까지 빠져나감
                }
            }
            System.out.println(); // 단 사이 줄바꿈
        }

        System.out.println("모든 반복문 종료!");
    }
}
