package net.bomeneer.java;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.out;

public class thermostaat {
    public static Scanner input = new Scanner(System.in);
    static String command; //Controlls CL Commands input
    static float settedtempinterval = 0.5f; //Contains tempinterval
    static float nowtemp = 20; //Contains the temperature that it is right now
    static float newtemp; //Contains the new temperature
    static boolean proceed = true; //Controlls Exit@error&leaving
    static boolean tempup; //acts as temperature up or down in changetemp()
    static int begindayhour = 7; //holds data with the beginning hour time of the DAY temperature
    static int begindayminute = 0; //Same as "begindayhour" but then the minutes
    static int enddayhour = 0; //same as begindayhour but for the night
    static int enddayminute = 0; //same as begindayminute but for the night
    static float daytemp = 20;
    static float nighttemp = 18.5f;
    static boolean enableddaytime = false; //Read if the user enabled or disabled Day-Night time based temperature
    static String[][] history = {{null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}};
    static LocalDateTime now;
    static int gethistorycount;

    static void timeset() {
        now = LocalDateTime.now();
    }

    //Set history tactic = populate 10>0 if 0 is already populated terminate data of 10 and move 1 spot up
    static void sethistory(String action) {
        timeset();
        String[] moment = {String.valueOf(now.getDayOfMonth()),String.valueOf(now.getMonthValue()),String.valueOf(now.getYear()),String.valueOf(now.getHour()),String.valueOf(now.getMinute()),String.valueOf(now.getSecond())};
        int looply = 9;
        boolean change = false;
        while (looply >= 0) {
            if (history[looply][0] == null && history[looply][1] == null && history[looply][2] == null && history[looply][3] == null && history[looply][4] == null && history[looply][5] == null && history[looply][6] == null) {
                history[looply][0] = action;
                history[looply][1] = moment[0];
                history[looply][2] = moment[1];
                history[looply][3] = moment[2];
                history[looply][4] = moment[3];
                history[looply][5] = moment[4];
                history[looply][6] = moment[5];

            } else {
                if (!history[looply][0].equals(action) || !history[looply][1].equals(moment[0]) || !history[looply][2].equals(moment[1]) || !history[looply][3].equals(moment[2]) || !history[looply][4].equals(moment[3]) || !history[looply][5].equals(moment[4]) || !history[looply][6].equals(moment[5])) {
                    looply--;
                } else {
                    looply = -1;
                    change = true;
                }
            }
        }
        if (looply < 0) {
            int shuffle = 9;//shuffels history if no empty array is found
            if (!change) {
                while (shuffle > 0) {
                    history[shuffle][0] = history[shuffle - 1][0];
                    history[shuffle][1] = history[shuffle - 1][1];
                    history[shuffle][2] = history[shuffle - 1][2];
                    history[shuffle][3] = history[shuffle - 1][3];
                    history[shuffle][4] = history[shuffle - 1][4];
                    history[shuffle][5] = history[shuffle - 1][5];
                    history[shuffle][6] = history[shuffle - 1][6];
                    shuffle--;
                }
                history[0][0] = action;
                history[0][1] = moment[0];
                history[0][2] = moment[1];
                history[0][3] = moment[2];
                history[0][4] = moment[3];
                history[0][5] = moment[4];
                history[0][6] = moment[5];
            }
            if (!change) {
                out.println("oops, something went wrong, exiting");
                System.exit(1);
            }
        } else {
            out.println("oops, something went wrong, exiting");
            System.exit(1);
        }

    }

    static void gethistory(int historycounter) {
        switch (historycounter) {
            case 1 -> historycounter = 9;
            case 2 -> historycounter = 8;
            case 3 -> historycounter = 7;
            case 4 -> historycounter = 6;
            //case 5 is not present because 5 is already 5
            case 6 -> historycounter = 4;
            case 7 -> historycounter = 3;
            case 8 -> historycounter = 2;
            case 9 -> historycounter = 1;
            case 10 -> historycounter = 0;
            default -> out.println("Oops, this amount is not correct, use between a 1 and 10");
        }
        while (historycounter <= 9) {
            out.println("an action (" + history[historycounter][0] + ") has been made on: " + history[historycounter][1] + "-" + history[historycounter][2] + "-" + history[historycounter][3] + " " + history[historycounter][4] + ":" + history[historycounter][5] + ":" + history[historycounter][6]);
            historycounter++;
        }
    }

