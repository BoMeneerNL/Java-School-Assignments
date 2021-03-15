package net.bomeneer.java;

import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

public class inventoryV3 {
    static Scanner input = new Scanner(in);
    public static int timesnewitem;
    public static int newitems;
    public static void main(){
        timesnewitem = newitems;
    }
    public static void startcheck() {
        out.println("Hoeveel item wil je toevoegen?, vul 0 in om er geen toe te voegen");
        try {
            newitems = input.nextInt();
            main();
        }
        catch (InputMismatchException e){
            out.println("Error mismatch (INT>><=MISMATCH)");
        }
        finally {
            out.println("Oops, something went wrong that the program could not handle");
        }
    }
}