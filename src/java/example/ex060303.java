import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ex060303 {

    public static class Board {
        String title;
        String content;
        String writer;
        String date;
        int hitcount;

        // 1) 최종(풀) 생성자: 모든 필드를 한 곳에서 초기화 - 메인 생성자
        Board(String title, String content, String writer, String date, int hitcount) {
            this.title = title;
            this.content = content;
            this.writer = writer;
            this.date = date;
            this.hitcount = hitcount;
        }

        // 2) hitcount 기본값 0
        Board(String title, String content, String writer, String date) {
            this(title, content, writer, date, 0);
        }

        // 3) date 기본값: 현재 컴퓨터 날짜/시간
        Board(String title, String content, String writer) {
            this(title, content, writer, now());
        }

        // 4) writer 기본값: "로그인한 회원아이디"
        Board(String title, String content) {
            this(title, content, loginId(), now());
        }

        // --- 헬퍼 (예시용) ---
        private static String loginId() {
            return "로그인한 회원아이디";
        }

        private static String now() {
            return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        }
    }

    // 사용 예시
    public static void main(String[] args) {
        Board b1 = new Board("제목1", "내용1");
        Board b2 = new Board("제목2", "내용2", "lee");
        Board b3 = new Board("제목3", "내용3", "park", "2025-09-17 13:10:00");
        Board b4 = new Board("제목4", "내용4", "kim", "2025-09-17 13:20:00", 12);

        System.out.println(b1.title + ", " + b1.writer + ", " + b1.date + ", " + b1.hitcount);
        System.out.println(b2.title + ", " + b2.writer + ", " + b2.date + ", " + b2.hitcount);
        System.out.println(b3.title + ", " + b3.writer + ", " + b3.date + ", " + b3.hitcount);
        System.out.println(b4.title + ", " + b4.writer + ", " + b4.date + ", " + b4.hitcount);
    }
}
