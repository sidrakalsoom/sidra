package jtable;


public class Student {
    private String studentRollNum;
    private String studentName;
    private String program;

    public Student(String studentRollNum, String studentName, String program) {
        this.studentRollNum = studentRollNum;
        this.studentName = studentName;
        this.program = program;
    }

    public String getStudentRollNum() {
        return studentRollNum;
    }

    public void setStudentRollNum(String studentRollNum) {
        this.studentRollNum = studentRollNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    
    
}
