// 실행 클래스
public class SnowTireExample {
    
    public static void main(String[] args) {
        // 1. SnowTire 객체 생성
        SnowTire snowTire = new SnowTire();

        // 2. 업캐스팅 (자동 타입 변환)
        //    SnowTire 타입 객체를 Tire 타입 변수에 대입
        //    → Tire 타입으로 보이지만 실제로는 SnowTire 객체가 들어있음
        Tire tire = snowTire;

        // 3. 메서드 호출
        snowTire.run(); // 자식 참조 변수 → 자식 run() 실행
        tire.run();     // 부모 참조 변수지만, 실제 객체는 SnowTire → 자식 run() 실행 (다형성)
    }
}