public class LabelBreakExample { 
    // 이 클래스의 이름, 메서드 시그니처, 바이트코드 등은
    // 👉 Method Area(메서드 영역)에 저장

    public static void main(String[] args) {
        // main 메서드 호출 시 JVM은
        // 👉 Stack Area(스택 영역)에 main 메서드의 스택 프레임을 생성
        // args 참조 변수도 스택 프레임 안에 저장됨
        // 실제 args 배열 객체는 👉 Heap Area(힙)에 생성

        outer: // <-- 라벨은 바이트코드에 남지만 메모리에서 별도의 공간 차지 X
        for (int i = 2; i <= 9; i++) {
            // i 변수는 👉 Stack Area(스택 프레임) 안에 저장

            System.out.println("=== " + i + "단 ===");
            // System.out은 PrintStream 타입의 static 필드 → 👉 Method Area에 저장
            // new PrintStream 객체 자체는 👉 Heap Area에 있음
            // println() 메서드 호출 시 → 스택 프레임의 operand stack 사용

            for (int j = 1; j <= 9; j++) {
                // j 변수도 👉 Stack Area(스택 프레임) 안에 저장
                int result = i * j;
                // result 역시 👉 Stack Area에 저장

                System.out.println(i + " x " + j + " = " + result);
                // println 호출 과정은 위와 동일

                if (result >= 20) {
                    System.out.println("조건 만족! 바깥 for문까지 탈출");
                    break outer; 
                    // break outer → JVM이 PC Register(프로그램 카운터)를
                    // 바깥 for문의 끝으로 점프하도록 바꿔줌
                }
            }
            System.out.println(); // 줄바꿈
        }

        System.out.println("모든 반복문 종료!");
        // main 메서드 종료 시 → 스택 프레임 제거, 지역변수(i, j, result)도 사라짐
    }
}
