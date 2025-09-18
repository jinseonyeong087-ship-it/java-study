import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 생성 (문자열 저장)
        HashSet<String> fruits = new HashSet<>();

        // 값 추가
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // 중복 → 무시됨

        // 크기 출력
        System.out.println("저장된 과일 개수: " + fruits.size());  //3

        // 전체 요소 출력
        System.out.println("저장된 과일: " + fruits);

        // 특정 값 포함 여부 확인
        if (fruits.contains("Banana")) {
            System.out.println("Banana가 있습니다.");
        }

        // 값 삭제
        fruits.remove("Orange");
        System.out.println("Orange 삭제 후: " + fruits);

        // 모든 값 반복 출력
        System.out.println("=== 반복문으로 출력 ===");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 전체 비우기
        fruits.clear();
        System.out.println("비운 후: " + fruits);
    }
}
