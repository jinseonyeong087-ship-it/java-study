package src2.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            int score = map.get(key);
            totalScore += score; // 합계 구하기
            if (score > maxScore) { // 최고 점수 갱신
                maxScore = score;
                name = key; // 최고 점수 아이디 저장
            }
        }

        // 출력
        int avg = totalScore / map.size();
        System.out.println("평균점수: " + avg);
        System.out.println("최고점수: " + maxScore);
        System.out.println("최고점수를 받은 아이디: " + name);
    }
}
