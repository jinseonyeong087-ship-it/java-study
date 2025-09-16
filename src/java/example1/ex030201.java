public class ex030201 {

    // 방법 A: 캐스트 사용
    // public static void main(String[] args) {
    // byte b = 5;
    // b = (byte) -b; // ← 캐스트 필요
    // int result = 10 / b; // 10 / -5 = -2
    // System.out.println(result); // -2
    // }

    // B: 처음부터 int 사용
    public static void main(String[] args) {
        int b = 5;
        b = -b;
        int result = 10 / b; // -2
        System.out.println(result);
    }
}


