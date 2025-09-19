// 부모 클래스
public class Parent {
    // 필드: 모든 인스턴스가 가질 nation (국가)
    public String nation;

    // 기본 생성자
    public Parent() {
        // this() → 같은 클래스의 다른 생성자 호출
        this("대한민국"); // Parent(String nation) 호출
        System.out.println("Parent() call");
    }

    // 매개변수가 있는 생성자
    public Parent(String nation) {
        this.nation = nation; // nation 필드 초기화
        System.out.println("Parent(String nation) call");
    }
}