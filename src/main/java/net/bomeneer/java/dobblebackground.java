package net.bomeneer.java;

import java.util.Random;

import static java.lang.System.out;

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

    public static void dobblie(int typethrow) {
        if (typethrow == 0) uitkomst = random.nextInt(6);
        else if (typethrow == 1) uitkomst = random.nextInt(100);

        else {
            out.println("Oops, an unfixable error has occured");
            System.exit(1);
        }

        uitkomst++;
        forlooper();
        if (typethrow == 1) {
            forlooper2();
        }
        forlooper();
        out.println(space);
        switch (uitkomst) {
            case 1 -> out.println(t1);
            case 2 -> out.println(t2);
            case 3 -> out.println(t3);
            case 4 -> out.println(t4);
            case 5 -> out.println(t5);
            case 6 -> out.println(t6);
        }
        if (uitkomst >= 7 && uitkomst <= 100) out.println(dobble1 + uitkomst + dobble2);
        out.println("You've thrown" + " " + uitkomst);
    }

    public static void forlooper() {
        while (flnow <= 6) {
            out.println(space);
            switch (flnow) {
                case 1 -> out.println(t1);
                case 2 -> out.println(t2);
                case 3 -> out.println(t3);
                case 4 -> out.println(t4);
                case 5 -> out.println(t5);
                case 6 -> out.println(t6);
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flnow++;
        }
        flnow = 0;
    }

    public static void forlooper2() {
        flnow = 7;
        while (flnow <= 100) {
            out.println(space);
            if (flnow <= 100) out.println(dobble1 + flnow + dobble2);
            else out.println("Oops, Out of range :(,OEF");
            flnow++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}