// 자식 클래스 (스노우 타이어)
public class SnowTire extends Tire {
    
    // @Override → 부모의 run() 메서드를 재정의 (오버라이딩)
    @Override
    public void run() {
        System.out.println("스노우 타이어가 굴러갑니다.");
    }
}