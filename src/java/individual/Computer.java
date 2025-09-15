public class Computer {
    int sum1(int[] Values) {
        int sum = 0;
        for (int i = 0; i < Values.length; i++) {
            sum += Values[i];
        }
        return sum;

    }

    int sum2(int... Values) {
        int sum = 0;
        for (int i = 0; i < Values.length; i++) {
            sum += Values[i];
        }
        return sum;
    }
}
