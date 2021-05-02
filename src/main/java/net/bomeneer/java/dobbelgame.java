package net.bomeneer.java;
import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class dobbelgame {
    static Scanner input = new Scanner(in);
    static String reply;
    public static void main(int tcount) {
        if (tcount == 0) {
            dobblebackground.dobblie(0);
            out.println("Wil je nog een keer dobbelen?, Ja of Nee?");
            reply = input.nextLine();
            if (reply.equals("ja") || reply.equals("Ja") || reply.equals("JA") || reply.equals("j") || reply.equals("J") || reply.equals("yes") || reply.equals("Yes") || reply.equals("YES") || reply.equals("y") || reply.equals("Y")) {
                out.println("Met dezelfde dobbelsteen?, Ja of Nee?");
                reply = input.nextLine();
                if (reply.equals("ja") || reply.equals("Ja") || reply.equals("JA") || reply.equals("j") || reply.equals("J") || reply.equals("yes") || reply.equals("Yes") || reply.equals("YES") || reply.equals("y") || reply.equals("Y")) {
                    redo(0);
                } else {
                    redo(1);
                }
            }
            } else if (tcount == 1) {
                dobblebackground.dobblie(1);
                out.println("Wil je nog een keer dobbelen?, Ja of Nee?");
                reply = input.nextLine();
                if (reply.equals("ja") || reply.equals("Ja") || reply.equals("JA") || reply.equals("j") || reply.equals("J") || reply.equals("yes") || reply.equals("Yes") || reply.equals("YES") || reply.equals("y") || reply.equals("Y")) {
                    out.println("Met dezelfde dobbelsteen?, Ja of Nee?");
                    reply = input.nextLine();
                    if (reply.equals("ja") || reply.equals("Ja") || reply.equals("JA") || reply.equals("j") || reply.equals("J") || reply.equals("yes") || reply.equals("Yes") || reply.equals("YES") || reply.equals("y") || reply.equals("Y")) {
                        redo(1);
                    } else {
                        redo(0);
                    }

                    }
                }

        }
        public static void redo(int tcount2){
            main(tcount2);
        }
}