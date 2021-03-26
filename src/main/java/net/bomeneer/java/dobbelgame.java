package net.bomeneer.java;
import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class dobbelgame {
    static Scanner input = new Scanner(in);

public static void main(int tcount){
    if(tcount == 0){
        dobblebackground.dobblie(0);
        out.println("Wil je nog een keer dobbelen?, Ja of Nee?");
        String reply1 = input.nextLine();
        if (reply1.equals("ja") || reply1.equals("Ja") || reply1.equals("JA") || reply1.equals("j") || reply1.equals("J") || reply1.equals("yes") || reply1.equals("Yes") || reply1.equals("YES") || reply1.equals("y") || reply1.equals("Y")) {
            out.println("Met dezelfde dobbelsteen?, Ja of Nee?");
            String reply2 = input.nextLine();
            if (reply2.equals("ja") || reply2.equals("Ja") || reply2.equals("JA") || reply2.equals("j") || reply2.equals("J") || reply2.equals("yes") || reply2.equals("Yes") || reply2.equals("YES") || reply2.equals("y") || reply2.equals("Y")) {
                redo( 0);
            } else {
                redo( 1);
            }
        }
    else if(tcount == 1){
            dobblebackground.dobblie(1);
            out.println("Wil je nog een keer dobbelen?, Ja of Nee?");
            reply1 = input.nextLine();
            if (reply1.equals("ja") || reply1.equals("Ja") || reply1.equals("JA") || reply1.equals("j") || reply1.equals("J") || reply1.equals("yes") || reply1.equals("Yes") || reply1.equals("YES") || reply1.equals("y") || reply1.equals("Y")) {
                out.println("Met dezelfde dobbelsteen?, Ja of Nee?");
                String reply2 = input.nextLine();
                if (reply2.equals("ja") || reply2.equals("Ja") || reply2.equals("JA") || reply2.equals("j") || reply2.equals("J") || reply2.equals("yes") || reply2.equals("Yes") || reply2.equals("YES") || reply2.equals("y") || reply2.equals("Y")) {
                    redo(1);
                } else {
                    redo(0);
                }

            }
            }
        } else {
            out.println("Have a nice day");
        }
    }
    public static void redo(int tcount2){main(tcount2);}
}