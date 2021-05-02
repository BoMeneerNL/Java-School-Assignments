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
        if(command == "inventory-v1" ||command == "inventory-v2" ||command == "inventory-v3" ||command == "dobbelgame --T=6" ||command == "dobbelgame --T=100" ||command == "thermostaat" || command == "rockpaperscissors"){
            out.println(command + " is " + ltxt);
        }
        switch (command) {
            //Inventory 1 Starter
            case "inventory-v1" -> products.main();

            case "inventory-v2" -> invertoryV2.main();

            case "inventory-v3" -> inventoryV3.startcheck();
            case "dobbelgame --T=6" -> dobbelgame.main(0);
            case "dobbelgame --T=100" -> dobbelgame.main(1);
            case "thermostaat" -> thermostaat.main();
            case "rockpaperscissors" -> RockPaperScissors.main();
            default -> out.println("Error could not Handle and/or Register Program or Argument (Error 404/0)");
        }
    }
}
