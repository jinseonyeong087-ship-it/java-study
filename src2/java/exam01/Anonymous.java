package src2.java.exam01;

public class Anonymous {

    // ✅ 필드: 익명 자식 객체
    Worker field = new Worker() {
        @Override
        public void start() {
            System.out.println("디자인을 합니다.");
        }
    };

    void method1() {
        // ✅ 로컬 변수: 익명 자식 객체
        Worker localVar = new Worker() {
            @Override
            public void start() {
                System.out.println("개발을 합니다.");
            }
        };

        localVar.start();  
    }

    void method2(Worker worker) {
        worker.start();
    }
}
