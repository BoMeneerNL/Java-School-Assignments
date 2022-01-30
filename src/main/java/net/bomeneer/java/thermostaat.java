package net.bomeneer.java;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDateTime;

public class thermostaat {
    static String command; //Controlls CL Commands input
    static float settedtempinterval = 0.5f; //Contains tempinterval
    static float nowtemp = 20; //Contains the temperature that it is right now
    static float newtemp; //Contains the new temperature
    static boolean proceed = true; //Controlls Exit@error&leaving
    static boolean tempup; //acts as temperature up or down in changetemp()
    static int begindayhour = 7; //holds data with the beginning hour time of the DAY temperature
    static int begindayminute = 0; //Same as "begindayhour" but then the minutes
    static int enddayhour = 0; //same as begindayhour but for the night
    static int enddayminute =0; //same as begindayminute but for the night
    static float daytemp = 20;
    static float nighttemp = 18.5f;
    static boolean enableddaytime = false; //Read if the user enabled or disabled Day-Night time based temperature
    static String[][] history = { {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null} };
    public static Scanner input = new Scanner(System.in);
    static int gethistorycount;

    //Set history tactic = populate 10>0 if 0 is already populated terminate data of 10 and move 1 spot up
    static void sethistory(String action){
        String day = String.valueOf(LocalDateTime.now().getDayOfMonth());
        String month = String.valueOf(LocalDateTime.now().getMonthValue());
        String year = String.valueOf(LocalDateTime.now().getYear());
        String hour = String.valueOf(LocalDateTime.now().getHour());
        String second = String.valueOf(LocalDateTime.now().getSecond());
        String minute = String.valueOf(LocalDateTime.now().getMinute());

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
            else if(history[looply][0].equals(action) && history[looply][1].equals(day) && history[looply][2].equals(month) && history[looply][3].equals(year) && history[looply][4].equals(hour) && history[looply][5].equals(minute) && history[looply][6].equals(second)){
                looply = -1;
                change = true;
            }
            else{
                looply--;
            }
        }
        if(looply < 0){
            int shuffle = 9;//shuffels history if no empty array is found
            int shuffling = 6;
            int shufflefrom = shuffle - 1;//Shuffels the old to shuffle (is always shuffle -1)
            String[] hissact = {action,day,month,year,hour,minute,second};
            if(!change){
                while(shuffle > 0){
                    while(shuffling >= 0){
                        history[shuffle][shuffling] = history[shufflefrom][shuffling];
                        shuffling--;
                    }
                    shuffle--;
                    shufflefrom--;
                }
                shuffling = 6;
                while(shuffling >= 0){
                    history[0][shuffling] = hissact[shuffling];
                    shuffling--;
                }
            }
        }
        else{System.out.println("oops, something went wrong, exiting");System.exit(1);}

    }

    static void gethistory(int historycounter){
        historycounter = 10 - historycounter;
        if(historycounter < 0 || historycounter > 10){
            throw new IllegalStateException("Unexpected value: " + historycounter + "ERROR.TOHIGH.HISTORY_ARRAY");
        }
        while(historycounter <= 9){
            System.out.println("an action (" + history[historycounter][0] + ") has been made on: " + history[historycounter][1] + "-" + history[historycounter][2] + "-" + history[historycounter][3] + " " + history[historycounter][4] + ":" + history[historycounter][5] + ":" + history[historycounter][6]);
            historycounter++;
        }
    }

    static void changetemp(float tempinterval, double oldtemp, float tempnewtemp, boolean temptempup){
        sethistory("changed temperature, from: " + oldtemp + " to ");
        if(temptempup){
            while(nowtemp < tempnewtemp){
                nowtemp = nowtemp + tempinterval;
                System.out.println(nowtemp);
            }
            if(nowtemp > newtemp){
                nowtemp = newtemp;
                System.out.println(nowtemp);
            }
        }
        else {
            while(nowtemp > tempnewtemp){
                nowtemp = nowtemp - tempinterval;
                System.out.println(nowtemp);
            }
            if(nowtemp < newtemp){
                nowtemp = newtemp;
                System.out.println(nowtemp);
            }

        }
        System.out.println("done, new temprature is: " + nowtemp);
    }
    static void main(){
        System.out.println("""
                *=========================================================*\r
                |                  Bo's Java Assignments                  |\r
                |  https://github.com/BoMeneerNL/Java-School-Assignments  |\r
                *=========================================================*""");
        poweron();
    }
    static void poweron(){
        sethistory("Powered on System");
        while(proceed){
            System.out.print("SRCLA?/Thermostaat@192.168.1.99>");
            command = input.nextLine();
            switch (command) {
                case "setinterval"->{
                    System.out.println("To what interval do you want to set your thermostat? (if using decimals ONLY use a comma(,), not a dot(.) )");
                    System.out.print("SRCLA?/Thermostaat@192.168.1.99/SetInterval>");
                    try {
                        settedtempinterval = input.nextFloat();
                    } catch (InputMismatchException exception) {
                        System.out.println("Oops, your action is canceled because: Invalid input (" + exception + ")");
                    }
                    System.out.println("New Interval: " + settedtempinterval);
                }
                case "settemp"-> {
                    System.out.println("What do you want to be the new temperature?");
                    System.out.print("SRCLA?/Thermostaat@192.168.1.99/SetNewTemp>");
                    try {
                        newtemp = input.nextFloat();
                    } catch (InputMismatchException exception) {
                        System.out.println("Oops, your input was not allowed");
                    }
                    tempup = (newtemp > nowtemp);

                    changetemp(settedtempinterval, nowtemp, newtemp, tempup);
                    sethistory("changed temperature from" + nowtemp + "°C to" + newtemp + "°C");
                }
                case "history"->{
                    System.out.println("how many history spaces do you want to see?");
                    try {
                        gethistorycount = input.nextInt();
                    } catch (InputMismatchException exception) {
                        System.out.println("Oops, your input is not allowed, only numbers are allowed");
                    }
                    if (gethistorycount <= 10) {
                        gethistory(gethistorycount);
                    }
            }
            case "changetimes"->{
                    sethistory("change day time");
                    System.out.println("to what hour do you want to start the day time temperature?");
                    System.out.print("SRCLA?/Thermostaat@192.168.1.99/SetDayTime/SetBeginDayHour>");
                    try {
                        begindayhour = input.nextInt();
                    } catch (InputMismatchException exception) {
                        System.out.println("only use integers");
                    }
                    System.out.println("to what minute do you want to start the day time temperature?");
                    System.out.print("SRCLA?/Thermostaat@192.168.1.99/SetDayTime/SetBeginDayMinute>");
                    try {
                        begindayminute = input.nextInt();
                    } catch (InputMismatchException exception) {
                        System.out.println("only use integers");
                    }
                    System.out.println("what hour do you want to end daytime and start night time?");
                    System.out.print("SRCLA?/Thermostaat@192.168.1.99/SetDayTime/SetEndDayHour>");
                    try {
                        enddayhour = input.nextInt();
                    } catch (InputMismatchException exception) {
                        System.out.println("only use integers");
                    }
                    System.out.println("What minute do you want to end daytime and start night time?");
                    System.out.print("SRCLA?/Thermostaat@192.168.1.99/SetDayTime/SetEndDayMinute>");
                    try {
                        enddayminute = input.nextInt();
                    } catch (InputMismatchException exception) {
                        System.out.println("only use integers");
                    }
                    if (begindayhour > 23) {
                        System.out.println("begin day hour is not valid, beginhour is changed to 6:*(*)");
                        begindayhour = 6;
                    }
                    if (begindayminute > 59) {
                        System.out.println("begin day hour is not valid, beginhour is changed to *(*):0");
                        begindayminute = 0;
                    }
            }
                case "see times"->{
                    System.out.println("Daytime: " + begindayhour + ":" + begindayminute + " u");
                    System.out.println("Nighttime" + enddayhour + ":" + enddayminute + " u");
            }
                case "set day onoff"->{
                    enableddaytime = !enableddaytime;
                    sethistory("set day onoff to " + (enableddaytime ? "on" : "off"));
                }
                case "set momenttemps", "set dbtemps" -> {
                    System.out.println("To what temperature do you want to set the day time temperature? (only use ',' not a '.'");
                    System.out.print("SRCLA?/Thermostaat@192.168.1.99/SetDayNightTemp/SetDayTemp>");
                    try {
                        daytemp = input.nextFloat();
                    } catch (InputMismatchException exception) {
                        System.out.println("only use an , instead of a .");
                    }
                    System.out.println("To what temperature do you want to set the night time temperature? (only use ',' not a '.'");
                    System.out.print("SRCLA?/Thermostaat@192.168.1.99/SetDayNightTemp/SetNightTemp>");
                    try {
                        nighttemp = input.nextFloat();
                    } catch (InputMismatchException exception) {
                        System.out.println("only use an , instead of a .");
                    }
                }
                case "gettemp", "geti temp" -> {
                    sethistory("Get Temperature");
                    System.out.println("Your current temperature is: " + nowtemp + "°C");
                }
                case "icall geti", "vardump" -> {
                    String[] lines = {
                    "\n", "I(nternal)CALL GETInfo/VAR Dump: ", "VAR$command " + command, "VAR$settedtempinterval: " + settedtempinterval,
                    "VAR$settedtempinterval: " + settedtempinterval, "VAR$nowtemp: " + nowtemp, "VAR$newtemp: " + newtemp, "VAR$proceed:" + proceed,
                    "VAR$tempup: " + tempup, "VAR$begindayminute: " + begindayminute, "VAR$enddayhour: " + enddayhour, "VAR$enddayminute: " + enddayminute,
                            "VAR$daytemp: " + daytemp,"VAR$nighttemp: " + nighttemp
                    };
                    for (String line : lines)
                        System.out.println(line);

                    for(int i = 0; i < history.length; i++)
                        System.out.println("ARRAY.VAR$history["+ i +"] = " + history[i][0] + "," + history[i][1] + "," + history[i][2] + "," + history[i][3] + "," + history[i][4] + "," + history[i][5] + "," + history[i][6]);
                }
                case "poweroff" -> poweroff();
                case "exit","end"-> proceed = false;
            }
            }
        }
    static void poweroff(){
        sethistory("Powered off System");
        int jeff = 0;
        while (jeff == 0){
            System.out.print("SRCLA?/SSH@NotConnected>");
            command = input.nextLine();
            switch (command) {
                case "poweron" -> {
                    jeff = 1;
                    sethistory("Powered on System");
                }
                case "poweroff", "icall getti" -> System.out.println("Could not execute command, err_noncon");
                case "exit" -> System.exit(0);
            }
        }
    }
}