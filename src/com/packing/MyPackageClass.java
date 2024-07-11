package com.packing;

class MyPackageClass {
    public String nameOfClass = "1A-first";
    public int numberOfStudents = 25;
    public float avgAttendence = (float) 50.0;
    public boolean isWorking = true;
    public byte isRun = (byte) 893;

    public static void main(String[] args) {
        System.out.println("example for com.packing");

        //MyPackageClass myPackageClass = new MyPackageClass();
        //System.out.println(myPackageClass.avgAttendence);
        //Size of variable type
        System.out.println(Short.SIZE/8);
        System.out.println(Byte.SIZE/8);
        System.out.println(Long.SIZE/8);
        System.out.println(Integer.SIZE/8);
        System.out.println(Float.SIZE/8);
        System.out.println(Double.SIZE/8);
        System.out.println(Character.SIZE/8);

        MyConstuctor mc = new MyConstuctor();
        MyConstuctor mc2 = new MyConstuctor(20, 87);
        mc2.add();
        mc.add();
    }
}
