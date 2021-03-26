package net.bomeneer.java;

import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class onstart {

    public static void main(String[] args) {
        String ltxt = "Loading...";
        out.println("What program do you want to start?:");
        Scanner input = new Scanner(in);
        String command = input.nextLine();

        switch (command) {
            //Inventory 1 Starter
            case "inventory-v1 --Normal --nm" -> {
                out.println(command + " is " + ltxt);
                products.main();
            }
            case "inventory-v2" -> {
                out.println(command + " is " + ltxt);
                invertoryV2.main();
            }
            case "inventory-v3" ->{
                out.println(command + "is" + ltxt);
                inventoryV3.startcheck();
            }
            case "dobbelgame --T=6" -> {
                out.println(command + " is " + ltxt);
                dobbelgame.throw6();
            }
            case "dobbelgame --T=100" -> {
                out.println(command + " is " + ltxt);
                dobbelgame.throw100();
            }
            case "thermostaat" ->{
                out.println(command + " is " + ltxt);
                thermostaat.main();
            }
            default -> out.println("Error could not Handle and/or Register Program or Argument (Error 404/0)");
        }
    }
}
