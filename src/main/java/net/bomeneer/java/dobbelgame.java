package net.bomeneer.java;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class dobbelgame {
    static Scanner input = new Scanner(in);

    public static void main(int tcount) {
        try { dobblebackground.dobblie(tcount); }
        catch(Exception ignored){}
        out.println("Wil je nog een keer dobbelen?, Ja of Nee?");
        String reply1 = input.nextLine().toLowerCase();
        if (reply1.equals("ja") || reply1.equals("j") || reply1.equals("yes") || reply1.equals("y")) {
            out.println("Met dezelfde dobbelsteen?, Ja of Nee?");
            String reply2 = input.nextLine();
            reply2 = reply2.toLowerCase();
            if (reply2.equals("ja") || reply2.equals("j") || reply2.equals("yes") || reply2.equals("y")) {
                redo(tcount);
            } else {
                if (tcount == 1) redo(0);
                else redo(1);
            }
        }
    }

    public static void redo(int tcount2) {
        main(tcount2);
    }
}