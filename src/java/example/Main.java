// Main.java  (하나의 파일에 전부 넣어서 컴파일/실행하면 됩니다.)
//
// 핵심 포인트
// 1) 오버라이딩된 메서드는 "실제 객체의 타입"에 따라 실행된다(동적 바인딩).
// 2) Controller.service의 "참조 타입"은 MemberService 이지만,
//    거기에 AService 인스턴스를 넣어도 오버라이딩된 login()이 호출된다.

class Service {
    // 최상위(부모) 타입의 기본 구현
    public void login() {
        System.out.println("로그인");
    }
}

class MemberService extends Service {
    // 부모(Service)의 login()을 재정의(오버라이딩)
    @Override
    public void login() {
        System.out.println("멤버 로그인");
    }

    public void logout(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'logout'");
    }
}

class AService extends MemberService {
    // MemberService의 login()을 다시 재정의
    @Override
    public void login() {
        System.out.println("A 로그인");
    }
}

class Controller {
    // 컨트롤러가 사용할 서비스(참조 타입은 MemberService)
    public MemberService service;

    // 런타임에 어떤 하위 타입이든 주입 가능 (MemberService, AService 등)
    public void setService(MemberService service) {
        this.service = service;
    }
}

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        // (1) MemberService를 주입
        controller.setService(new MemberService());
        controller.service.login();   // ✅ 출력: 멤버 로그인

        // (2) AService를 주입 (MemberService의 하위 타입)
        controller.setService(new AService());
        controller.service.login();   // ✅ 출력: A 로그인
    }
}
