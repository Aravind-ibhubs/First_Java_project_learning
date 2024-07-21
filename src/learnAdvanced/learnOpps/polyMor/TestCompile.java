package learnAdvanced.learnOpps.polyMor;

public class TestCompile {
    public void add() {
        System.out.println("Addition");
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void add(String a, int b) {
        System.out.println(a + b);
    }

    public void add(int b, String a) {
        System.out.println(b + a);
    }

    public void combineStr(String a, String b) {
        System.out.println(a + " " + b);
    }
}
