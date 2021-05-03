package net.bomeneer.java;

import java.util.*;
import static java.lang.System.*;

public class RockPaperScissors {
    private static final Random random = new Random();
    private static final Scanner input = new Scanner(in);
    public static void main() {
        // 0 = Steen, 1 = Papier,2 = Schaar
        // debug sequence 1 - Start
        String debug = "NO";
        out.println("Start?, click [ENTER]");
        debug = input.nextLine();
        input.nextLine();
        // debug sequence 1 - End
        // Vartable - Start
        String oops_fuckup = "Ah yes the program fucked up bigtimes, oops";
        boolean player1random = false;
        boolean player2random = false;
        boolean player3random = false;
        int getrandomcount;
        int playeramount = 0;
        String player1name;
        String player2name;
        String player3name = null;
        int player1wins = 0;
        int player2wins = 0;
        int player3wins = 0;
        int player1hand = -1;
        int player2hand = -1;
        int player3hand = -1;
        int playeramountfilltime = 0;
        // Vartable - End
        // RandomNames - Start
        String[] randomname = {"STROS", "Windows", "MacOSX", "Ubuntu", "CentOS", "RHEL", "Arch Linux", "TempleOS", "Linux Mint", "vSphere", "ProxMox"};
        // RandomNames - End
        // PlayerAmount - Start
        while (playeramount <= 1 || playeramount >= 4) {
            switch (playeramountfilltime){
                case 0 -> out.println("hoeveel spelers? (2 of 3)");
                default -> out.println("dit aantal spelers is niet mogelijk, je kan dit spelen met 2 of 3 spelers");
            }
            playeramountfilltime++;
            out.print("aantal spelers: ");
            playeramount = input.nextInt();
            input.nextLine();
        }
        // PlayerAmount - End
        // ChooseNames - Start
        out.println("Vul hier de naam voor speler 1 (voor een random naam type 'Random'");
        player1name = input.nextLine();
        if (player1name.equals("random") || player1name.equals("Random") || player1name.equals("RANDOM")) {
            player1random = true;
            getrandomcount = randomnumber(10);
            player1name = randomname[getrandomcount];
        }
        out.println("Vul hier de naam voor speler 2 (voor een random naam type 'Random'");
        player2name = input.nextLine();
        if (player2name.equals("random") || player2name.equals("Random") || player2name.equals("RANDOM")) {
            player2random = true;
            getrandomcount = randomnumber(10);
            player2name = randomname[getrandomcount];
        }
        if (playeramount == 3) {
            out.println("Vul hier de naam voor speler 3 (voor een random naam type 'Random'");
            player3name = input.nextLine();
            if (player3name.equals("random") || player3name.equals("Random") || player3name.equals("RANDOM")) {
                getrandomcount = randomnumber(10);
                player3name = randomname[getrandomcount];
            }
        }
        // ChooseNames - End
        // FixConflictedNames - Start
        if(player1name.equals(player2name) || player1name.equals(player3name)) {
            if (player1random) {
                if (player2random || player3random) {
                    getrandomcount = randomnumber(10);
                    player1name = randomname[getrandomcount];
                } else {
                    out.println("[LOG]: Picked-up Warning: Error_==NotRandom, no action needed");
                }
            } else {
                out.println("[LOG]: Picked-up Warning: Error_==NotRandom, no action needed");
            }
        }
        while (player2name.equals(player3name)) {
            if (player2random) {
                if (player3random) {
                    getrandomcount = randomnumber(10);
                    player2name = randomname[getrandomcount];
                }
            }
        }
        // FixConflictedNames - End
        // ChoosingHand - Start
        // ChoosingHand - End
        // AutoSelector - Start
        if (playeramount == 2) {
            while (player1wins < 3 && player2wins < 3) {
                player1hand = randomnumber(2);
                player2hand = randomnumber(2);
                if(player1hand == 0) {
                    if(player2hand == 0) {
                        out.println("Gelijk, beide Steen");
                    }else if(player2hand == 1){
                        player2wins = player2wins + 1;
                        out.print("Speler 2(");
                        out.print(player2name);
                        out.println(") heeft deze ronde gewonnen (Papier (Speler 2) > Steen (Speler1))");
                    }else if(player2hand == 2){
                        player1wins = player1wins + 1;
                        out.print("Speler 1(");
                        out.print(player1name);
                        out.println(") heeft deze ronde gewonnen (Steen (Speler1) > Schaar (Speler 2))");
                    }else{
                        out.println(oops_fuckup);
                    }
                }else if(player1hand == 1){
                    if(player2hand == 0) {
                        player1wins = player1wins + 1;
                        out.print("Speler 1(");
                        out.print(player1name);
                        out.println(") heeft deze ronde gewonnen (Papier (Speler 1) > Steen (Speler 2))");
                    }else if(player2hand == 1){
                        out.println("Gelijk, beide Papier");
                    }else if(player2hand == 2){
                        player2wins = player2wins + 1;
                        out.print("Speler 2(");
                        out.print(player2name);
                        out.println(") heeft deze ronde gewonnen (Schaar (Speler 2) > Papier (Speler 1))");
                    }else{
                        out.println(oops_fuckup);
                    }
                }else if(player1hand == 2){
                    if(player2hand == 0) {
                        player2wins = player2wins + 1;
                        out.print("Speler 2(");
                        out.print(player2name);
                        out.println(") heeft deze ronde gewonnen (Papier (Speler 2) > Steen (Speler 1))");
                    }else if(player2hand == 1){
                        out.print("Speler 1(");
                        out.print(player1name);
                        out.println(") heeft deze ronde gewonnen (Schaar (Speler 1) > Papier (Speler 2))");
                    }else if(player2hand == 2){
                        out.println("Gelijk, beide Schaar");
                    }else{
                        out.println(oops_fuckup);
                    }
                }else{
                    out.println(oops_fuckup);
                }
            }
        }
        if (playeramount == 3) {
            while (player1wins < 3 && player2wins < 3 && player3wins < 3) {
                player1hand = randomnumber(2);
                player2hand = randomnumber(2);
                player3hand = randomnumber(2);
                if(player1hand == 0){
                    if(player2hand == 0){
                        if(player3hand == 0){
                            out.println("Iedereen heeft hetzelfde, iedereen heeft steen");
                        }else if(player3hand == 1){
                            out.print("Speler 3(");
                            out.print(player3name);
                            out.println(") heeft deze ronde gewonnen (Papier (Speler 3) > Steen (Speler 1 & 2))");
                            player3wins = player3wins + 1;
                        }else if(player3hand == 2){
                            out.print("Speler 1 & 2(");
                            out.print(player1name);
                            out.print(" & ");
                            out.print(player2name);
                            out.println(") heeft deze ronde gewonnen (Steen (Speler 1 & 2 ) > Schaar (Speler 3)");
                            player1wins = player1wins + 1;
                            player2wins = player2wins + 1;
                        }else{
                            out.println(oops_fuckup);
                        }
                    }else if(player2hand == 1){
                        if(player3hand == 0){
                            out.print("Speler 2(");
                            out.print(player2name);
                            out.println(") heeft deze ronde gewonnen (Papier (Speler 2) > Steen (Speler 1 & 3))");
                            player2wins = player2wins + 1;
                        }else if(player3hand == 1){
                            out.print("Speler 2 & 3(");
                            out.print(player2name);
                            out.print(" & ");
                            out.print(player3name);
                            out.println(") heeft deze ronde gewonnen (Papier (Speler 2 & 3) > Steen (Speler 1))");
                            player2wins = player2wins + 1;
                            player3wins = player3wins + 1;
                        }else if(player3hand == 2){
                            out.println("gelijk, alles (SPS_i1)");
                        }else{
                            out.println(oops_fuckup);
                        }
                    }else if(player2hand == 2){
                        if(player3hand == 0){
                            out.print("Speler 1 & 3(");
                            out.print(player1name);
                            out.print(" & ");
                            out.print(player3name);
                            out.println(") heeft deze ronde gewonnen (Steen (Speler 1 & 3) > Schaar (Speler 2))");
                            player1wins = player1wins + 1;
                            player3wins = player3wins + 1;
                        }else if(player3hand == 1){
                            out.println("gelijk, alles (SPS_i1)");
                        }else if(player3hand == 2){
                            out.print("Speler 1(");
                            out.print(player1name);
                            out.println(") heeft deze ronde gewonnen (Steen (Speler 1) > Schaar (Speler 2 & 3))");
                            player1wins = player1wins + 1;
                        }else{
                            out.println(oops_fuckup);
                        }
                    }
                }
                if(player1hand == 1){
                    if(player2hand == 0){
                        if(player3hand == 0){
                            out.print("Speler 1(");
                            out.print(player1name);
                            out.println(") heeft deze ronde gewonnen (Papier (Speler 1) > Steen (Speler 2 & 3))");
                            player1wins = player1wins + 1;
                        }else if(player3hand == 1){
                            out.print("Speler 1 & 3(");
                            out.print(player1name);
                            out.print(" & ");
                            out.print(player3name);
                            out.println(") heeft deze ronde gewonnen (Papier (Speler 1 & 3) > Steen (Speler 2))");
                            player1wins = player1wins + 1;
                            player3wins = player3wins + 1;
                        }else if(player3hand == 2){
                            out.println("gelijk, alles (SPS_i1)");
                        }else{
                            out.println(oops_fuckup);
                        }
                    }else if(player2hand == 1){
                        if(player3hand == 0){
                            out.print("Speler 1 & 2(");
                            out.print(player1name);
                            out.print(" & ");
                            out.print(player2name);
                            out.println(") heeft deze ronde gewonnen (Papier (Speler 1 & 2) > Steen (Speler 3))");
                            player1wins = player1wins + 1;
                            player2wins = player2wins + 1;
                        }else if(player3hand == 1){
                            out.println("Iedereen heeft hetzelfde, iedereen heeft papier");
                        }else if(player3hand == 2){
                            out.print("Speler 3(");
                            out.print(player3name);
                            out.println(") heeft deze ronde gewonnen (Schaar (Speler 3) > Papier (Speler 1 & 2))");
                            player3wins = player3wins + 1;
                        }else{
                            out.println(oops_fuckup);
                        }
                    }else if(player2hand == 2){
                        if(player3hand == 0){
                            out.println("gelijk, alles (SPS_i1)");
                        }else if(player3hand == 1){
                            out.print("Speler 2(");
                            out.print(player2name);
                            out.println(") heeft deze ronde gewonnen (Schaar (Speler 2) > Papier (Speler 1 & 3))");
                            player2wins = player2wins + 1;
                        }else if(player3hand == 2){
                            out.print("Speler 2 & 3(");
                            out.print(player2name);
                            out.print(" & ");
                            out.print(player3name);
                            out.println(") heeft deze ronde gewonnen (Schaar (Speler 2 & 3) > Papier (Speler 1))");
                            player2wins = player2wins + 1;
                            player3wins = player3wins + 1;
                        }else{
                            out.println(oops_fuckup);
                        }
                    }
                }
                if(player1hand == 2){
                    if(player2hand == 0){
                        if(player3hand == 0){
                            out.print("Speler 2 & 3(");
                            out.print(player2name);
                            out.print(" & ");
                            out.print(player3name);
                            out.println(") heeft deze ronde gewonnen (Steen (Speler 2 & 3) > Schaar (Speler 1))");
                            player2wins = player2wins + 1;
                            player3wins = player3wins + 1;
                        }else if(player3hand == 1){
                            out.println("gelijk, alles (SPS_i1)");
                        }else if(player3hand == 2){
                            out.print("Speler 2(");
                            out.print(player2name);
                            out.println(") heeft deze ronde gewonnen (Steen (Speler 2) > Schaar (Speler 1 & 3))");
                            player2wins = player2wins + 1;
                        }else{
                            out.println(oops_fuckup);
                        }
                    }else if(player2hand == 1){
                        if(player3hand == 0){
                            out.println("gelijk, alles (SPS_i1)");
                        }else if(player3hand == 1){
                            out.print("Speler 1(");
                            out.print(player1name);
                            out.println(") heeft deze ronde gewonnen (Schaar (Speler 1) > Papier (Speler 2 & 3))");
                            player1wins = player1wins + 1;
                        }else if(player3hand == 2){
                            out.print(player1name);
                            out.print(" & ");
                            out.print(player3name);
                            out.println(") heeft deze ronde gewonnen (Schaar (Speler 1 & 3) > Papier (Speler 2))");
                            player1wins = player1wins + 1;
                            player3wins = player3wins + 1;
                        }else{
                            out.println(oops_fuckup);
                        }
                    }else if(player2hand == 2){
                        if(player3hand == 0){
                            out.print("Speler 3(");
                            out.print(player3name);
                            out.println(") heeft deze ronde gewonnen (Steen (Speler 3) > Schaar (Speler 1 & 2))");
                            player3wins = player3wins + 1;
                        }else if(player3hand == 1){
                            out.print("Speler 1 & 2(");
                            out.print(player1name);
                            out.print(" & ");
                            out.print(player2name);
                            out.println(") heeft deze ronde gewonnen (Schaar (Speler 1 & 2) > Papier (Speler 3))");
                            player1wins = player1wins + 1;
                            player2wins = player2wins + 1;
                        }else if(player3hand == 2){
                            out.println("Iedereen heeft hetzelfde, iedereen heeft schaar");
                        }else{
                            out.println(oops_fuckup);
                        }
                    }
                }
            }
        }
        if (player1wins >= 3) {out.println("Player 1(" + player1name + ") wins");}
        if (player2wins >= 3) {out.println("Player 2 (" + player2name + ") wins");}
        if (player3wins >= 3) {out.println("Player 3 (" + player3name + ") wins");}
        if (debug.equals("ja") || debug.equals("Ja") || debug.equals("JA")) {
            out.print("VAR$player1wins:");
            out.println(player1wins);
            out.print("VAR$player2wins:");
            out.println(player2wins);
            out.print("VAR$player3wins:");
            out.println(player3wins);
            out.print("Latest Hand Data/LHD Player 1:");
            out.println(player1hand);
            out.print("Latest Hand Data/LHD Player 2:");
            out.println(player2hand);
            out.print("Latest Hand Data/LHD Player 3:");
            out.println(player3hand);
        }
    }
    private static int randomnumber(int max) {
        return random.nextInt(max + 1);
    }
}