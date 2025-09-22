public class Student {
    // 정적 변수: 모든 Student 객체가 공유
    private static int count = 0;

    private String name;

    // 생성자
    public Student(String name) {
        this.name = name;
        count++; // 학생 객체가 생성될 때마다 count 증가
    }

    public String getName() {
        return name;
    }

    // 정적 메소드: 객체 생성 없이도 호출 가능
    public static int getCount() {
        return count;
    }
}



