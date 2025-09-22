package src2.java;

import java.util.Date;
import java.text.SimpleDateFormat;

public class TodayDateExample {
    public static void main(String[] args) {
        // 현재 날짜와 시간 구하기
        Date today = new Date();

        // 출력 형식 지정
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 E요일 H시 m분");

        // 변환 후 출력
        String result = sdf.format(today);
        System.out.println(result);
    }
}
