public class ex020309 {
    public static void main(String[] args) {
        long var1 = 2L;
        float var2 = 1.8f;
        double var3 = 2.5;
        String var4 = "3.9";
        int result = (int)(var1 + var2 + var3) + (int)Double.parseDouble(var4);
        // parseInt → “정수(int)”
        // parseDouble → “실수(double)”
        // 문자열 안에 소수점(.)이 있으면 → Double이나 Float 사용
        System.out.println(result);
    }
    
}
