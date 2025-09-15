public class CarExample {

    public static void main(String[] args) {
        // 1) 기본 생성자 → 나중에 색상 지정
        Car myCar = new Car();
        myCar.color = "빨강";
        System.out.println(myCar.drive());

        // 2) 색상 지정 생성자 사용 → 바로 색상 설정
        Car yourCar = new Car("파랑");
        System.out.println(yourCar.drive());

        // 3) 다른 색상도 가능
        Car greenCar = new Car();
        System.out.println(greenCar.drive());
    }
}

class Car {
    String color;

    // ① 기본 생성자
    Car() {
        this.color = "검정";  // 기본 색상 지정
    }

    // ② 색상 지정 생성자 (오버로딩)
    Car(String color) {
        this.color = color;
    }

    String drive() {
        return color + "색의 자동차가 running";
    }
}
