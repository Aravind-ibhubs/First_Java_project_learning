package learnAdvanced.learnStatic;

public class LearnStatic1 {
    public static void main(String[] args) {
        System.out.println(LearnStatic.j);
        LearnStatic.printStaticMethod();
        
        LearnStatic test1 = new LearnStatic();
        test1.printNonStatic();
        new LearnStatic1().Test();
    }

    public void Test(){
        // main(null); 
        // We can call static method from non static methods
        // we did not call non static methods from static method with initializations
    }
}
