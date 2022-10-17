package SAD.Week1;

public class EmrollmentClass {
    private Student student;
    private Course course;
    private int attendanceMark;
    private float midtermMark;
    private float finalMark;

    public EmrollmentClass(Student student, Course course, int attendanceMark, float midtermMark, float finalMark) {
        this.student = student;
        this.course = course;
        this.attendanceMark = attendanceMark;
        this.midtermMark = midtermMark;
        this.finalMark = finalMark;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getAttendanceMark() {
        return attendanceMark;
    }

    public void setAttendanceMark(int attendanceMark) {
        this.attendanceMark = attendanceMark;
    }

    public float getMidtermMark() {
        return midtermMark;
    }

    public void setMidtermMark(float midtermMark) {
        this.midtermMark = midtermMark;
    }

    public float getFinalMark() {
        return finalMark;
    }

    public void setFinalMark(float finalMark) {
        this.finalMark = finalMark;
    }

    public String toString() {
        double overall = ( this.attendanceMark + this.midtermMark * 3 + this.finalMark * 6 ) / 10;
        return "Student " + this.student.getStudentName()
                + " whose id is " + this.student.getStudentId() +
                " got attendance mark = " + this.attendanceMark +
                ", midterm mark = " + this.midtermMark +
                ", final mark = " + this.finalMark +
                ". Overall is " + overall;
    }

    public static void main(String[] args) {
        Student student1 = new Student("2001040168", "Quan");
        Student student2 = new Student("2001040212", "Trung");
        Course course1 = new Course("61FIT3SE1", "Software Engineer 1");
        Course course2 = new Course("61FIT3SAD", "System analysis design");
        EmrollmentClass class1 = new EmrollmentClass(student1, course1, 10, 6.0f, 8.5f);
        System.out.println(class1.toString());
    }
}
