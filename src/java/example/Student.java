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
        // 동일 객체 참조 시 true
        if (this == obj) return true;
        // null이거나 클래스 타입 다르면 false
        if (obj == null || getClass() != obj.getClass()) return false;
        
        // 다운캐스팅 후 필드 비교
        Student other = (Student) obj;
        return studentNum != null && studentNum.equals(other.studentNum);
    }

    @Override
    public int hashCode() {
        return (studentNum == null) ? 0 : studentNum.hashCode();
    }
}
