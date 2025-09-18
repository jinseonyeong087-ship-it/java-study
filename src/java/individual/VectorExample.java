import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // 1. Vector 생성
        Vector<String> vector = new Vector<>();

        // 2. 요소 추가 (add)
        vector.add("사과");
        vector.add("바나나");
        vector.add("딸기");

        // 3. 특정 위치에 추가
        vector.add(1, "포도");  // 인덱스 1에 삽입

        // 4. 요소 읽기 (get)
        System.out.println("첫 번째 과일: " + vector.get(0));

        // 5. 반복문으로 전체 출력
        System.out.println("전체 과일 목록:");
        for (String fruit : vector) {
            System.out.println("- " + fruit);
        }

        // 6. 삭제 (remove)
        vector.remove("바나나");
        System.out.println("바나나 삭제 후: " + vector);

        // 7. 크기(size) 확인
        System.out.println("현재 요소 개수: " + vector.size());
    }
}
