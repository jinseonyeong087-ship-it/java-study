import java.util.ArrayList;
import java.util.List;

public class ex060103 {

    public class Member {
        List<String> names = new ArrayList<>();  // ✅ 여러 이름 저장할 리스트

        // 생성자: 초기 이름 추가
        Member(String name) {
            names.add(name);
        }

        // 새로운 이름 추가 메서드
        void addName(String name) {
            names.add(name);
        }

        // 전체 이름 출력 메서드
        void printNames() {
            System.out.println("회원 이름: " + names);
        }
    }

    public static void main(String[] args) {
        ex060103 outer = new ex060103();

        Member m1 = outer.new Member("홍길동"); // 첫 번째 이름
        m1.addName("이순신");                 // 이름 추가
        m1.addName("강감찬");                 // 이름 추가
        m1.addName("혼공자");

        m1.printNames();  // 출력 → 등록된 이름들: [홍길동, 이순신, 강감찬]
    }
}
