package learnAdvanced.learnOpps.interfacesL;

public class HP implements Laptop{
    public void copy() {
        System.out.println("HP Copied");
    };

    public void cut(){
        System.out.println("HP Cut");
    };

    public void paste(){
        System.out.println("HP Pasted");
    };

    public void keyBoard() {
        System.out.println("HP Keyboard");
    };

    public void record() {
        System.out.println("Lenovo recording");
    };
}
