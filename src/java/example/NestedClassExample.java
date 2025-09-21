public class NestedClassExample {
    public static void main(String[] args) {
        // 1. Car 인스턴스 생성
        Car myCar = new Car();

        // 2. 인스턴스 멤버 클래스 객체 생성 (Car 인스턴스를 통해 new)
        Car.Tire tire = myCar.new Tire();

        // 3. 정적 멤버 클래스 객체 생성 (Car 인스턴스 없이 바로 new 가능)
        Car.Engine engine = new Car.Engine();
    }
}