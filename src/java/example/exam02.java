public class exam02 {

    public static void main(String[] args) {
        int res1 = 10000;  // 참가자 수
        int res2 = 10000;  // 1인당 금액
        int res3 = res1 * res2;  // 총 금액

        // String.format을 사용해 출력 메시지 작성
        String message = String.format(
            "마라톤 참가자 %,d명이 %,d원씩 내서 총 %,d원을 냈습니다.",
            res1, res2, res3
        );

        System.out.println(message);

        String str = "10000000";
        int val = Integer.parseInt(str,10);

       System.out.println(val);

       String str1 = String.valueOf(20000);
       System.out.println(str1.length());
    }
}
