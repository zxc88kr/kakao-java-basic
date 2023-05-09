package ch02;

public class Student implements Cloneable {
    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return studentNum + ", " + studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student std = (Student)obj;
            if (this.studentName == std.studentName) return true;
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.studentNum;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}