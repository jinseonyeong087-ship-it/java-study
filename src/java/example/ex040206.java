public class ex040206 {
    public static void main(String[] args) {
        // int line = 4; // 총 줄 수

        // for (int i = 1; i <= line; i++) {    // 1 → 4 (증가)
        // // 1️⃣ 공백 출력 (왼쪽 여백)
        // for (int space = line; space > i; space--) {
        // System.out.print(" ");
        // }

        // // 2️⃣ 별 출력
        // for (int star = 1; star <= i; star++) {
        // System.out.print("*");
        // }

        // System.out.println(); // 줄바꿈
        // }
        int line = 4; // 줄 개수

        for (int i = line; i >= 1; i--) {    // 4 → 1 (감소)
            // 1️⃣ 공백 출력 (앞쪽 여백)
            for (int space = line; space > i; space--) {
                System.out.print(" ");
            }

            // 2️⃣ 별 출력 (점점 줄어듦)
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }

            System.out.println(); // 줄바꿈

        }
    }
}
