package net.bomeneer.java;

import java.util.*;
import static java.lang.System.*;

public class RockPaperScissors {
    private static final Random random = new Random();
    private static final Scanner input = new Scanner(in);
    public static void main() {
        // 0 = Steen, 1 = Papier,2 = Schaar
        // debug sequence 1 - Start
        String debug;
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
            if (playeramountfilltime == 0) {
                out.println("hoeveel spelers? (2 of 3)");
            } else {
                out.println("dit aantal spelers is niet mogelijk, je kan dit spelen met 2 of 3 spelers");
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
                }
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
        // AutoSelector - Start
        if (playeramount == 2) {
            while (player1wins < 3 && player2wins < 3) {
                player1hand = randomnumber(2);
                player2hand = randomnumber(2);
                String playerhandconcat = String.valueOf(player1hand + player2hand);
                switch (playerhandconcat) {
                    case "00" -> out.println("Gelijk, beide Steen");
                    case "01" -> {
                        out.println("Speler 2(" + player2name + ") heeft deze ronde gewonnen (Papier (Speler 2) > Steen (Speler1))");
                        player2wins++;
                    }
                    case "02" -> {
                        player1wins++;
                        out.println("Speler 1(" + player1name + ") heeft deze ronde gewonnen (Steen (Speler1) > Schaar (Speler 2))");
                    }
                    case "10" -> {
                        out.println("Speler 1(" + player1name + ") heeft deze ronde gewonnen (Papier (Speler 1) > Steen (Speler 2))");
                        player1wins++;
                    }
                    case "11" -> out.println("Gelijk, beide Papier");
                    case "12" -> {
                        out.println("Speler 2(" + player2name + ") heeft deze ronde gewonnen (Schaar (Speler 2) > Papier (Speler 1))");
                        player2wins++;
                    }
                    case "20" -> {
                        out.println("Speler 2(" + player2name + ") heeft deze ronde gewonnen (Papier (Speler 2) > Steen (Speler 1))");
                        player2wins++;
                    }
                    case "21" -> {
                        out.println("Speler 1(" + player1name + ") heeft deze ronde gewonnen (Schaar (Speler 1) > Papier (Speler 2))");
                        player1wins++;
                    }
                    case "22" -> out.println("Gelijk, beide Schaar");
                    default -> out.println(oops_fuckup);
                }
            }
        }
        else{
            while (player1wins < 3 && player2wins < 3 && player3wins < 3) {
                player1hand = randomnumber(2);
                player2hand = randomnumber(2);
                player3hand = randomnumber(2);
                String playerhandconcat = String.valueOf(player1hand + player2hand + player3hand);
                switch (playerhandconcat) {
                    case "000" -> out.println("Iedereen heeft hetzelfde, iedereen heeft steen");
                    case "001" -> {
                        out.println("Speler 3(" + player3name + ") heeft deze ronde gewonnen (Papier (Speler 3) > Steen (Speler 1 & 2))");
                        player3wins++;
                    }
                    case "002" -> {
                        out.println("Speler 1 & 2(" + " & " + player2name + ") heeft deze ronde gewonnen (Steen (Speler 1 & 2 ) > Schaar (Speler 3)");
                        player1wins++;
                        player2wins++;
                    }
                    case "010" -> {
                        out.println("Speler 2(" + player2name + ") heeft deze ronde gewonnen (Papier (Speler 2) > Steen (Speler 1 & 3))");
                        player2wins++;
                    }
                    case "011" -> {
                        out.println("Speler 2 & 3(" + player2name + " & " + player3name + ") heeft deze ronde gewonnen (Papier (Speler 2 & 3) > Steen (Speler 1))");
                        player2wins++;
                        player3wins++;
                    }
                    case "012", "021", "102", "120", "201", "210" -> out.println("gelijk, alles (SPS_i1)");
                    case "020" -> {
                        out.println("Speler 1 & 3(" + player1name + " & " + player3name + ") heeft deze ronde gewonnen (Steen (Speler 1 & 3) > Schaar (Speler 2))");
                        player1wins++;
                        player3wins++;
                    }
                    case "022" -> {
                        out.println("Speler 1(" + player1name + ") heeft deze ronde gewonnen (Steen (Speler 1) > Schaar (Speler 2 & 3))");
                        player1wins++;
                    }
                    case "100" -> {
                        out.println("Speler 1(" + player1name + ") heeft deze ronde gewonnen (Papier (Speler 1) > Steen (Speler 2 & 3))");
                        player1wins++;
                    }
                    case "101" -> {
                        out.println("Speler 1 & 3(" + player1name + " & " + player3name + ") heeft deze ronde gewonnen (Papier (Speler 1 & 3) > Steen (Speler 2))");
                        player1wins++;
                        player3wins++;
                    }
                    case "110" -> {
                        out.println("Speler 1 & 2(" + player1name + " & " + player2name + ") heeft deze ronde gewonnen (Papier (Speler 1 & 2) > Steen (Speler 3))");
                        player1wins++;
                        player2wins++;
                    }
                    case "111" -> out.println("Iedereen heeft hetzelfde, iedereen heeft papier");
                    case "112" -> {
                        out.println("Speler 3(" + player3name + ") heeft deze ronde gewonnen (Schaar (Speler 3) > Papier (Speler 1 & 2))");
                        player3wins++;
                    }
                    case "121" -> {
                        out.println("Speler 2(" + player2name + ") heeft deze ronde gewonnen (Schaar (Speler 2) > Papier (Speler 1 & 3))");
                        player2wins++;
                    }
                    case "122" -> {
                        out.println("Speler 2 & 3(" + player2name + " & " + player3name + ") heeft deze ronde gewonnen (Schaar (Speler 2 & 3) > Papier (Speler 1))");
                        player2wins++;
                        player3wins++;
                    }
                    case "200" -> {
                        out.println("Speler 2 & 3(" + player2name + " & " + player3name + ") heeft deze ronde gewonnen (Steen (Speler 2 & 3) > Schaar (Speler 1))");
                        player2wins++;
                        player3wins++;
                    }
                    case "202" -> {
                        out.println("Speler 2(" + player2name + ") heeft deze ronde gewonnen (Steen (Speler 2) > Schaar (Speler 1 & 3))");
                        player2wins++;
                    }
                    case "211" -> {
                        out.println("Speler 1(" + player1name + ") heeft deze ronde gewonnen (Schaar (Speler 1) > Papier (Speler 2 & 3))");
                        player1wins++;
                    }
                    case "212" -> {
                        out.println(player1name + " & " + player3name + ") heeft deze ronde gewonnen (Schaar (Speler 1 & 3) > Papier (Speler 2))");
                        player1wins++;
                        player3wins++;
                    }
                    case "220" -> {
                        out.println("Speler 3(" + player3name + ") heeft deze ronde gewonnen (Steen (Speler 3) > Schaar (Speler 1 & 2))");
                        player3wins++;
                    }
                    case "221" -> {
                        out.println("Speler 1 & 2(" + player1name + " & " + player2name + ") heeft deze ronde gewonnen (Schaar (Speler 1 & 2) > Papier (Speler 3))");
                        player1wins++;
                        player2wins++;
                    }
                    case "222" -> out.println("Iedereen heeft hetzelfde, iedereen heeft schaar");
                    default -> out.println(oops_fuckup);
                }
            }
        }
        if (player1wins >= 3) {out.println("Player 1("+player1name+") wins");}
        if (player2wins >= 3) {out.println("Player 2 ("+player2name+") wins");}
        if (player3wins >= 3) {out.println("Player 3 ("+player3name+") wins");}
        if (debug.equals("ja") || debug.equals("Ja") || debug.equals("JA")) {
            out.println("VAR$player1wins:"+player1wins);
            out.println("VAR$player2wins:"+player2wins);
            out.println("VAR$player3wins:"+player3wins);
            out.println("Latest Hand Data/LHD Player 1:"+player1hand);
            out.println("Latest Hand Data/LHD Player 2:"+player2hand);
            out.println("Latest Hand Data/LHD Player 3:"+player3hand);
        }
    }
    private static int randomnumber(int max) {
        return random.nextInt(max + 1);
    }
}