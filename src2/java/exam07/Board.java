package src2.java.exam07;

public class Board {
    private String title;
    private String content;

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }
    public String getTitle() { return title; }
    public String getContent() { return content; } // ✅ 메서드명 수정
}
