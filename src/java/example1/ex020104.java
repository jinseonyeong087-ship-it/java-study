public class ex020104 {
    public static void main(String[] args) {
        int v1 = 0;  
        if (true) {
            int v2 = 0;
            int v3 = 0;
            if (true) {
                v1 = 1;
                v2 = 1;
                v3 = 1;
            }
            v1 = v2 + v3;
            // 변수는 변수가 선언된 중괄호 {} 안에서만 사용 가능
        }
        System.out.println(v1);
    }
}

  
  