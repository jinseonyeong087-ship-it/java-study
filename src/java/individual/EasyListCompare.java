import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EasyListCompare {
    public static void main(String[] args) {
        int N = 100_000; // 10만 개 데이터

        // ============================
        // 1. ArrayList 테스트
        // ============================
        List<Integer> arrayList = new ArrayList<>();

        long start = System.currentTimeMillis(); // 시작 시간
        // 뒤에 계속 추가
        for (int i = 0; i < N; i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList 추가 시간: " + (end - start) + "ms");

        // 중간에서 1000번 삽입
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList 중간삽입 시간: " + (end - start) + "ms");

        // 임의 접근 10000번
        start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 10000; i++) {
            sum += arrayList.get(i); // 인덱스로 바로 접근 (빠름)
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList get() 시간: " + (end - start) + "ms");

        // ============================
        // 2. LinkedList 테스트
        // ============================
        List<Integer> linkedList = new LinkedList<>();

        start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            linkedList.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList 추가 시간: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList 중간삽입 시간: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        sum = 0;
        for (int i = 0; i < 10000; i++) {
            sum += linkedList.get(i); // 인덱스로 찾기 (느림)
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList get() 시간: " + (end - start) + "ms");
    }
}
