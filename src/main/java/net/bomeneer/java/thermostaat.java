package net.bomeneer.java;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.out;

public class thermostaat {
    static String command;
    static int settedtempinterval;
    public static Scanner input = new Scanner(System.in);
    static void changetemp(byte tempinterval, double oldtemp,double nowtemp, double newtemp,boolean tempup){
        if(tempup){

        }
        else if(!tempup){
            while(nowtemp > newtemp){
                nowtemp = nowtemp - tempinterval;
            }
        }
        else {
            out.println("Oops, something went wrong :(");
        }
    }
    static void main(){
        while(command != "connect 192.168.1.99 --login=thermostaat,1234") {
            out.print("Welcome to SRCLA, what do you want to do?");
            command = input.nextLine();
        }
        while(command != "exit" || command != "end"){

        }
    }
}
