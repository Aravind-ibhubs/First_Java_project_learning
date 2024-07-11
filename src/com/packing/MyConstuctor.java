package com.packing;

/**
 * It is a learning of constuctor class.
 * Methods are parameter less and parameter class
 * 
 */
class MyConstuctor {
    int i;
    int j;

    public static void main(String[] args) {
        MyConstuctor mc1 = new MyConstuctor();
        MyConstuctor mc2 = new MyConstuctor(25, 36);
        MyConstuctor mc3 = new MyConstuctor(63,10);

        System.out.println(mc1.hashCode());
        System.out.println(mc1.add());
        System.out.println(mc2.add());
        System.out.println(mc3.add());
        System.out.println(mc1.j);
        System.out.println(mc2.j);
    }

    protected MyConstuctor() {
        i = 10;
        j = 12;
    }

    /**
     * This takes the params which is listed below
     * @param a
     * @param b
     */
    public MyConstuctor(int a, int b) {
        i = a;
        j = b;
    } 

    /**
     * this is add method in constructor
     * @return it return the addition of i and j
     */
    public int add() {
        return i + j;
    }

}
