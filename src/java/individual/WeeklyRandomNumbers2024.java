import java.util.*;

public class WeeklyRandomNumbers2024 {
    public static void main(String[] args) {
        Random rand = new Random();

        int weeks = 53; // 2024년 53주 처리
        int numbersPerWeek = 5;

        // 번호 등장 횟수를 세기 위한 Map
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int week = 1; week <= weeks; week++) {
            Set<Integer> picked = new LinkedHashSet<>();

            // 주차별로 5개 뽑기
            while (picked.size() < numbersPerWeek) {
                int num = rand.nextInt(99) + 1; // 1~99
                picked.add(num);   // ← 중복이면 Set이 자동으로 무시

                // frequency Map 업데이트
                frequency.put(num, frequency.getOrDefault(num, 0) + 1);
            }

            System.out.printf("▶ %2d주차 번호: %s%n", week, picked);
        }

        // --- 등장 횟수로 정렬 ---
        List<Map.Entry<Integer, Integer>> sorted = new ArrayList<>(frequency.entrySet());
        sorted.sort((a, b) -> b.getValue().compareTo(a.getValue())); // 내림차순 정렬

        // --- 최다 등장 번호 추출 ---
        int maxCount = sorted.get(0).getValue();
        List<Integer> mostFrequent = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : sorted) {
            if (entry.getValue() == maxCount) {
                mostFrequent.add(entry.getKey());
            } else {
                break; // maxCount보다 작아지면 종료
            }
        }

        System.out.println("\n=== 가장 많이 나온 번호 ===");
        System.out.printf("%s (총 %d회 등장)\n", mostFrequent, maxCount);
    }
}
