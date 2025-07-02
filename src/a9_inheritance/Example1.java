package a9_inheritance;

/*
학생의 정보와 성적을 관리하는 Student 클래스를 설계하세요.
요구사항:
 학번 (studentId) - 문자열
 이름 (name) - 문자열
 학년 (grade) - 정수

다음 메소드들을 구현하세요:
생성자(기본생성자, 모든 필드를 매개변수로 가지는 생성자)
각 필드의 getter/setter 메소드
*/
class Student {
    private String studentId;
    private String name;
    private int grade;

    public Student() {
    }

    public Student(String studentId, String name, int grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}


public class Example1 {
    public static void main(String[] args) {
        Student s1 = new Student("steve1234", "Steve Jones", 1);
        //s1.grade = 2; // 오류 grade가 private이므로 참조 불가
        s1.setGrade(2);
        System.out.println(s1); // Student{studentId='steve1234', name='Steve Jones', grade=2}

    }
}
