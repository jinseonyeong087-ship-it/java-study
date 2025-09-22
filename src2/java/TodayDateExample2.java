package src2.java;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TodayDateExample2 {
    public static void main(String[] args) {
        // Calendar 객체 생성
        Calendar cal = Calendar.getInstance();

        // Calendar → Date 변환
        Date date = cal.getTime();

        // 출력 형식 지정
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 E요일 H시 m분");

        // 출력
        System.out.println(sdf.format(date));
    }
}
