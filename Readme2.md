# 혼공자 확인 문제 5~8

## [용어정리 2](https://github.com/jinseonyeong087-ship-it/java-study/blob/main/Terminology2.md)  


## 05-01-01
- 참조 타입
  - 객체의 주소값을 저장할 수 있는 타입  
  - 클래스, 인터페이스, 배열 타입이 있다. (기본 타입 int, double, boolean 등은 값 자체를 저장하는 기본 타입)

## 05-01-02
- JVM 메모리 구조 개요
  - 메서드 영역 (Method Area / MetaSpace) : 클래스의 바이트코드, static 변수, 상수, 메서드 정보가 여기에 저장
  - 힙 영역 (Heap) : new 키워드로 만든 객체와 배열 저장
  - 스택 영역 (Stack) : 지역변수, 매개변수 저장
  - PC 레지스터 & 네이티브 메서드 스택

## 05-01-03
- String 타입
  - 문자열(문자들의 연속)을 표현하는 클래스
  - 참조타입 (new로 객체를 만들거나 문자열 리터럴을 참조)
  - java.lang.String 클래스에 속해 있어서 import 없이 사용 가능

## 05-01-04
- 참조 변수
  - 객체의 주소값(참조)을 저장하는 변수 (참조변수는 힙(Heap)에 있는 객체의 위치(주소)를 저장)
  - 같은 참조변수를 복사하면 같은 객체를 가리킴
  - null로 초기화할 수 있음 (아무 객체도 참조하지 않음)

## 05-01-05
[코드실행](https://github.com/jinseonyeong087-ship-it/java-study/blob/main/src/java/example/ex050105.java)  
![alt text](img/image-35.png)  
실행 결과  
![alt text](img/image-36.png)
