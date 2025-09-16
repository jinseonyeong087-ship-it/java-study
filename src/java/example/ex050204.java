public class ex050204 {
    
    public static void main(String[] args) {
        int max = 0;
        int[] array = { 1, 5, 3, 8, 2 };

        // array[0] = 1
        // array[1] = 5
        // array[2] = 3
        // array[3] = 8
        // array[4] = 2
        // array.length = 5

        for (int i = 0; i < array.length; i++) {
            //i 를 0부터 시작 → 배열의 마지막 인덱스까지 순회 (array.length = 5)
            if (array[i] > max) {  
                max = array[i];
            }  //array[i] > max → 지금 보고 있는 값이 더 크면 max를 바꿔줍니다.
        }

        System.out.println("max: " + max);
    }
}
