public class ex050302 {

    public static void main(String[] args) {
        LoginResult result = LoginResult.FAIL_PASSWORD;
        if (result == LoginResult.SUCCESS) {
            System.out.println("로그인 성공!");
        } else if (result == LoginResult.FAIL_ID) {
            System.out.println("아이디가 존재하지 않습니다.");
        } else if (result == LoginResult.FAIL_PASSWORD) {
            System.out.println("비밀번호가 틀렸습니다.");
        }
    }
}

enum LoginResult {
    SUCCESS,        // 로그인 성공
    FAIL_ID,        // 아이디 불일치
    FAIL_PASSWORD   // 비밀번호 불일치
}