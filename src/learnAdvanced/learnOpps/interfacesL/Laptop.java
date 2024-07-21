package learnAdvanced.learnOpps.interfacesL;

public interface Laptop {
    public void copy();

    public void cut();

    public void paste();

    public void keyBoard();

    default void security() {
        CommonCode();
        System.out.println("Laptop security");
    };

    static void video() {
        CommonCode();
        System.out.println("Video is displayed");
    }

    private static void CommonCode() {
        System.out.println("Code code and this method is not go out");
    }
}
