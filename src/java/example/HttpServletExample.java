// 하나의 파일에 넣어도 되도록 public 클래스는 예제 실행용 하나만 둡니다.
// 파일명: HttpServletExample.java

// (1) 추상 클래스: '틀'만 제공하고 구체 동작은 하위 클래스가 반드시 오버라이드하게 함
abstract class HttpServlet {
    // 추상 메소드: 실제 내용(바디)이 없고, 자식이 반드시 구현해야 함
    public abstract void service();
}

// (2) 구체 서블릿 #1: 로그인 기능
//    HttpServlet의 추상 메소드 service()를 '오버라이드'하여 실제 동작을 작성
class LoginServlet extends HttpServlet {
    @Override
    public void service() {
        // 문제에서 요구한 출력
        System.out.println("로그인합니다.");
    }
}

// (3) 구체 서블릿 #2: 파일 다운로드 기능
class FileDownloadServlet extends HttpServlet {
    @Override
    public void service() {
        // 문제에서 요구한 출력
        System.out.println("파일 다운로드합니다.");
    }
}

// (4) 실행 클래스 (public은 자바 파일당 하나만 가능하므로 여기에 부여)
public class HttpServletExample {

    public static void main(String[] args) {
        // 다형성(Polymorphism): 참조 타입은 부모(HttpServlet)로 통일하고
        // 실제 객체는 자식(LoginServlet, FileDownloadServlet)을 전달
        method(new LoginServlet());        // -> "로그인합니다."
        method(new FileDownloadServlet()); // -> "파일 다운로드합니다."
    }

    // (5) 공통 처리 메소드: 매개변수 타입을 부모(HttpServlet)로 두어
    //     어떤 자식이 오더라도 service()를 호출할 수 있게 함
    public static void method(HttpServlet servlet) {
        // 동적 바인딩: 실제 넘어온 객체의 오버라이드된 service()가 실행됨
        servlet.service();
    }
}
