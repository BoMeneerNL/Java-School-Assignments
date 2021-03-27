package net.bomeneer.java;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDateTime;

import static java.lang.System.*;

public class thermostaat {
    static String command; //Controlls CL Commands input
    static byte settedtempinterval; //Contains
    static float nowtemp = 20; //Contains
    static float newtemp; //Contains
    static boolean proceed = true; //Controlls Exit@error&leaving
    static boolean tempup; //acts as temperature up or down in changetemp()
    static int begindayhour; //holds data with the beginning hour time of the DAY temperature
    static int begindayminute; //Same as "begindayhour" but then the minutes
    static boolean enableddaytime = false; //Read if the user enabled or disabled Day-Night time based temperature
    String[][] history = { {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null} };
    public static Scanner input = new Scanner(System.in);
    static LocalDateTime now = LocalDateTime.now();
    static void sethistory(String action,int day,int month,int year,int hour,int minute,int second){


    }
    static void gethistory(int historycounter){

    }
    static void changetemp(byte tempinterval, double oldtemp, float tempnewtemp, boolean temptempup){
        sethistory("changed temperature",now.getDayOfMonth(),now.getMonthValue(),now.getYear(),now.getHour(),now.getMinute(),now.getSecond());
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
        sethistory("Powered on System",now.getDayOfMonth(),now.getMonthValue(),now.getYear(),now.getHour(),now.getMinute(),now.getSecond());
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
        sethistory("Powered on System",now.getDayOfMonth(),now.getMonthValue(),now.getYear(),now.getHour(),now.getMinute(),now.getSecond());
        int jeff = 0;
        while (jeff == 0){
            out.print("SRCLA?/SSH@NotConnected>");
            command = input.nextLine();
            switch (command) {
                case "poweron" -> poweron();
                case "exit program" -> {
                    System.exit(0);
                    jeff=1;
                }

            }
        }

    }
}
