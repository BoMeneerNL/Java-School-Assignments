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
    static LocalDateTime now = LocalDateTime.now();

    //Set history tactic = populate 10>0 if 0 is already populated terminate data of 10 and move 1 spot up
    static void sethistory(String action, String day, String month, String year, String hour, String minute, String second){
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
        if(history[looply][0] == action && history[looply][1] == day && history[looply][2] == month && history[looply][3] == year && history[looply][4] == hour && history[looply][5] == minute && history[looply][6] == second){
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
            if (change){

            }
            else if(!change){
                while(shuffle > 0){
                    shufflefrom = shuffle - 1;
                    history[shuffle][0] = history[shufflefrom][0];
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
            else{out.println("oops, something went wrong, exiting");System.exit(1);}
        }
        else{out.println("oops, something went wrong, exiting");System.exit(1);}

    }

    static void gethistory(int historycounter){

    }

    static void changetemp(byte tempinterval, double oldtemp, float tempnewtemp, boolean temptempup){
        sethistory("changed temperature",String.valueOf(now.getDayOfMonth()),String.valueOf(now.getMonthValue()),String.valueOf(now.getYear()),String.valueOf(now.getHour()),String.valueOf(now.getMinute()),String.valueOf(now.getSecond()));
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
        out.println("*=========================================================*\r\n|                  Bo's Java Assignments                  |\r\n|                Version: 1.0 (JavBuild)                  |\r\n|  https://github.com/BoMeneerNL/Java-School-Assignments  |\r\n|                     STRCL-CLI/SRCLA                     |\n" + "|           https://github.com/BoMeneerNL/SRCLA           |\n*=========================================================*");
        poweron();
    }
    static void poweron(){
        sethistory("Powered on System",String.valueOf(now.getDayOfMonth()),String.valueOf(now.getMonthValue()),String.valueOf(now.getYear()),String.valueOf(now.getHour()),String.valueOf(now.getMinute()),String.valueOf(now.getSecond()));
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
                    out.println("to what hour do you want to start the DAY time temperature?");
                    out.print("SRCLA?/Thermostaat@192.168.1.99/SetDayTime");
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
        sethistory("Powered off System",String.valueOf(now.getDayOfMonth()),String.valueOf(now.getMonthValue()),String.valueOf(now.getYear()),String.valueOf(now.getHour()),String.valueOf(now.getMinute()),String.valueOf(now.getSecond()));
        int jeff = 0;
        while (jeff == 0){
            out.print("SRCLA?/SSH@NotConnected>");
            command = input.nextLine();
            switch (command) {
                case "poweron":
                    poweron();
                    break;
                case "poweroff":
                case "icall getti":
                case "changetimes":
                    out.println("Could not execute command, err_noncon");
                    break;
                case "exit program":
                    System.exit(0);
                    jeff = 1;
            }
        }
    }
}