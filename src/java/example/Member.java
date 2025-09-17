// public class ex060202 {     // ✅ 클래스 선언 (외부 클래스)
    
    // public class Member {   // ✅ 클래스 선언 (내부 클래스)
    //     String name;        // 필드
    //     String id;          // 필드
    //     String password;    // 필드
    //     int age;            // 필드
    // }
// }


public class Member {
    String name;
    String id;

    // 생성자 (이름 + 아이디 초기화)
    Member(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // 메서드: 정보 출력
    void printInfo() {
        System.out.println("이름: " + name + ", 아이디: " + id);
    }
}