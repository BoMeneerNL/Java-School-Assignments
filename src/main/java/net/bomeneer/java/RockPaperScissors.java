package net.bomeneer.java;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class RockPaperScissors {
    private static final Random random = new Random();
    private static final Scanner input = new Scanner(in);

    public static void main() {
        String debug;
        out.println("to start type something and click [ENTER]");
        debug = input.nextLine();
        input.nextLine();
        String[] itemnaam = {"Steen","Papier","Schaar"};
        String oops_fuckup = "Ah yes the program fucked up bigtimes, oops";
        boolean[] playerrandom = {false, false, false};
        int playeramount = 0;
        int[] playerwins = {0, 0, 0};
        int[] playerhand = {-1, -1, -1};
        int playeramountfilltime = 0;

        String[] randomname = {"STROS", "Windows", "MacOSX", "Ubuntu", "CentOS", "RHEL", "Arch Linux", "TempleOS", "Linux Mint", "vSphere", "ProxMox"};

        while (playeramount <= 1 || playeramount >= 4) {
            out.println(playeramountfilltime == 0 ? "hoeveel spelers? (2 of 3)" : "dit aantal spelers is niet mogelijk, je kan dit spelen met 2 of 3 spelers");
            playeramountfilltime++;
            out.print("aantal spelers: ");
            playeramount = input.nextInt();
            input.nextLine();
        }

        String[] playername = {null, null, null};
        for(int i = 0; i < playeramount; i++){
            out.println("Vul hier de naam voor speler "+ (i+1) +" (voor een random naam type 'Random'");
            playername[i] = input.nextLine();
            if (playername[i].equals("random") || playername[i].equals("Random") || playername[i].equals("RANDOM")) {
                playerrandom[i] = true;
                playername[i] = randomname[randomnumber(10)];
            }
        }

        if (playername[0].equals(playername[1]) || playername[0].equals(playername[2]))
            if (playerrandom[0] &&(playerrandom[1] || playerrandom[2]))
                playername[0] = randomname[randomnumber(10)];

        while (true) {
            assert playername[1] != null;
            if (!playername[1].equals(playername[2])) break;
            if (playerrandom[1] && playerrandom[2])
                    playername[1] = randomname[randomnumber(10)];
        }
        if (playeramount == 2) {
            while (playerwins[0] < 3 && playerwins[1] < 3) {
                playerhand[0] = randomnumber(2);
                playerhand[1] = randomnumber(2);
                String playerhandconcat = String.valueOf(playerhand[0]) + playerhand[1];
                switch (playerhandconcat) {
                    case "00","11","22" -> out.println("Gelijk, beide hebben: "+itemnaam[playerhand[0]]);

                    case "02","10","21" -> {
                        out.println("Speler 1(" + playername[0] + ") heeft deze ronde gewonnen (" + itemnaam[playerhand[0]] + " (Speler 1) > " + itemnaam[playerhand[1]] + " (Speler 2))");
                        playerwins[0]++;
                    }
                    case "01","20","12" -> {
                        out.println("Speler 2(" + playername[1] + ") heeft deze ronde gewonnen (" + itemnaam[playerhand[1]] + " (Speler 2) > " + itemnaam[playerhand[0]] + " (Speler 1))");
                        playerwins[1]++;
                    }
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
                    case "000","111","222" -> out.println("Iedereen heeft hetzelfde, iedereen heeft " + playerhand[0]);
                    case "012", "021", "102", "120", "201", "210" -> out.println("geen winnaar, deze ronde is iedereen heeft een andere hand");
                    case "022","100","211" -> {
                        out.println("Speler 1(" + playername[0] + ") heeft deze ronde gewonnen ("+itemnaam[playerhand[0]]+" (Speler 1) > "+itemnaam[playerhand[1]]+" (Speler 2 & 3))");
                        playerwins[0]++;
                    }
                    case "010","121","202" -> {
                        out.println("Speler 2(" + playername[1] + ") heeft deze ronde gewonnen ("+itemnaam[playerhand[1]]+" (Speler 2) > "+itemnaam[playerhand[0]]+" (Speler 1 & 3))");
                        playerwins[1]++;
                    }
                    case "001","112","220" -> {
                        out.println("Speler 3(" + playername[2] + ") heeft deze ronde gewonnen ("+itemnaam[playerhand[2]]+" (Speler 3) > "+itemnaam[playerhand[2]]+" (Speler 1 & 2))");
                        playerwins[2]++;
                    }
                    case "002","110","221"-> {
                        out.println("Speler 1 & 2(" +playername[0] + " & " + playername[1] + ") heeft deze ronde gewonnen ("+ itemnaam[playerhand[0]]+" (Speler 1 & 2) > "+itemnaam[playerhand[2]]+" (Speler 3)");
                        playerwins[0]++;
                        playerwins[1]++;
                    }
                    case "020","101","212" -> {
                        out.println("Speler 1 & 3(" + playername[0] + " & " + playername[2] + ") heeft deze ronde gewonnen ("+itemnaam[playerhand[0]]+" (Speler 1 & 3) > "+itemnaam[playerhand[1]]+" (Speler 2))");
                        playerwins[0]++;
                        playerwins[2]++;
                    }
                    case "011","122","200" -> {
                        out.println("Speler 2 & 3(" + playername[1] + " & " + playername[2] + ") heeft deze ronde gewonnen ("+itemnaam[playerhand[1]]+" (Speler 2 & 3) > "+itemnaam[playerhand[0]]+" (Speler 1))");
                        playerwins[1]++;
                        playerwins[2]++;
                    }
                    default -> out.println(oops_fuckup);
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Player " + (i + 1) + "(" + playername[i] + ") " + (playerwins[i] >= 3 ? "wins" : "lost"));
        }
        if (debug.equals("ja") || debug.equals("Ja") || debug.equals("JA"))
            for (int i = 0; i < 3; i++) {
                out.println("VAR$playerwins[" + i + "]: " + playerwins[i]);
                out.println("Latest Hand Data/LHD Player 1: " + playerhand[i]);
            }
    }
    private static int randomnumber(int max) {
        return random.nextInt(max + 1);
    }
}