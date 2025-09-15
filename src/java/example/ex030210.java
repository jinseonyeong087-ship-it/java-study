public class ex030210 {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 3;
        int var3 = 14;
        double pi = var2 + (var3 / 100.0);  // 3.14 (100.0으로 (자동 형변환) 나눠 실수화)
        double var4 = pi * var1 * var1;   //π * r^2
        System.out.println("원의 넓이: " + var4);
    }
    
}



// var3는 14 (int), 100.0은 double → 자동 형변환으로 14도 double이 되고
// 14 / 100.0 = 0.14 (실수)

// var2 + (그 결과)

// var2는 3 (int), 0.14는 double → 3도 double로 변환되어
// 3 + 0.14 = 3.14

// 즉, pi에는 3.14