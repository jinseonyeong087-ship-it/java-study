package com.example; // 폴더 경로와 반드시 일치해야 함

public class Car {
    private String color;
    private int speed;

    // 생성자
    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    // 메서드
    public void drive() {
        System.out.println(color + " 자동차가 " + speed + "km/h로 달립니다.");
    }

    // Getter/Setter
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
}
