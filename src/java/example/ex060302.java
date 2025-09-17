public class ex060302 {

    public static void main(String[] args) {
        // Member 객체 생성 + 생성자 호출
        Member user1 = new Member("홍길동", "hong");
        user1.printInfo();  // 생성된 값 확인
    }
}


 class Member {
    String name;
    String id;
    public int age;

    // 생성자 (이름 + 아이디 초기화)
    Member(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Member() {
        //TODO Auto-generated constructor stub
    }

    // 메서드: 정보 출력
    void printInfo() {
        System.out.println("이름: " + name + ", 아이디: " + id);
    }
}
