import java.util.Scanner;

public class ex030211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("아이디: ");
        String name = sc.nextLine();

        System.out.print("비밀번호: ");
        String srtPassword = sc.nextLine();
        int password = Integer.parseInt(srtPassword);

        if ("java".equals(name)) {
            if (password == 12345) {
                System.out.println("로그인 성공");
            } else {
                System.out.println("로그인 실패:패스워드가 틀림");
            }
        } else {
            System.out.println("로그인 실패:아이디 존재하지 않음");
        }
    }

}
