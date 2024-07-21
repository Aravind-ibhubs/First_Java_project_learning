package learnAdvanced.learnOpps.abstractLearn;

public class User {
    public static void main(String[] args) {
        ElDevice b1 = new Bike();
        b1.start();

        ElDevice l1 = new Laptop();
        l1.call();
        l1.start();
    }
}
