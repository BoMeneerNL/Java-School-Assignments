package net.bomeneer.java;


import java.util.*;

public class RockPaperScissors {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main() {
        String exit;
        // 0 = Steen, 1 = Papier,2 = Schaar
        // debug sequence 1 - Start
        String debug;
        System.out.println("Start?, click [ENTER]");
        debug = input.nextLine();
        // debug sequence 1 - End
        // Vartable - Start
        boolean player1random;
        boolean player2random;
        boolean player3random;
        player1random = false;
        player2random = false;
        player3random = false;
        int getrandomcount;
        int playeramount;
        String player1name;
        String player2name;
        String player3name = null;
        int player1wins;
        player1wins = 0;
        int player2wins;
        player2wins = 0;
        int player3wins;
        player3wins = 0;
        int player1hand = 0;
        int player2hand = 0;
        int player3hand = 0;
        int playeramountfilltime;
        playeramountfilltime = 0;
        // Vartable - End
        // RandomNames - Start
        String[] randomname = new String[11];
        randomname[0] = "STROS";
        randomname[1] = "Windows";
        randomname[2] = "MacOSX";
        randomname[3] = "Ubuntu";
        randomname[4] = "CentOS";
        randomname[5] = "RHEL";
        randomname[6] = "Arch Linux";
        randomname[7] = "TempleOS";
        randomname[8] = "Linux Mint";
        randomname[9] = "vSphere";
        randomname[10] = "ProxMox";
        // RandomNames - End
        // PlayerAmount - Start
        playeramount = 0;
        while (playeramount <= 1 || playeramount >= 4) {
            if (playeramountfilltime == 0) {
                System.out.println("hoeveel spelers? (2 of 3)");
                playeramountfilltime = playeramountfilltime + 1;
            } else {
                System.out.println("dit aantal spelers is niet mogelijk, je kan dit spelen met 2 of 3 spelers");
                playeramountfilltime = playeramountfilltime + 1;
            }
            playeramount = input.nextInt();
        }
        // PlayerAmount - End
        // ChooseNames - Start
        System.out.println("Vul hier de naam voor speler 1 (voor een random naam type 'Random'");
        player1name = input.nextLine();
        if (player1name.equals("random") || player1name.equals("Random") || player1name.equals("RANDOM")) {
            player1random = true;
            getrandomcount = random.nextInt(11);
            player1name = randomname[getrandomcount];
            // changing GRC to random higher then excpected
            getrandomcount = 9001;
        }
        System.out.println("Vul hier de naam voor speler 2 (voor een random naam type 'Random'");
        player2name = input.nextLine();
        if (player2name.equals("random") || player2name.equals("Random") || player2name.equals("RANDOM")) {
            player2random = true;
            getrandomcount = random.nextInt(11);
            player2name = randomname[getrandomcount];
            getrandomcount = 9001;
        }
        if (playeramount == 3) {
            System.out.println("Vul hier de naam voor speler 3 (voor een random naam type 'Random'");
            player3name = input.nextLine();
            if (player3name.equals("random") || player3name.equals("Random") || player3name.equals("RANDOM")) {
                getrandomcount = random.nextInt(11);
                player3name = randomname[getrandomcount];
                getrandomcount = 9001;
            }
        }
        // ChooseNames - End
        // FixConflictedNames - Start
        while (player1name.equals(player2name) || player1name.equals(player3name)) {
            if (player1random) {
                if (player2random || player3random) {
                    getrandomcount = random.nextInt(11);
                    player1name = randomname[getrandomcount];
                    getrandomcount = 9001;
                } else {
                    System.out.println("[LOG]: Picked-up Warning: Error_==NotRandom, no action needed");
                }
            } else {
                System.out.println("[LOG]: Picked-up Warning: Error_==NotRandom, no action needed");
            }
        }
        while (player2name.equals(player3name)) {
            if (player2random) {
                if (player3random) {
                    getrandomcount = random.nextInt(11);
                    player2name = randomname[getrandomcount];
                    getrandomcount = 9001;
                } else {
                    System.out.println("[LOG]: Picked-up Warning: Error_==NotRandom, no action needed");
                }
            } else {
                System.out.println("[LOG]: Picked-up Warning: Error_==NotRandom, no action needed");
            }
        }
        // FixConflictedNames - End
        // ChoosingHand - Start
        // ChoosingHand - End
        // AutoSelector - Start
        if (playeramount == 2) {
            while (player1wins < 3 && player2wins < 3) {
                player1hand = random.nextInt(2);
                player2hand = random.nextInt(2);
                if (player1hand == 0) {
                    if (player2hand == 0) {
                        System.out.println("Gelijk, beide Steen");
                    } else {
                        if (player2hand == 1) {
                            player2wins = player2wins + 1;
                            System.out.print("Speler 2(");
                            System.out.print(player2name);
                            System.out.println(") heeft deze ronde gewonnen (Papier (Speler 2) > Steen (Speler1))");
                        } else {
                            if (player2hand == 2) {
                                player1wins = player1wins + 1;
                                System.out.print("Speler 1(");
                                System.out.print(player1name);
                                System.out.println(") heeft deze ronde gewonnen (Steen (Speler1) > Schaar (Speler 2))");
                            } else {
                                System.out.println("Ah yes the program fucked up bigtimes, oops");
                            }
                        }
                    }
                } else {
                    if (player1hand == 1) {
                        if (player2hand == 0) {
                            player1wins = player1wins + 1;
                            System.out.print("Speler 1(");
                            System.out.print(player1name);
                            System.out.println(") heeft deze ronde gewonnen (Papier (Speler 1) > Steen (Speler 2))");
                        } else {
                            if (player2hand == 1) {
                                System.out.println("Gelijk, beide Papier");
                            } else {
                                if (player2hand == 2) {
                                    player2wins = player2wins + 1;
                                    System.out.print("Speler 2(");
                                    System.out.print(player2name);
                                    System.out.println(") heeft deze ronde gewonnen (Schaar (Speler 2) > Papier (Speler 1))");
                                } else {
                                    System.out.println("Ah yes the program fucked up bigtimes, oops");
                                }
                            }
                        }
                    } else {
                        if (player1hand == 2) {
                            if (player2hand == 0) {
                                player2wins = player2wins + 1;
                                System.out.print("Speler 2(");
                                System.out.print(player2name);
                                System.out.println(") heeft deze ronde gewonnen (Papier (Speler 2) > Steen (Speler 1))");
                            } else {
                                if (player2hand == 1) {
                                    player1wins = player1wins + 1;
                                    System.out.print("Speler 1(");
                                    System.out.print(player1name);
                                    System.out.println(") heeft deze ronde gewonnen (Schaar (Speler 1) > Papier (Speler 2))");
                                } else {
                                    if (player2hand == 2) {
                                        System.out.println("Gelijk, beide Schaar");
                                    } else {
                                        System.out.println("Ah yes the program fucked up bigtimes, oops");
                                    }
                                }
                            }
                        } else {
                            System.out.println("Ah yes the program fucked up bigtimes, oops");
                        }
                    }
                }
            }
        }
        if (playeramount == 3) {
            while (player1wins < 3 && player2wins < 3 && player3wins < 3) {
                player1hand = random.nextInt(2);
                player2hand = random.nextInt(2);
                player3hand = random.nextInt(2);
                if (player1hand == 0) {
                    if (player2hand == 0) {
                        if (player3hand == 0) {
                            System.out.println("Iedereen heeft hetzelfde, iedereen heeft steen");
                        } else {
                            if (player3hand == 1) {
                                System.out.print("Speler 3(");
                                System.out.print(player3name);
                                System.out.println(") heeft deze ronde gewonnen (Papier (Speler 3) > Steen (Speler 1 & 2))");
                                player3wins = player3wins + 1;
                            } else {
                                if (player3hand == 2) {
                                    System.out.print("Speler 1 & 2(");
                                    System.out.print(player1name);
                                    System.out.print(" & ");
                                    System.out.print(player2name);
                                    System.out.println(") heeft deze ronde gewonnen (Steen (Speler 1 & 2 ) > Schaar (Speler 3)");
                                    player1wins = player1wins + 1;
                                    player2wins = player2wins + 1;
                                }
                            }
                        }
                    } else {
                        if (player2hand == 1) {
                            if (player3hand == 0) {
                                System.out.print("Speler 2(");
                                System.out.print(player2name);
                                System.out.println(") heeft deze ronde gewonnen (Papier (Speler 2) > Steen (Speler 1 & 3))");
                                player2wins = player2wins + 1;
                            } else {
                                if (player3hand == 1) {
                                    System.out.print("Speler 2 & 3(");
                                    System.out.print(player2name);
                                    System.out.print(" & ");
                                    System.out.print(player3name);
                                    System.out.println(") heeft deze ronde gewonnen (Papier (Speler 2 & 3) > Steen (Speler 1))");
                                    player2wins = player2wins + 1;
                                    player3wins = player3wins + 1;
                                } else {
                                    if (player3hand == 2) {
                                        System.out.println("gelijk, alles (SPS_i1)");
                                    }
                                }
                            }
                        } else {
                            if (player2hand == 2) {
                                if (player3hand == 0) {
                                    System.out.print("Speler 1 & 3(");
                                    System.out.print(player1name);
                                    System.out.print(" & ");
                                    System.out.print(player3name);
                                    System.out.println(") heeft deze ronde gewonnen (Steen (Speler 1 & 3) > Schaar (Speler 2))");
                                    player1wins = player1wins + 1;
                                    player3wins = player3wins + 1;
                                } else {
                                    if (player3hand == 1) {
                                        System.out.println("gelijk, alles (SPS_i1)");
                                    } else {
                                        if (player3hand == 2) {
                                            System.out.print("Speler 1(");
                                            System.out.print(player1name);
                                            System.out.println(") heeft deze ronde gewonnen (Steen (Speler 1) > Schaar (Speler 2 & 3))");
                                            player1wins = player1wins + 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (player1hand == 1) {
                        if (player2hand == 0) {
                            if (player3hand == 0) {
                                System.out.print("Speler 1(");
                                System.out.print(player1name);
                                System.out.println(") heeft deze ronde gewonnen (Papier (Speler 1) > Steen (Speler 2 & 3))");
                                player1wins = player1wins + 1;
                            } else {
                                if (player3hand == 1) {
                                    System.out.print("Speler 1 & 3(");
                                    System.out.print(player1name);
                                    System.out.print(" & ");
                                    System.out.print(player3name);
                                    System.out.println(") heeft deze ronde gewonnen (Papier (Speler 1 & 3) > Steen (Speler 2))");
                                    player1wins = player1wins + 1;
                                    player3wins = player3wins + 1;
                                } else {
                                    if (player3hand == 2) {
                                        System.out.println("gelijk, alles (SPS_i1)");
                                    }
                                }
                            }
                        } else {
                            if (player2hand == 1) {
                                if (player3hand == 0) {
                                    System.out.print("Speler 1 & 2(");
                                    System.out.print(player1name);
                                    System.out.print(" & ");
                                    System.out.print(player2name);
                                    System.out.println(") heeft deze ronde gewonnen (Papier (Speler 1 & 2) > Steen (Speler 3))");
                                    player1wins = player1wins + 1;
                                    player2wins = player2wins + 1;
                                } else {
                                    if (player3hand == 1) {
                                        System.out.println("Iedereen heeft hetzelfde, iedereen heeft papier");
                                    } else {
                                        if (player3hand == 2) {
                                            System.out.print("Speler 3(");
                                            System.out.print(player3name);
                                            System.out.println(") heeft deze ronde gewonnen (Schaar (Speler 3) > Papier (Speler 1 & 2))");
                                            player3wins = player3wins + 1;
                                        }
                                    }
                                }
                            } else {
                                if (player2hand == 2) {
                                    if (player3hand == 0) {
                                        System.out.println("gelijk, alles (SPS_i1)");
                                    } else {
                                        if (player3hand == 1) {
                                            System.out.print("Speler 2(");
                                            System.out.print(player2name);
                                            System.out.println(") heeft deze ronde gewonnen (Schaar (Speler 2) > Papier (Speler 1 & 3))");
                                            player2wins = player2wins + 1;
                                        } else {
                                            if (player3hand == 2) {
                                                System.out.print("Speler 2 & 3(");
                                                System.out.print(player2name);
                                                System.out.print(" & ");
                                                System.out.print(player3name);
                                                System.out.println(") heeft deze ronde gewonnen (Schaar (Speler 2 & 3) > Papier (Speler 1))");
                                                player2wins = player2wins + 1;
                                                player3wins = player3wins + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (player1hand == 2) {
                            if (player2hand == 0) {
                                if (player3hand == 0) {
                                    System.out.print("Speler 2 & 3(");
                                    System.out.print(player2name);
                                    System.out.print(" & ");
                                    System.out.print(player3name);
                                    System.out.println(") heeft deze ronde gewonnen (Steen (Speler 2 & 3) > Schaar (Speler 1))");
                                    player2wins = player2wins + 1;
                                    player3wins = player3wins + 1;
                                } else {
                                    if (player3hand == 1) {
                                        System.out.println("gelijk, alles (SPS_i1)");
                                    } else {
                                        if (player3hand == 2) {
                                            System.out.print("Speler 2(");
                                            System.out.print(player2name);
                                            System.out.println(") heeft deze ronde gewonnen (Schaar (Speler 2) > Papier (Speler 1 & 3))");
                                            player2wins = player2wins + 1;
                                        }
                                    }
                                }
                            } else {
                                if (player2hand == 1) {
                                    if (player3hand == 0) {
                                        System.out.println("gelijk, alles (SPS_i1)");
                                    } else {
                                        if (player3hand == 1) {
                                            System.out.print("Speler 1(");
                                            System.out.print(player1name);
                                            System.out.println(") heeft deze ronde gewonnen (Schaar (Speler 1) > Papier (Speler 2 & 3))");
                                            player1wins = player1wins + 1;
                                        } else {
                                            if (player3hand == 2) {
                                                System.out.print(player1name);
                                                System.out.print(" & ");
                                                System.out.print(player3name);
                                                System.out.println(") heeft deze ronde gewonnen (Schaar (Speler 1 & 3) > Papier (Speler 2))");
                                                player1wins = player1wins + 1;
                                                player3wins = player3wins + 1;
                                            }
                                        }
                                    }
                                } else {
                                    if (player2hand == 2) {
                                        if (player3hand == 0) {
                                            System.out.print("Speler 3(");
                                            System.out.print(player3name);
                                            System.out.println(") heeft deze ronde gewonnen (Steen (Speler 3) > Schaar (Speler 1 & 2))");
                                            player3wins = player3wins + 1;
                                        } else {
                                            if (player3hand == 1) {
                                                System.out.print("Speler 1 & 2(");
                                                System.out.print(player1name);
                                                System.out.print(" & ");
                                                System.out.print(player2name);
                                                System.out.println(") heeft deze ronde gewonnen (Schaar (Speler 1 & 2) > Papier (Speler 3))");
                                                player1wins = player1wins + 1;
                                                player2wins = player2wins + 1;
                                            } else {
                                                if (player3hand == 2) {
                                                    System.out.println("Iedereen heeft hetzelfde, iedereen heeft schaar");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (player1wins >= 3) {
            System.out.println("Player 1 wins");
        }
        if (player2wins >= 3) {
            System.out.println("Player 2 wins");
        }
        if (player3wins >= 3) {
            System.out.println("Player 3 wins");
        }
        if (debug.equals("ja") || debug.equals("Ja") || debug.equals("JA")) {
            System.out.print("VAR$player1wins:");
            System.out.println(player1wins);
            System.out.print("VAR$player2wins:");
            System.out.println(player2wins);
            System.out.print("VAR$player3wins:");
            System.out.println(player3wins);
            System.out.print("Latest Hand Data/LHD Player 1:");
            System.out.println(player1hand);
            System.out.print("Latest Hand Data/LHD Player 2:");
            System.out.println(player2hand);
            System.out.print("Latest Hand Data/LHD Player 3:");
            System.out.println(player3hand);
        }
        System.out.println("Press [ENTER] to exit...");
        exit = input.nextLine();
    }
}
