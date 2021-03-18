package net.bomeneer.java;

import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.out; import static java.lang.System.in;

public class inventoryV3 {

    static Scanner input = new Scanner(in);
    public static double price;
    public static String product;
    public static int stocked;
    public static String producttype;
    public static boolean gameplatform;
    public static String platforms;
    public static int pegirating;
    public static int newitems;
    public static int jeff = 0;
    static products minecraftj = new products(23.95,"Games (prepaid cards)","Minecraft: Java Edition (Prepaid card)",20,"Windows, MacOS, Linux",7);
    static products minecraftb = new products(23.95, "Games (prepaid cards)", "Minecraft: Bedrock Edition (Prepaid card)", 20, "Windows, MacOS, Linux", 7);
    static products gtav = new products(50.55,"Games (Physical Copy)","GTA V", 10, "PlayStation 3, Xbox 360, PlayStation 4, Xbox One, Windows, PlayStation 5, Xbox Series X", 18);
    static products balpen = new products(20.10,"Pennen","Balpen",500);
    static String[] newproduct1;

    public static void main(){
        if(newitems > 0 && newitems < 10){
            do {
                out.println("what is the price of the new product");
                newitems--;
            }while(newitems != 0);
            minecraftb.Outputter();
            minecraftj.Outputter();
            gtav.Outputter();
            balpen.Outputter();
        }
        else if(newitems > 10){

        }
        else{
            minecraftb.Outputter();
            minecraftj.Outputter();
            gtav.Outputter();
            balpen.Outputter();
        }

    }

    public static void startcheck() {
        out.println("how many items do you want to add?, if none use '0'");
        do {

            try {
                newitems = input.nextInt();
                main();
                jeff = 1;
            }
            catch (InputMismatchException e){
                out.println("oops, only integers are allowed (error_ Java:InputMismatchException)");
                newitems = input.nextInt();
                jeff = 0;
            }
            finally {
                main();
                jeff = 1;
            }
            //the if newitems <= 0 is handled @ main();
        } while (jeff == 0);
    }
    public inventoryV3(float price, String producttype, String product, int stocked){
        this.price = price;
        this.product = product;
        this.producttype = producttype;
        this.stocked = stocked;
        gameplatform = false;
    }
    public inventoryV3(float price, String producttype, String product, int stocked, String plaforms, int pegirating){
        this.price = price;
        this.product = product;
        this.producttype = producttype;
        this.stocked = stocked;
        this.platforms = plaforms;
        this.pegirating = pegirating;
        gameplatform = true;
    }

}