package myPack;

import myPack.pojoAndJavaBean.LearnJavaBean;
import myPack.pojoAndJavaBean.LearnPojo;

public class MyPackageClass {
    public static void main(String[] args) {
        LearnJavaBean lj1 = new LearnJavaBean();
        lj1.setRollNumber(420);
        lj1.setStudentName("Ramesh");
        lj1.setGrade(6);

        LearnJavaBean lj2 = new LearnJavaBean();
        lj2.setRollNumber(780);
        lj2.setStudentName("Rame shoud");
        lj2.setGrade(5);

        LearnJavaBean lj3 = new LearnJavaBean();
        lj3.setRollNumber(800);
        lj3.setStudentName("Bemesh");
        lj3.setGrade(4);

        LearnJavaBean[] employee = new LearnJavaBean[] {lj1, lj2, lj3};
        
        for(LearnJavaBean emp: employee) {
            System.out.println(emp.getRollNumber());
        }
    }

    public void callPojoFunction() {
        LearnPojo lp1 = new LearnPojo();
        lp1.setId(85);
        lp1.name = "Gopi";
        lp1.salary = 5623.1;

        LearnPojo lp2 = new LearnPojo();
        lp2.setId(78);
        lp2.name = "Praneeth";
        lp2.salary = 56001;

        LearnPojo lp3 = new LearnPojo();
        lp3.setId(10);
        lp3.name = "Vijay";
        lp3.salary = 32000.1;  

        LearnPojo[] employee = new LearnPojo[] {lp1, lp2, lp3};
        
        for(LearnPojo emp: employee) {
            System.out.println(emp.getId());
        }
    }

    public void getDataTypeMinandMax() {
        byte b = 50;
        short s = 32000;
        int i = 2154689;
        long l = 986857456264l;
        float f = 8.23f;
        double d1 = 88.23564;
        char c = 'v';
        boolean b1 = true;
        boolean b2 = false;

        // Minimum and maximum values of data types
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
    }
}
