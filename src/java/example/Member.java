// public class ex060202 {     // ✅ 클래스 선언 (외부 클래스)
    
    public class Member {   // ✅ 클래스 선언 (내부 클래스)
        String name;        // 필드
        String id;          // 필드
        String password;    // 필드
        int age;            // 필드
    }
// }


//별도로 파일 분리를 하면 읽기 쉽고, 유지보수하기 좋다.

// Member.java 파일
// public class Member {
//     String name;
//     String id;
//     String password;
//     int age;
// }


// ex060202.java 파일
// public class ex060202 {
//     public static void main(String[] args) {
//         Member m = new Member();  // 외부에서 Member 클래스 사용 가능
//         m.name = "홍길동";
//     }
// }
