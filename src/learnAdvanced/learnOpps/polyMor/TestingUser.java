package learnAdvanced.learnOpps.polyMor;

//import learnAdvanced.learnOpps.abstractLearn.ElDevice;

public class TestingUser {
    public static void main(String[] args) {
        TestCompile tc1 = new TestCompile();
        tc1.add();
        tc1.add(23, 34);
        tc1.add("Adding ", 4);
        tc1.add(45, " Type is exchanged");
        tc1.add(24, 54, 24); // method overloading

        TestRun tr = new TestRun();
        tr.combineStr("erect", "seed");;
    }
}
