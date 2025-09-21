package src2.java.exam02;

public class Anonymous {

    // ✅ 필드: 익명 자식 객체
    Vehicle field = new Vehicle() {

        @Override
        public void run() {
            System.out.println("자전거가 달립니다.");
        }
    };

    void method1() {
        // ✅ 로컬 변수: 익명 자식 객체
        Vehicle localVar = new Vehicle() {
            
            @Override
            public void run() {
                System.out.println("승용차가 달립니다.");
            }
        };

        localVar.run();  
    }

    void method2(Vehicle vehicle) {
        vehicle.run();
    }
}
