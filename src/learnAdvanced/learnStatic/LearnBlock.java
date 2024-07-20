package learnAdvanced.learnStatic;

public class LearnBlock {
    int i;
    static int j;
    static {
        System.out.println("it is a static block1");
        j = 56;
    }

    static {
        System.out.println("it is a static block2");
    }

    static {
        System.out.println("it is a static block3");
    }

    {
        System.out.println("It is a non static block");
        i = 10;
    }

    public LearnBlock(){
        System.out.println("it is a constructor method");
    }
    public static void main(String[] args) {
        System.out.println("It is a main method");
        //System.out.println(j);
        LearnBlock block = new LearnBlock();
        LearnBlock block1 = new LearnBlock();
        LearnBlock block2 = new LearnBlock();
        LearnBlock block3 = new LearnBlock();
        LearnBlock block4 = new LearnBlock();
    }
}
