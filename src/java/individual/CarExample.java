public class CarExample {
    public static void main(String[] args) {
        String action = "";
        Car myCar = new Car();
        myCar.setColor("빨강");
        action = myCar.drive();
        System.out.println(action);

        Car yourCar = new Car("파랑");
        action = yourCar.drive();
        System.out.println(action);

        Car hisCar = new Car();
        action = hisCar.drive();
        System.out.println(action);

        // ⭐ 4) 색상 + 시동 상태 생성자 사용
        Car startCar = new Car("노랑", true); // 여기서 바로 출력됨
        System.out.println(startCar.drive());

        Car stopCar = new Car("검정", false); // 여기서 바로 출력됨
        System.out.println(stopCar.drive());
    }

}

class Car {
    private int id; // 필드(Field)
    private String color; // 필드(Field)
    private int speed; // 필드(Field)
    private boolean running; // ⭐ 시동 상태 저장 필드 추가

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isRunning() { return running; }
    public void setRunning(boolean running) { this.running = running; }

    // 1. 기본 생성자 (색상 없음)
    Car() {
        this.color = "무색"; // 기본값 지정
    }

    // 2. 매개변수 1개 생성자 (색상 지정)
    Car(String color) {
        this.color = color;
    }

    String drive() {
        return color + " 색의 자동차가 running";
    }

    // 3. 매개변수 2개 생성자 (색상 + 추가 옵션)
    Car(String color, boolean running) {
        this.color = color;
        if (running) {
            System.out.println(color + " 자동차 시동이 걸렸습니다.");
        } else {
            System.out.println(color + " 자동차는 시동이 꺼져 있습니다.");
        }
    }

    public class Tire {
    }

    public class Engine {
    }

    public static Car.Engine Engine() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Engine'");
    }

}
