package learnAdvanced.learnOpps.interfacesL;


public class Lenovo implements Laptop {
    @Override
    public void copy() {
        System.out.println("Lenovo Copied");
    };

    public void cut(){
        System.out.println("Lenovo Cut");
    };

    public void paste(){
        System.out.println("Lenovo Pasted");
    };

    public void keyBoard() {
        System.out.println("Lenovo Keyboard");
    };

    public void takePicture() {
        System.out.println("Lenovo picture");
    };

    @Override
    public void security() {
        System.out.println("Lenovo security");
    }
}
