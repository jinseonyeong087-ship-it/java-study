
public class StudentEx {
    public static void main(String[] args) {
        Student s1 = new Student("홍길동");
        Student s2 = new Student("김영희");
        Student s3 = new Student("이철수");

        System.out.println("전체 학생 수: " + Student.getCount()); // 3 출력
    }
}