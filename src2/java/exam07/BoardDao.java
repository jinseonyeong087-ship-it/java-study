package src2.java.exam07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    //코드작성
    public List<Board> getBoardList() {
        List<Board> list = new ArrayList<>();
        list.add(new Board("제목1", "내용1"));
        list.add(new Board("제목2", "내용2"));
        list.add(new Board("제목3", "내용3"));
        return list;
    }
}
