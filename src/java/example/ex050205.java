public class ex050205 {
    
    public static void main(String[] args) {
        int[][] array = {
            {95, 86},
            {83, 92, 96},
            {78, 83, 93, 87, 88}
        };

        int sum = 0;
        int count = 0;    // 전체 개수
        double avg = 0.0;

        for (int i = 0; i < array.length; i++ ) {          // 행 반복
            for (int j = 0; j < array[i].length; j++) {    // 열 반복
                sum += array[i][j];   // 값 더하기
                count++;              // 개수 세기
            }
        }
        avg = (double) sum / count;

        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
    }
}