package net.bomeneer.java;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDateTime;

import static java.lang.System.out;

public class thermostaat {
    static String command; //Controlls CL Commands input
    static byte settedtempinterval; //Contains tempinterval
    static float nowtemp = 20; //Contains the temperature that it is right now
    static float newtemp; //Contains the new temperature
    static boolean proceed = true; //Controlls Exit@error&leaving
    static boolean tempup; //acts as temperature up or down in changetemp()
    static int begindayhour; //holds data with the beginning hour time of the DAY temperature
    static int begindayminute; //Same as "begindayhour" but then the minutes
    static boolean enableddaytime = false; //Read if the user enabled or disabled Day-Night time based temperature
    static String[][] history = { {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null} };
    public static Scanner input = new Scanner(System.in);
    static LocalDateTime now;

    static void timeset(){
        now = LocalDateTime.now();
    }

    //Set history tactic = populate 10>0 if 0 is already populated terminate data of 10 and move 1 spot up
    static void sethistory(String action){
        timeset();
        String day = String.valueOf(now.getDayOfMonth());
        String month = String.valueOf(now.getMonthValue());
        String year = String.valueOf(now.getYear());
        String hour = String.valueOf(now.getHour());
        String minute = String.valueOf(now.getMinute());
        String second = String.valueOf(now.getSecond());
    int looply = 9;
    boolean change = false;
    while (looply >= 0){
        if(history[looply][0] == null && history[looply][1] == null && history[looply][2] == null && history[looply][3] == null && history[looply][4] == null && history[looply][5] == null && history[looply][6] == null){
            history[looply][0] = action;
            history[looply][1] = day;
            history[looply][2] = month;
            history[looply][3] = year;
            history[looply][4] = hour;
            history[looply][5] = minute;
            history[looply][6] = second;

        }
        else if(history[looply][0] == action && history[looply][1] == day && history[looply][2] == month && history[looply][3] == year && history[looply][4] == hour && history[looply][5] == minute && history[looply][6] == second){
            looply = -1;
             change = true;
        }
        else{
            looply--;
        }
    }
        if(looply < 0){
            int shuffle = 9;//shuffels history if no empty array is found
            int shufflefrom;//Shuffels the old to shuffle (is always shuffle -1)
            if(!change){
                while(shuffle > 0){
                    shufflefrom = shuffle - 1;
                    history[shuffle][0] = history[shufflefrom][0];
                    history[shuffle][1] = history[shufflefrom][1];
                    history[shuffle][2] = history[shufflefrom][2];
                    history[shuffle][3] = history[shufflefrom][3];
                    history[shuffle][4] = history[shufflefrom][4];
                    history[shuffle][5] = history[shufflefrom][5];
                    history[shuffle][6] = history[shufflefrom][6];
                    shuffle--;
                }
                history[0][0] = action;
                history[0][1] = day;
                history[0][2] = month;
                history[0][3] = year;
                history[0][4] = hour;
                history[0][5] = minute;
                history[0][6] = second;
            }
            if(change){}
            else{out.println("oops, something went wrong, exiting");System.exit(1);}
        }
        else{out.println("oops, something went wrong, exiting");System.exit(1);}

    }

    static void gethistory(int historycounter){
        switch (historycounter) {
            case 1 -> historycounter = 9;
            case 2 -> historycounter = 8;
            case 3 -> historycounter = 7;
            case 4 -> historycounter = 6;
            //case 5 removed because 5 is already 5
            case 6 -> historycounter = 4;
            case 7 -> historycounter = 3;
            case 8 -> historycounter = 2;
            case 9 -> historycounter = 1;
            case 10 -> historycounter = 0;
            default -> throw new IllegalStateException("Unexpected value: " + historycounter);
        }
        while(historycounter <= 9){
            out.println("an action" +(history[historycounter][0]) + " has been made on:" + history[historycounter][1] + "-" + history[historycounter][2]);
            historycounter++;
        }
    }

