import java.util.HashMap;

public class StudentExample {

    public static void main(String[] args) {

        HashMap<Student, String> hashMap = new HashMap<>();

        hashMap.put(new Student("1"), "95");

        // 같은 studentNum이면 equals()가 true, hashCode()도 같아서 검색 성공
        String score = hashMap.get(new Student("1"));
        System.out.println("1번 학생의 총점: " + score);  // 95 출력
    }
}
