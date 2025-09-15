import java.util.Calendar;

public class EnumExam {

    public static void main(String[] args) {
        WeekDay today = null;
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch(week) {
            case 1:
            today = WeekDay.SUNDAY; break;

            case 2:
            today = WeekDay.MONDAY; break;

            case 3:
            today = WeekDay.TUESDAY; break;

            case 4:
            today = WeekDay.WEDNESDAY; break;

            case 5:
            today = WeekDay.THURSDAY; break;

            case 6:
            today = WeekDay.FRIDAY; break;

            case 7:
            today = WeekDay.SATURDAY; break;
        }

        System.out.println("오늘 요일: " + today);

        if (today == WeekDay.MONDAY) {
            System.out.println("월요일에는 자바 공부합니다.");
        } else {
            System.out.println("오늘은 놀아요");
        }
    }
    
}
