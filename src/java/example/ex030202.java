public class ex030202 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println(z);
    }
}

//x=11, y=19 y--로 값이 사용된 후 감소되어 z=31