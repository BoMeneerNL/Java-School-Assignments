package net.bomeneer.java;

import java.util.Random;


public class dobblebackground {
    static int flnow = 0;
    //dobblesteen waardes
    static String[] dobbel6 = {"[---]\n[   ]\n[ * ]\n[---]","[---]\n[ * ]\n[ * ]\n[---]","[---]\n[  *]\n[ **]\n[---]","[---]\n[** ]\n[** ]\n[---]",
            "[---]\n[ **]\n[***]\n[---]","[---]\n[***]\n[***]\n[---]"};
    static String dobble1 = "*********\n*     *\n *  ";
    static String dobble2 = "  *\n*      *\n*********";
    static String space = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
    static Random random = new Random();
    static int uitkomst;

    public static void dobblie(int typethrow) throws InterruptedException {
        switch (typethrow) {
        case 0 -> uitkomst = random.nextInt(6);
        case 1 -> uitkomst = random.nextInt(100);
        default -> {
            System.out.println("Oops, an unfixable error has occured");
            System.exit(1);
            }
        }

        uitkomst++;
        forlooper();
        if (typethrow == 1) {
            forlooper2();
        }
        forlooper();
        System.out.println(space);
        System.out.println(dobbel6[uitkomst]);
        if (uitkomst >= 7 && uitkomst <= 100) System.out.println(dobble1 + uitkomst + dobble2);
        System.out.println("You've thrown" + " " + uitkomst);
    }

    public static void forlooper() {
        for(int i=1;i <= 6;i++){
            System.out.println(dobbel6[i]);
            try { Thread.sleep(200); }
            catch (InterruptedException ignored) {}
        }
    }

    public static void forlooper2(){
        for(int i = 7;i <= 100;i++){
            System.out.println(space + (flnow <= 100 ? dobble1 + flnow + dobble2 : "Oops, Out of range :("));
        }
        try { Thread.sleep(200); }
        catch (InterruptedException ignored){}
    }
}