    static void changetemp(byte tempinterval, double oldtemp, float tempnewtemp, boolean temptempup){
        sethistory("changed temperature, from: " + oldtemp + " to ");
        if(temptempup){
            while(nowtemp < tempnewtemp){
                nowtemp = nowtemp + tempinterval;
                out.println(nowtemp);
            }
        }
        else if(!temptempup){
            while(nowtemp > tempnewtemp){
                nowtemp = nowtemp - tempinterval;
                out.println(nowtemp);
            }

        }
        else {
            out.println("Oops, something went wrong :(");
        }
        out.println("done, new temprature is: " + nowtemp);
    }
    static void main(){
        out.println("""
                *=========================================================*\r
                |                  Bo's Java Assignments                  |\r
                |                Version: 1.0 (JavBuild)                  |\r
                |  https://github.com/BoMeneerNL/Java-School-Assignments  |\r
                |                     STRCL-CLI/SRCLA                     |
                |           https://github.com/BoMeneerNL/SRCLA           |
                *=========================================================*""");
        poweron();
    }
    static void poweron(){
        sethistory("Powered on System");
        while(proceed){
            out.print("SRCLA?/Thermostaat@192.168.1.99>");
            command = input.nextLine();
            switch (command){
                case "setinterval":
                    out.println("To what interval do you want to set your thermostat? (only use full numbers)");
                    out.print("SRCLA?/Thermostaat@192.168.1.99/SetInterval>");
                    try {
                        settedtempinterval = input.nextByte();
                        out.println("New Interval: " + settedtempinterval);
                    }
                    catch (InputMismatchException exception){
                        out.println("Oops, this command only accepts between -127 and 127 and doesn't support decimal numbers");
                    }
                break;
                case "settemp":
                    out.println("What do you want to be the new temperature?");
                    out.print("SRCLA?/Thermostaat@192.168.1.99/SetNewTemp>");
                    newtemp = input.nextFloat();
                    if (newtemp > nowtemp){tempup = true;}
                    else if(newtemp < nowtemp){tempup = false;}
                    changetemp(settedtempinterval,nowtemp,newtemp,tempup);
                    break;
                case "changetimes":
                    sethistory("change day time");
                    out.println("to what hour do you want to start the DAY time temperature?");
                    out.print("SRCLA?/Thermostaat@192.168.1.99/SetDayTime>");





                    break;
                case "set day onoff":
                    if(enableddaytime){
                    out.print("changed day & night scheme to: off");
                    enableddaytime = false;
                    }
                    else if(!enableddaytime){
                        out.println("changed day & night scheme to: on");
                        enableddaytime = true;
                    }
                    else {
                        out.println("oops, something went wrong, nothing has changed");
                    }
                    break;
                case "gettemp":
                case "geti temp":
                    sethistory("Get Temperature");
                    out.println("Your current temperature is: " + nowtemp + "°C");
                    break;
                case "icall geti":
                    out.println("\n");
                    out.println("I(nternal)CALL GETInfo/VAR Dump: ");
                    out.println("VAR$command = " + command);
                    out.println("VAR$settedtempinterval = " + settedtempinterval);
                    out.println("VAR$nowtemp = " + nowtemp);
                    out.println("VAR$newtemp = " + newtemp);
                    out.println("VAR$proceed = " + proceed);
                    out.println("VAR$tempup = " + tempup);
                    out.println("VAR$begindayhour = " + begindayhour);
                    out.println("VAR$begindayminute = " + begindayminute);
                    out.println("VAR$enableddaytime = " + enableddaytime);
                    out.println("ARRAY.VAR$history[0] = " + history[0][0] + "," + history[0][1] + "," + history[0][2] + "," + history[0][3] + "," + history[0][4] + "," + history[0][5] + "," + history[0][6]);
                    out.println("ARRAY.VAR$history[1] = " + history[1][0] + "," + history[1][1] + "," + history[1][2] + "," + history[1][3] + "," + history[1][4] + "," + history[1][5] + "," + history[1][6]);
                    out.println("ARRAY.VAR$history[2] = " + history[2][0] + "," + history[2][1] + "," + history[2][2] + "," + history[2][3] + "," + history[2][4] + "," + history[2][5] + "," + history[2][6]);
                    out.println("ARRAY.VAR$history[3] = " + history[3][0] + "," + history[3][1] + "," + history[3][2] + "," + history[3][3] + "," + history[3][4] + "," + history[3][5] + "," + history[3][6]);
                    out.println("ARRAY.VAR$history[4] = " + history[4][0] + "," + history[4][1] + "," + history[4][2] + "," + history[4][3] + "," + history[4][4] + "," + history[4][5] + "," + history[4][6]);
                    out.println("ARRAY.VAR$history[5] = " + history[5][0] + "," + history[5][1] + "," + history[5][2] + "," + history[5][3] + "," + history[5][4] + "," + history[5][5] + "," + history[5][6]);
                    out.println("ARRAY.VAR$history[6] = " + history[6][0] + "," + history[6][1] + "," + history[6][2] + "," + history[6][3] + "," + history[6][4] + "," + history[6][5] + "," + history[6][6]);
                    out.println("ARRAY.VAR$history[7] = " + history[7][0] + "," + history[7][1] + "," + history[7][2] + "," + history[7][3] + "," + history[7][4] + "," + history[7][5] + "," + history[7][6]);
                    out.println("ARRAY.VAR$history[8] = " + history[8][0] + "," + history[8][1] + "," + history[8][2] + "," + history[8][3] + "," + history[8][4] + "," + history[8][5] + "," + history[8][6]);
                    out.println("ARRAY.VAR$history[9] = " + history[9][0] + "," + history[9][1] + "," + history[9][2] + "," + history[9][3] + "," + history[9][4] + "," + history[9][5] + "," + history[9][6]);
                    break;
                case "poweroff":
                    poweroff();
                    break;
                case "exit":
                case "end":
                    proceed = false;
                    break;
                default:
            }
        }
    }
    static void poweroff(){
        sethistory("Powered off System");
        int jeff = 0;
        while (jeff == 0){
            out.print("SRCLA?/SSH@NotConnected>");
            command = input.nextLine();
            switch (command) {
                case "poweron" -> poweron();
                case "poweroff", "icall getti" -> out.println("Could not execute command, err_noncon");
                case "exit program" -> {
                    System.exit(0);
                    jeff = 1;
                }
            }
        }
    }
}