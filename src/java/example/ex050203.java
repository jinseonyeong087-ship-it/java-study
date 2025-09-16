public class ex050203 {
    public static void main(String[] args) {
        int[][] array = {
            {95, 86},
            {83, 92, 96},
            {78, 83, 93, 87, 88}
        };
        System.out.println(array.length);
        //2차원 배열의 행(row) 개수 여기서는 {...}, {...}, {...} → 총 3개의 행 → 결과는 3
        System.out.println(array[2].length);
        //array[2] → ({78, 83, 93, 87, 88}) array[2].length = 이 1차원 배열의 길이 → 5

    }
}
