public class exam05 {
     public static void main(String[] args) {
        
         int i = 2; // 단 (시작값)

        while (i <= 9) { // 단 조건
            System.out.println("=== " + i + "단 ===");

            for (int j = 1; j <= 9; j++) { // 곱해지는 수는 그대로 for
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println(); // 줄 바꿈
            i++; // while에서 직접 증가시켜야 함
        }
    }
}