public class exam07 {
    public static void main(String[] args) {
        String name = "홍길동";

        if (name.equals("홍길동")) System.out.println("1");  
        // 문자열 비교 → equals() 사용 (✅ 매우 좋은 습관)

        if (name.equals(name)) System.out.println("2");
        // 자기 자신과 비교 → 항상 true → 사실상 의미 없음
    }
}
