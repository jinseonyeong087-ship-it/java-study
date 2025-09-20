// SoundableExample.java
public class SoundableExample {
    // 매개변수 타입이 Soundable → Cat, Dog 어떤 구현체든 받을 수 있음
    private static void printSound(Soundable soundable) {
        // 다형성: 실제 들어온 객체(Cat/Dog)에 따라 sound() 실행
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
        // Cat 객체 전달 → "야옹"
        printSound(new Cat());
        // Dog 객체 전달 → "멍멍"
        printSound(new Dog());
    }
}