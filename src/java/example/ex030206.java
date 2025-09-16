public class ex030206 {
    public static void main(String[] args) {
        // int value = 356;
        // System.out.println((value/100)*100);
        // }
        // }

        // 또는

        int value = 356;
        System.out.println((value / 100) * 100);
        int result = value - (value % 100);
        System.out.println(result);
    }
}