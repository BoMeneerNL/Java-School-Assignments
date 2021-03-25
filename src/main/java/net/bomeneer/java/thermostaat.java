package net.bomeneer.java;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.*;

public class thermostaat {
    static String command;
    static byte settedtempinterval;
    static float nowtemp = 20;
    static float newtemp;
    static boolean proceed = true;
    static boolean tempup;
    public static Scanner input = new Scanner(System.in);
    static void changetemp(byte tempinterval, double oldtemp, float tempnewtemp, boolean temptempup){
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
                    out.println("What do you want to be the new temprature?");
                    newtemp = input.nextFloat();
                    if (newtemp > nowtemp){tempup = true;}
                    else if(newtemp < nowtemp){tempup = false;}
                    changetemp(settedtempinterval,nowtemp,newtemp,tempup);
                    break;
                case "icall geti":
                    out.println("I(nternal)CALL GETInfo/VAR Dump: ");
                    out.println("VAR$command = " + command);
                    out.println("VAR$settedtempinterval = " + settedtempinterval);
                    out.println("VAR$nowtemp = " + nowtemp);
                    out.println("VAR$newtemp = " + newtemp);
                    out.println("VAR$proceed = " + proceed);
                    out.println("VAR$tempup =" + tempup);
                    break;
                case "exit":
                case "end":
                    proceed = false;
                    break;
                default:
            }
        }
    }
}
