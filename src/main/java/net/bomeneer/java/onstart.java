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
            //Debugger (Nothing yet)
            case "inventory-v1 --Debugger --nm" -> {
                out.println(command + " is " + ltxt);
                out.println("Sorry this location is to silent (error Emp_proj:: could not reach real/some content");
            }
            //Inventory V2 Starter
            case "inventory-v2 --Normal --nm" -> {
                out.println(command + " is " + ltxt);
                invertoryV2.main();
            }
            case "inventory-v3 --Normal --nm" ->{
                out.println(command + "is" + ltxt);
                inventoryV3.startcheck();
            }
            //Dobbelsteen Starter (Dobblesteen met 6 ogen)
            case "dobbelgame --Normal ---VThrow6" -> {
                out.println(command + " is " + ltxt);
                dobbelgame.throw6();
            }

            case "dobbelgame --Normal ---VThrow100" -> {
                out.println(command + " is " + ltxt);
                dobbelgame.throw100();
            }
            default -> out.println("Error could not Handle and/or Register Program or Argument (Error 404/0)");
        }
    }
}