    static void changetemp(float tempinterval, double oldtemp, float tempnewtemp, boolean temptempup) {
        sethistory("changed temperature, from: " + oldtemp + " to ");
        if (temptempup) {
            while (nowtemp < tempnewtemp) {
                nowtemp = nowtemp + tempinterval;
                out.println(nowtemp);
            }
            if (nowtemp > newtemp) {
                nowtemp = newtemp;
                out.println(nowtemp);
            }
        } else if (!temptempup) {
            while (nowtemp > tempnewtemp) {
                nowtemp = nowtemp - tempinterval;
                out.println(nowtemp);
            }
            if (nowtemp < newtemp) {
                nowtemp = newtemp;
                out.println(nowtemp);
            }

        } else {
            out.println("Oops, something went wrong :(");
        }
        out.println("done, new temprature is: " + nowtemp);
    }

    static void main() {
        out.println("*=========================================================*\r\n" +
                    "|                  Bo's Java Assignments                  |\r\n" +
                    "|                Version: 1.0 (JavBuild)                  |\r\n" +
                    "|  https://github.com/BoMeneerNL/Java-School-Assignments  |\r\n" +
                    "|                     STRCL-CLI/SRCLA                     |\r\n" +
                    "|           https://github.com/BoMeneerNL/SRCLA           |\r\n" +
                    "*=========================================================*");
        poweron();
    }

