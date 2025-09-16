public class ex030203 {
    public static void main(String[] args) {
        // boolean stop = true;
        // while (!stop) {
        // System.out.println(stop);
        // } 
        // } 내가 만든 코드 이렇게 하면 시작도 안하고 끝남

        boolean stop = false;
        while (!stop) {
            System.out.println("stop");
            // 어떤 조건에서 멈춤 결정:
            stop = true; // ← true 되는 순간 다음 반복부터 종료
        }
    }
}
