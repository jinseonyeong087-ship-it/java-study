package java.example2;

public class MemberService {
    String id;
    String password;

    // 로그인 메소드
    boolean login(String id, String password) {
        if (id.equals("hong") && password.equals("12345")) {
            this.id = id;             // 로그인한 id 저장
            this.password = password; // 로그인한 비밀번호 저장
            return true;              // 로그인 성공
        } else {
            return false;             // 로그인 실패
        }
    }

    // 로그아웃 메소드
    void logout(String id) {
        if (this.id != null && this.id.equals(id)) {
            System.out.println("로그아웃 되었습니다.");
            this.id = null;
            this.password = null;
        } else {
            System.out.println("현재 로그인한 사용자가 아닙니다.");
        }
    }
}
