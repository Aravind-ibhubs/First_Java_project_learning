package learnAdvanced.learnOpps.inheritence;

public class Admin extends Developer {
    public void managing() {
        System.out.println("Managing Code");
        super.read();
    }

    public void read() {
        System.out.println("Read in admin");
    }
}
