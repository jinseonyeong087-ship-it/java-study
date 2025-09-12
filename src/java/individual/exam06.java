import java.util.UUID;

public class exam06 {
    
    public class BreakExample {
        public static void main(String[] args) {
            while (true) {
                int num = (int) (Math.random() * 6) + 1;
                System.out.println(num);
                if(num == 6) {
                    break;
                }
            }
            System.out.println("프로그램 종료");
        }
    
        
    }



    public static void main(String[] args) {
        UUID id;
        String prefix;
        int count = 0; // 시도 횟수 카운트

        while (true) {
            id = UUID.randomUUID();   // 새로운 UUID 생성
            count++;                  // 시도 횟수 증가
            prefix = id.toString().substring(0, 2); // 앞 2자리 추출

            try {
                int num = Integer.parseInt(prefix, 16); // 16진 → 10진 변환
                if (num >= 0 && num <= 99) { // 조건 만족
                    System.out.println("=== 조건 만족! while 탈출 ===");
                    System.out.println("총 시도 횟수: " + count);
                    System.out.println("UUID: " + id);
                    System.out.println("앞 두자리(16진): " + prefix + ", 10진수: " + num);
                    break; // while 탈출
                }
            } catch (NumberFormatException e) {
                // a~f로 시작해서 숫자 변환 불가 시 그냥 무시
            }
        }

        System.out.println("while문 종료!");
    }
}
