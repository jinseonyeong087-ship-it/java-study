package src2.java;

public class Student {
    private String studentNum;

    public Student(String studentNum) {
        this.studentNum = studentNum;
    }
    public String getStudentNum() {
        return studentNum;
    }

    @Override
public boolean equals(Object obj) {
    if (this == obj) return true;              // 같은 객체면 true
    if (obj == null || getClass() != obj.getClass()) return false; // 타입 다르면 false
    Student other = (Student) obj;             // 다운캐스팅
    return studentNum != null && studentNum.equals(other.studentNum);
}

@Override
public int hashCode() {
    return (studentNum == null) ? 0 : studentNum.hashCode();
}
}
