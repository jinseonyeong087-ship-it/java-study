public class ex050105 {

    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 10;
        String var3 = "AB";
        String var4 = "AB";
        String var5 = new String("AB");

        System.out.println(var1 == var2);
        System.out.println(var1 != var2);     //var1 과 var2 가 같지 않으면 true
        System.out.println(var3 == var4);
        System.out.println(var3 != var5);
     //var3 는 문자열 상수 풀의 "AB", var5 는 new String("AB") → 힙에 새로 만든 객체. 내용은 같아도 참조(주소)가 다르므로 true (같지 않다)
        System.out.println(var4.equals(var5));
        //equals() 는 문자열의 내용을 비교
    }
}
