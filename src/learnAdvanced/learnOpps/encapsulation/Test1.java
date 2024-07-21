package learnAdvanced.learnOpps.encapsulation;

public class Test1 {
    public static void main(String[] args) {
        Test t1 = new Test(63);
        Test1.show(t1);

        System.out.println("\n Before updation");
        t1.setAttendence(true);
        t1.setStudentName("Hari");

        Test1.show(t1);
    }

    public static void show(Test t1) {
        System.out.printf("Roll number : %d \nName : %s \nAttendence : %b" , 
        t1.getRollNumber(),t1.getStudentName(),t1.getAttendance());
    }
}
