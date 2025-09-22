package src2.java.exam08;

public class Student {
    public int studentNum;
    public String name;

    public Student (int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
public int hashCode() {
    // 학번(studentNum)을 기반으로 해시코드 생성
    return Integer.hashCode(studentNum);
}

@Override
public boolean equals(Object obj) {
    // 같은 객체 참조 시 true
    if (this == obj) return true;

    // null이거나 클래스 타입이 다르면 false
    if (obj == null || getClass() != obj.getClass()) return false;

    // 다운캐스팅 후 학번 비교
    Student other = (Student) obj;
    return this.studentNum == other.studentNum;
}

}
