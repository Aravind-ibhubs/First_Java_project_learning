package learnAdvanced.learnOpps;

import learnAdvanced.learnOpps.inheritence.Admin;
import learnAdvanced.learnOpps.inheritence.Developer;
import learnAdvanced.learnOpps.inheritence.GuestUser;

public class Test1 {
    public static void main(String[] args) {
        Admin admin = new Admin();

        //admin.read();
        admin.write();
        admin.managing();

        Developer deve = new Developer();

        deve.read();
        deve.write();

        GuestUser guest = new GuestUser();
        guest.read();
    }
}
