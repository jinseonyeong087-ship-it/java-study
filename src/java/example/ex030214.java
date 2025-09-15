public class ex030214 {
    
    public static void main(String[] args) {
        int score = 85;
        String result = (!(score>90)) ? "가" : "나";
        // 직관적 형태 String result = (score <= 90) ? "가" : "나";
        System.out.println(result);
    }
}
