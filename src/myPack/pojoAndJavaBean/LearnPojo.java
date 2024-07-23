package myPack.pojoAndJavaBean;

public class LearnPojo {
    /*
     * It must be public
     * It may or may not have variables as private
     * If variables are private , it have getters and setters
     * It shoud not implement any interface
     * It should not extends with any class
     * It shold not have any annotions
     */
    private int id;
    public String name;
    public double salary;

    public  LearnPojo() {
        System.out.println("Pojo class get started");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
