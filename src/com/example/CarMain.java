package com.example;  // 같은 패키지니까 import 필요 없음

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car("빨강", 100);
        myCar.drive();

        Car yourCar = new Car("파랑", 60);
        yourCar.drive();

        // 색상 변경
        yourCar.setColor("초록");
        yourCar.setSpeed(80);
        yourCar.drive();
    }
}
