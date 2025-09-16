public class ex030205 {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 2;
        double var3 = (double) var1 / var2;  //나눗셈을 실수로 하도록 한 쪽을 double로 캐스팅
        int var4 = (int) (var3 * var2);
        System.out.println(var4);
    }
}
