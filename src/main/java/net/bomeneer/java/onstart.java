package net.bomeneer.java;

import java.util.Scanner;


public class onstart {
    public static void main(String[] args) {
        System.out.println("What program do you want to start?:");
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();
        switch (command.toLowerCase()) {
            case "inventory-v1" -> products.main();
            case "inventory-v2" -> invertoryV2.main();
            case "inventory-v3" -> inventoryV3.startcheck();
            case "dobbelgame --t=6" -> dobbelgame.main(0);
            case "dobbelgame --t=100" -> dobbelgame.main(1);
            case "thermostaat" -> thermostaat.main();
            case "rockpaperscissors" -> RockPaperScissors.main();
            default -> System.out.println("Error could not Handle and/or Register Program or Argument (Error 404/0)");
        }
    }
}
