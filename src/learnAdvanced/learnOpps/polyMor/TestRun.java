package learnAdvanced.learnOpps.polyMor;

//import learnAdvanced.learnOpps.abstractLearn.Mobile;

public class TestRun extends TestCompile{
    public void app() {
        System.out.println("Run time moripism of app method");
    }   

    public void call() {
        System.out.println("Run time moripism of call method");
    }

    public void start() {
        System.out.println("Runing of code");
    }

    @Override
    public void combineStr(String a , String b) {
        System.out.printf("Function is calling of para %s - %s", a,b);
    }
}
