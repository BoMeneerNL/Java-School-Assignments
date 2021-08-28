package net.bomeneer.java;

import java.lang.constant.Constable;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class RockPaperScissors {
    private static final Random random = new Random();
    private static final Scanner input = new Scanner(in);

    public static void main() {
        String debug;
        out.println("Start?,type something and click [ENTER]");
        debug = input.nextLine();
        input.nextLine();

        String oops_fuckup = "Ah yes the program fucked up bigtimes, oops";
        boolean[] playerrandom = {false,false,false};
        int getrandomcount;
        String[] playername = {null,null,null};
        int playeramount = 0;
        int[] playerwins = {0,0,0};
        int[] playerhand = {-1,-1,-1};
        int playeramountfilltime = 0;

        String[] randomname = {"STROS", "Windows", "MacOSX", "Ubuntu", "CentOS", "RHEL", "Arch Linux", "TempleOS", "Linux Mint", "vSphere", "ProxMox"};

        while (playeramount <= 1 || playeramount >= 4) {
            out.println(playeramountfilltime == 0 ? "hoeveel spelers? (2 of 3)" : "dit aantal spelers is niet mogelijk, je kan dit spelen met 2 of 3 spelers");
            playeramountfilltime++;
            out.print("aantal spelers: ");
            playeramount = input.nextInt();
            input.nextLine();
        }

        out.println("Vul hier de naam voor speler 1 (voor een random naam type 'Random'");
        playername[0] = input.nextLine();
        if (playername[0].equals("random") || playername[0].equals("Random") || playername[0].equals("RANDOM")) {
            playerrandom[0] = true;
            getrandomcount = randomnumber(10);
            playername[0] = randomname[getrandomcount];
        }
        out.println("Vul hier de naam voor speler 2 (voor een random naam type 'Random'");
        playername[1] = input.nextLine();
        if (playername[1].equals("random") || playername[1].equals("Random") || playername[1].equals("RANDOM")) {
            playerrandom[1] = true;
            getrandomcount = randomnumber(10);
            playername[1] = randomname[getrandomcount];
        }
        if (playeramount == 3) {
            out.println("Vul hier de naam voor speler 3 (voor een random naam type 'Random'");
            playername[2] = input.nextLine();
            if (playername[2].equals("random") || playername[2].equals("Random") || playername[2].equals("RANDOM")) {
                getrandomcount = randomnumber(10);
                playername[2] = randomname[getrandomcount];
            }
        }

        if (playername[0].equals(playername[1]) || playername[0].equals(playername[2])) {
            if (playerrandom[0]) {
                if (playerrandom[1] || playerrandom[2]) {
                    playername[0] = randomname[randomnumber(10)];
                }
            }
        }
        while (playername[1].equals(playername[2])) {
            if (playerrandom[1]) {
                if (playerrandom[2]) {
                    playername[1] = randomname[randomnumber(10)];
                }
            }
        }

        if (playeramount == 2) {
            while (playerwins[0] < 3 && playerwins[1] < 3) {
                playerhand[0] = randomnumber(2);
                playerhand[1] = randomnumber(2);
                String playerhandconcat = String.valueOf(playerhand[0]) + playerhand[1];
                switch (playerhandconcat) {
                    case "00" -> out.println("Gelijk, beide Steen");
                    case "01" -> {
                        out.println("Speler 2(" + playername[1] + ") heeft deze ronde gewonnen (Papier (Speler 2) > Steen (Speler1))");
                        playerwins[1]++;
                    }
                    case "02" -> {
                        playerwins[0]++;
                        out.println("Speler 1(" + playername[0] + ") heeft deze ronde gewonnen (Steen (Speler1) > Schaar (Speler 2))");
                    }
                    case "10" -> {
                        out.println("Speler 1(" + playername[0] + ") heeft deze ronde gewonnen (Papier (Speler 1) > Steen (Speler 2))");
                        playerwins[0]++;
                    }
                    case "11" -> out.println("Gelijk, beide Papier");
                    case "12" -> {
                        out.println("Speler 2(" + playername[1] + ") heeft deze ronde gewonnen (Schaar (Speler 2) > Papier (Speler 1))");
                        playerwins[1]++;
                    }
                    case "20" -> {
                        out.println("Speler 2(" + playername[1] + ") heeft deze ronde gewonnen (Papier (Speler 2) > Steen (Speler 1))");
                        playerwins[1]++;
                    }
                    case "21" -> {
                        out.println("Speler 1(" + playername[0] + ") heeft deze ronde gewonnen (Schaar (Speler 1) > Papier (Speler 2))");
                        playerwins[0]++;
                    }
                    case "22" -> out.println("Gelijk, beide Schaar");
                    default -> out.println(oops_fuckup);
                }
            }
        } else {
            while (playerwins[0] < 3 && playerwins[1] < 3 && playerwins[2] < 3) {
                playerhand[0] = randomnumber(2);
                playerhand[1] = randomnumber(2);
                playerhand[2] = randomnumber(2);
                String playerhandconcat = String.valueOf(playerhand[0]) + playerhand[1] + playerhand[2];
                switch (playerhandconcat) {
                    case "000" -> out.println("Iedereen heeft hetzelfde, iedereen heeft steen");
                    case "001" -> {
                        out.println("Speler 3(" + playername[2] + ") heeft deze ronde gewonnen (Papier (Speler 3) > Steen (Speler 1 & 2))");
                        playerwins[2]++;
                    }
                    case "002" -> {
                        out.println("Speler 1 & 2(" + " & " + playername[1] + ") heeft deze ronde gewonnen (Steen (Speler 1 & 2 ) > Schaar (Speler 3)");
                        playerwins[0]++;
                        playerwins[1]++;
                    }
                    case "010" -> {
                        out.println("Speler 2(" + playername[1] + ") heeft deze ronde gewonnen (Papier (Speler 2) > Steen (Speler 1 & 3))");
                        playerwins[1]++;
                    }
                    case "011" -> {
                        out.println("Speler 2 & 3(" + playername[1] + " & " + playername[2] + ") heeft deze ronde gewonnen (Papier (Speler 2 & 3) > Steen (Speler 1))");
                        playerwins[1]++;
                        playerwins[2]++;
                    }
                    case "012", "021", "102", "120", "201", "210" -> out.println("gelijk, alles (SPS_i1)");
                    case "020" -> {
                        out.println("Speler 1 & 3(" + playername[0] + " & " + playername[2] + ") heeft deze ronde gewonnen (Steen (Speler 1 & 3) > Schaar (Speler 2))");
                        playerwins[0]++;
                        playerwins[2]++;
                    }
                    case "022" -> {
                        out.println("Speler 1(" + playername[0] + ") heeft deze ronde gewonnen (Steen (Speler 1) > Schaar (Speler 2 & 3))");
                        playerwins[0]++;
                    }
                    case "100" -> {
                        out.println("Speler 1(" + playername[0] + ") heeft deze ronde gewonnen (Papier (Speler 1) > Steen (Speler 2 & 3))");
                        playerwins[0]++;
                    }
                    case "101" -> {
                        out.println("Speler 1 & 3(" + playername[0] + " & " + playername[2] + ") heeft deze ronde gewonnen (Papier (Speler 1 & 3) > Steen (Speler 2))");
                        playerwins[0]++;
                        playerwins[2]++;
                    }
                    case "110" -> {
                        out.println("Speler 1 & 2(" + playername[0] + " & " + playername[1] + ") heeft deze ronde gewonnen (Papier (Speler 1 & 2) > Steen (Speler 3))");
                        playerwins[0]++;
                        playerwins[1]++;
                    }
                    case "111" -> out.println("Iedereen heeft hetzelfde, iedereen heeft papier");
                    case "112" -> {
                        out.println("Speler 3(" + playername[2] + ") heeft deze ronde gewonnen (Schaar (Speler 3) > Papier (Speler 1 & 2))");
                        playerwins[2]++;
                    }
                    case "121" -> {
                        out.println("Speler 2(" + playername[1] + ") heeft deze ronde gewonnen (Schaar (Speler 2) > Papier (Speler 1 & 3))");
                        playerwins[1]++;
                    }
                    case "122" -> {
                        out.println("Speler 2 & 3(" + playername[1] + " & " + playername[2] + ") heeft deze ronde gewonnen (Schaar (Speler 2 & 3) > Papier (Speler 1))");
                        playerwins[1]++;
                        playerwins[2]++;
                    }
                    case "200" -> {
                        out.println("Speler 2 & 3(" + playername[1] + " & " + playername[2] + ") heeft deze ronde gewonnen (Steen (Speler 2 & 3) > Schaar (Speler 1))");
                        playerwins[1]++;
                        playerwins[2]++;
                    }
                    case "202" -> {
                        out.println("Speler 2(" + playername[1] + ") heeft deze ronde gewonnen (Steen (Speler 2) > Schaar (Speler 1 & 3))");
                        playerwins[1]++;
                    }
                    case "211" -> {
                        out.println("Speler 1(" + playername[0] + ") heeft deze ronde gewonnen (Schaar (Speler 1) > Papier (Speler 2 & 3))");
                        playerwins[0]++;
                    }
                    case "212" -> {
                        out.println(playername[0] + " & " + playername[2] + ") heeft deze ronde gewonnen (Schaar (Speler 1 & 3) > Papier (Speler 2))");
                        playerwins[0]++;
                        playerwins[2]++;
                    }
                    case "220" -> {
                        out.println("Speler 3(" + playername[2] + ") heeft deze ronde gewonnen (Steen (Speler 3) > Schaar (Speler 1 & 2))");
                        playerwins[2]++;
                    }
                    case "221" -> {
                        out.println("Speler 1 & 2(" + playername[0] + " & " + playername[1] + ") heeft deze ronde gewonnen (Schaar (Speler 1 & 2) > Papier (Speler 3))");
                        playerwins[0]++;
                        playerwins[1]++;
                    }
                    case "222" -> out.println("Iedereen heeft hetzelfde, iedereen heeft schaar");
                    default -> out.println(oops_fuckup);
                }
            }
        }
        System.out.println("Player 1(" + playername[0] + ") " + (playerwins[0] >= 3?"wins":"lost"));
        System.out.println("Player 2(" + playername[1] + ") " + (playerwins[1] >= 3?"wins":"lost"));
        System.out.println("Player 3(" + playername[2] + ") " + (playerwins[2] >= 3?"wins":"lost"));

        if (debug.equals("ja") || debug.equals("Ja") || debug.equals("JA")) {
            out.println("VAR$playerwins[0]: " + playerwins[0]);
            out.println("VAR$playerwins[1]: " + playerwins[1]);
            out.println("VAR$playerwins[2]: " + playerwins[2]);
            out.println("Latest Hand Data/LHD Player 1: " + playerhand[0]);
            out.println("Latest Hand Data/LHD Player 2: " + playerhand[1]);
            out.println("Latest Hand Data/LHD Player 3: " + playerhand[2]);
        }
    }

    private static int randomnumber(int max) {
        return random.nextInt(max + 1);
    }
}