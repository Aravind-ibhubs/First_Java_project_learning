package learnAdvanced.learnOpps;

import learnAdvanced.learnOpps.encapsulation.Test;
import learnAdvanced.learnOpps.inheritence.Admin;
import learnAdvanced.learnOpps.inheritence.Developer;
import learnAdvanced.learnOpps.inheritence.GuestUser;
import learnAdvanced.learnOpps.interfacesL.HP;
import learnAdvanced.learnOpps.interfacesL.Laptop;
import learnAdvanced.learnOpps.interfacesL.Lenovo;

public class Test1 {
    public static void main(String[] args) {
        /*Admin admin = new Admin();

        //admin.read();
        admin.write();
        admin.managing();

        Developer deve = new Developer();

        deve.read();
        deve.write();

        GuestUser guest = new GuestUser();
        guest.read();

        Test t1 = new Test(96);
        t1.setAttendence(true);
        t1.getAttendance();

        Test t2 = new Test(87);
        t2.setAttendence(false);
        t2.getAttendance();
        */
        Laptop l1 = new Lenovo();
        l1.cut();
        l1.copy();
        l1.security();
        Laptop.video();

        Laptop h1 = new HP();
        h1.copy();
        h1.keyBoard();
    }
}