    static void poweron() {
        sethistory("Powered on System");
        while (proceed) {
            out.print("SRCLA?/Thermostaat@192.168.1.99>");
            command = input.nextLine();
            switch (command) {
                case "setinterval" ->{
                    out.println("To what interval do you want to set your thermostat? (if using decimals ONLY use a comma(,), not a dot(.) )");
                    out.print("SRCLA?/Thermostaat@192.168.1.99/SetInterval>");
                    try { settedtempinterval = input.nextFloat(); }

                    catch (InputMismatchException exception) { out.println("Oops, your action is canceled because: Invalid input (" + exception + ")"); }
                    out.println("New Interval: " + settedtempinterval);
                }
                case "settemp" ->{
                    out.println("What do you want to be the new temperature?");
                    out.print("SRCLA?/Thermostaat@192.168.1.99/SetNewTemp>");
                    try { newtemp = input.nextFloat(); }

                    catch (InputMismatchException exception) { out.println("Oops, your input was not allowed"); }
                    if (newtemp > nowtemp) { tempup = true; }

                    else if (newtemp < nowtemp) { tempup = false; }
                    changetemp(settedtempinterval, nowtemp, newtemp, tempup);
                    sethistory("changed temperature from" + nowtemp + "°C to" + newtemp + "°C");
                }
                case "history" ->{
                    out.println("how many history spaces do you want to get?");
                    try { gethistorycount = input.nextInt(); }

                    catch (InputMismatchException exception) { out.println("Oops, your input is not allowed, only numbers are allowed"); }

                    if (gethistorycount <= 10) { gethistory(gethistorycount); }
            }
                case "changetimes" ->{
                    sethistory("change day time");
                    out.println("to what hour do you want to start the day time temperature?");
                    out.print("SRCLA?/Thermostaat@192.168.1.99/SetDayTime/SetBeginDayHour>");
                    try { begindayhour = input.nextInt(); }

                    catch (InputMismatchException exception) { out.println("only use integers"); }

                    out.println("to what minute do you want to start the day time temperature?");
                    out.print("SRCLA?/Thermostaat@192.168.1.99/SetDayTime/SetBeginDayMinute>");

                    try { begindayminute = input.nextInt(); }

                    catch (InputMismatchException exception) { out.println("only use integers"); }

                    out.println("what hour do you want to end daytime and start night time?");
                    out.print("SRCLA?/Thermostaat@192.168.1.99/SetDayTime/SetEndDayHour>");
                    try {
                        enddayhour = input.nextInt();
                    } catch (InputMismatchException exception) {
                        out.println("only use integers");
                    }
                    out.println("What minute do you want to end daytime and start night time?");
                    out.print("SRCLA?/Thermostaat@192.168.1.99/SetDayTime/SetEndDayMinute>");
                    try {
                        enddayminute = input.nextInt();
                    } catch (InputMismatchException exception) {
                        out.println("only use integers");
                    }
                    if (begindayhour > 23) {
                        out.println("begin day hour is not valid, beginhour is changed to 6:*(*)");
                        begindayhour = 6;
                    }
                    if (begindayminute > 59) {
                        out.println("begin day hour is not valid, beginhour is changed to *(*):0");
                        begindayminute = 0;
                    }
            }
                case "see times" ->{
                    out.println("Daytime: " + begindayhour + ":" + begindayminute + " u");
                    out.println("Nighttime" + enddayhour + ":" + enddayminute + "u");
            }
                case "set day onoff" ->{
                    if (enableddaytime) {
                        out.print("changed day & night scheme to: off");
                        enableddaytime = false;
                    } else if (!enableddaytime) {
                        out.println("changed day & night scheme to: on");
                        enableddaytime = true;
                    } else {
                        out.println("oops, something went wrong, nothing has changed");
                    }
            }
                case "set momenttemps","set dbtemps" ->{
                    out.println("To what temperature do you want to set the day time temperature? (only use ',' not a '.'");
                    out.print("SRCLA?/Thermostaat@192.168.1.99/SetDayNightTemp/SetDayTemp>");
                    try {
                        daytemp = input.nextFloat();
                    } catch (InputMismatchException exception) {
                        out.println("only use an , instead of a .");
                    }
                    out.println("To what temperature do you want to set the night time temperature? (only use ',' not a '.'");
                    out.print("SRCLA?/Thermostaat@192.168.1.99/SetDayNightTemp/SetNightTemp>");
                    try {
                        nighttemp = input.nextFloat();
                    } catch (InputMismatchException exception) {
                        out.println("only use an , instead of a .");
                    }
            }
                case "gettemp","geti temp" ->{
                    sethistory("Get Temperature");
                    out.println("Your current temperature is: " + nowtemp + "°C");
            }
                case "icall geti","vardump" ->{
                    out.println("\n");
                    out.println("I(nternal)CALL GETInfo/VAR Dump: ");

                    out.println("VAR$command" + command);
                    out.println("VAR$settedtempinterval" + settedtempinterval);
                    out.println("VAR$nowtemp" + nowtemp);
                    out.println("VAR$newtemp" + newtemp);
                    out.println("VAR$proceed" + proceed);
                    out.println("VAR$tempup" + tempup);
                    out.println("VAR$begindayhour" + begindayhour);
                    out.println("VAR$begindayminute" + begindayminute);
                    out.println("VAR$enddayhour" + enddayhour);
                    out.println("VAR$enddayminute" + enddayminute);
                    out.println("VAR$daytemp" + daytemp);
                    out.println("VAR$nighttemp" + nighttemp);
                    int vdhis = 0;
                    while (vdhis <= 9) {
                        out.println("ARRAY.VAR$history[" + vdhis + "] = " + history[vdhis][0] + "," + history[vdhis][1] + "," + history[vdhis][2] + "," + history[vdhis][3] + "," + history[vdhis][4] + "," + history[vdhis][5] + "," + history[vdhis][6]);
                        vdhis++;
                    }
            }
                case "poweroff" ->{ poweroff(); }
                case "exit","end" ->{ proceed = false; }
            }
        }
    }

    static void poweroff() {
        sethistory("Powered off System");
        boolean jeff = true;
        while (jeff) {
            out.print("SRCLA?/SSH@NotConnected>");
            command = input.nextLine();
            switch (command) {
                case "poweron" -> poweron();
                case "poweroff", "icall getti" -> out.println("Could not execute command, err_noncon");
                case "exit program" -> {
                    System.exit(0);
                    jeff = false;
                }
            }
        }
    }
}