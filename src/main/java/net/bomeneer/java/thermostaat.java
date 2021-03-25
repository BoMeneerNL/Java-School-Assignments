package net.bomeneer.java;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.*;

public class thermostaat {
    static String command;
    static byte settedtempinterval;
    static float nowtemp = 20;
    public static Scanner input = new Scanner(System.in);
    static void changetemp(byte tempinterval, double oldtemp,float nowtemp, float newtemp,boolean tempup){
        if(tempup){

        }
        else if(!tempup){
            while(nowtemp > newtemp){
                nowtemp = nowtemp - tempinterval;
                out.println(nowtemp);
            }

        }
        else {
            out.println("Oops, something went wrong :(");
        }
    }
    static void main(){
        out.println("Welcome to SRCLA?");
        while(command != "exit" || command != "end"){
            out.print("SRCLA?/Thermostaat@192.168.1.99>");
            command = input.nextLine();
            switch (command){
                case "setinterval":
                    out.println("To what interval do you want to set your thermostat? (only use full numbers)");
                    out.println("SRCLA?/Thermostaat@192.168.1.99/SetInterval>");
                    try {
                        settedtempinterval = input.nextByte();
                        out.print("");
                    }
                    catch (InputMismatchException exception){
                        out.println("Oops, this command only accepts between -127 and 127 and doesn't support decimal numbers");
                    }
                break;
                case "settemp":
                    out.println("What");
                    break;
                case "icall geti":
                    out.println("VAR$settedtempinterval = " + settedtempinterval);
                    break;
                case "exit":
                case "end":
                    System.exit(0);
                    break;
                default:
            }
        }
    }
}
