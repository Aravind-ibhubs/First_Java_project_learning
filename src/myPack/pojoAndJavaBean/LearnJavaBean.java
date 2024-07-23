package myPack.pojoAndJavaBean;

import java.io.Serializable;

/*
 * It should implement serialization.
 * It should have no-args constructor
 * All variable should privates
 * It should have getter and setter to access variables 
 */

public class LearnJavaBean implements Serializable{
    private int rollNumber;
    private String studentName;
    private int grade;

    public LearnJavaBean() {
        System.out.println("No args is called");
    }

    public LearnJavaBean(int number, String name) {

    }

    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }


}
