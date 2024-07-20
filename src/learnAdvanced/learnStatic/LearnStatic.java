package learnAdvanced.learnStatic;

import java.util.Random;

public class LearnStatic {
    int i;
    static int j;
    public static void main(String[] args) {
        Random rand = new Random();

        // Static with object creation. For static we dont need new object.
        //Non static . We need object creation
        /*LearnStatic t1 = new LearnStatic();
        t1.i = rand.nextInt();
        t1.j = rand.nextInt();

        LearnStatic t2 = new LearnStatic();
        t2.i = rand.nextInt();
        t2.j = rand.nextInt();

        LearnStatic t3 = new LearnStatic();
        t3.i = rand.nextInt();
        t3.j = rand.nextInt();

        System.out.printf("test1 i : %d and j : %d \n", t1.i,t1.j);
        System.out.printf("test2 i : %d and j : %d \n", t2.i,t2.j);
        System.out.printf("test3 i : %d and j : %d \n", t3.i,t3.j);
        */
        // Assign without object creation
        LearnStatic.j = rand.nextInt();
        LearnStatic.j = rand.nextInt();
        LearnStatic.j = rand.nextInt();
        LearnStatic.j = rand.nextInt();

        System.out.println(LearnStatic.j);
        System.out.println(LearnStatic.j);
        System.out.println(LearnStatic.j);     
    }

    // Static method
    public static void printStaticMethod() {
        System.out.println("IT is a Static method");
    }

    //Non static method
    public void printNonStatic() {
        System.out.println("It is a non static method");
    }
}
