package net.bomeneer.java;

import java.util.Random;


public class dobblebackground {
    static int flnow = 0;
    //dobblesteen waardes
    static String t1 = "[---]\n[   ]\n[ * ]\n[---]";
    static String t2 = "[---]\n[ * ]\n[ * ]\n[---]";
    static String t3 = "[---]\n[  *]\n[ **]\n[---]";
    static String t4 = "[---]\n[** ]\n[** ]\n[---]";
    static String t5 = "[---]\n[ **]\n[***]\n[---]";
    static String t6 = "[---]\n[***]\n[***]\n[---]";
    static String dobble1 = "*********\n*     *\n *  ";
    static String dobble2 = "  *\n*      *\n*********";
    static String space = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
    static Random random = new Random();
    static int uitkomst;

    public static void dobblie(int typethrow) throws InterruptedException {
        if (typethrow == 0) uitkomst = random.nextInt(6);
        else if (typethrow == 1) uitkomst = random.nextInt(100);
        else {
            System.out.println("Oops, an unfixable error has occured");
            System.exit(1);
        }

        uitkomst++;
        forlooper();
        if (typethrow == 1) {
            forlooper2();
        }
        forlooper();
        System.out.println(space);
        switch (uitkomst) {
            case 1 -> System.out.println(t1);
            case 2 -> System.out.println(t2);
            case 3 -> System.out.println(t3);
            case 4 -> System.out.println(t4);
            case 5 -> System.out.println(t5);
            case 6 -> System.out.println(t6);
        }
        if (uitkomst >= 7 && uitkomst <= 100) System.out.println(dobble1 + uitkomst + dobble2);
        System.out.println("You've thrown" + " " + uitkomst);
    }

    public static void forlooper() {
        for(int i=1;i <= 6;i++){
            System.out.println(space);
            switch (i) {
                case 1 -> System.out.println(t1);
                case 2 -> System.out.println(t2);
                case 3 -> System.out.println(t3);
                case 4 -> System.out.println(t4);
                case 5 -> System.out.println(t5);
                case 6 -> System.out.println(t6);
            }
            try { Thread.sleep(200); }
            catch (InterruptedException ignored) {}
        }
    }

    public static void forlooper2(){
        for(int i = 7;i <= 100;i++){
            System.out.println(space + (flnow <= 100 ? dobble1 + flnow + dobble2 : "Oops, Out of range :(,OEF"));
        }
        try { Thread.sleep(200); }
        catch (InterruptedException ignored){}
    }
}