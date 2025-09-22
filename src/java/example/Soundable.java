// Soundable.java
// 인터페이스: 소리를 반환하는 sound() 메소드만 규격으로 정의
public interface Soundable {
    String sound();
}

// Cat.java
// Soundable 인터페이스 구현 → 반드시 sound() 메소드를 재정의
class Cat implements Soundable {
    @Override
    public String sound() {
        return "야옹";  // 고양이 울음소리
    }
}

// Dog.java
// Soundable 인터페이스 구현 → 반드시 sound() 메소드를 재정의
class Dog implements Soundable {
    @Override
    public String sound() {
        return "멍멍";  // 강아지 울음소리
    }
}


