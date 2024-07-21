package learnAdvanced.learnOpps.encapsulation;

public class Test {
    private int  rollNumber;
    private String studentName;
    private boolean isAttended;

    public Test(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setAttendence(boolean flag) {
        if (!isAttended) {
            this.isAttended = flag;
            System.out.printf("The student : %d attendance has been updated \n", rollNumber);
        }
    }

    public boolean getAttendance() {
        System.out.println("Teacher access the student data.");
        return this.isAttended;
    }
}
