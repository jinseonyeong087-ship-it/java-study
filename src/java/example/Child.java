// 자식 클래스
public class Child extends Parent {
    private String name; // Child만의 고유 필드

    // 기본 생성자
    public Child() {
        // this() → 같은 클래스의 다른 생성자 호출
        this("홍길동"); // Child(String name) 호출
        System.out.println("Child() call");
    }

    // 매개변수가 있는 생성자
    public Child(String name) {
        // super() → 부모 클래스의 기본 생성자 호출 (컴파일러가 자동 추가)
        this.name = name;
        System.out.println("Child(String name) call");
    }
}