import java.util.Arrays;

public class exam08 {
    public static void main(String[] args) {
        int[] scores = { 83, 90, 87, 97 };

       
        int sum = 0;
        for (int score : scores) {
            sum += score;
            // 총합계산
        }
        double avg = (double) sum / scores.length;
        // 평균계산

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + avg);

        // 2. 등수 계산
        int[] ranks = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            int rank = 1;
            for (int j = 0; j < scores.length; j++) {
                if (scores[j] > scores[i]) {
                    rank++;
                }
            }
            ranks[i] = rank;
        }

        // 3. (점수, 등수) 쌍을 정렬하기 위해 2차원 배열 생성
        int[][] result = new int[scores.length][2];
        for (int i = 0; i < scores.length; i++) {
            result[i][0] = scores[i]; // 점수
            result[i][1] = ranks[i];  // 등수
        }

        // 4. 점수를 기준으로 내림차순 정렬
        Arrays.sort(result, (a, b) -> b[0] - a[0]);

        // 5. 출력
        System.out.println("\n--- 순위표 (점수순 정렬) ---");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][1] + "등 : 점수 = " + result[i][0]);
        }
    }
}
