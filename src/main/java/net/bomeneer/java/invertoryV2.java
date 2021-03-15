package net.bomeneer.java;
import java.util.*;

import static java.lang.System.out;
public class invertoryV2 {

    //Declaring and adding placeholders (to) InvV2 Variables
    public static Scanner input = new Scanner(System.in);
    public static double tempprice = -1;
    public static String tempproduct = "NULL";
    public static int tempstocked = -1;
    public static String tempproducttype = "NULL";
    public static String checkifgame = "NULL";
    public static int remembertimesgames = 0;
    public static boolean tempgameplatform = false;
    public static String tempplatforms = "NULL";
    public static int temppegirating = -1;
    public static int tppp;



    //Declaring InvV1 Variables

    public float price;
    public String product;
    public int stocked;
    public String producttype;
    public boolean gameplatform;
    public String platforms;
    public int pegirating;
    //Divider for Non-Static items (because of Static<>><Non-Static Errors)
    public String divider_ns = "[------------------------------]\r\n";
    //Divider for Static items (because of Static<>><Non-Static Errors)
    public static String divider_s = "[------------------------------]\r\n";

    public static void main(){
        products minecraftj = new products(23.95f,"Games (prepaid cards)","Minecraft: Java Edition (Prepaid card)",20,"Windows, MacOS, Linux",7);
        products minecraftb = new products();
        products gtav = new products(50.55f,"Games (Physical Copy)","GTA V", 10, "PlayStation 3, Xbox 360, PlayStation 4, Xbox One, Windows, PlayStation 5, Xbox Series X", 18);
        products balpen = new products(20.10f,"Pennen","Balpen",500);
        //Inputs, inputs temp data for Inventory
        //While loops to prevent a overlap of inputs
        while (tempprice == -1) {
            out.println("What is the price? use as : 0,00");
            tempprice = input.nextDouble();
        }
        while (!tempproduct.equals("NULL")) {
            out.println("What is the name of the product?");
            tempproduct = input.nextLine();
        }
        while (tempstocked == -1) {
            out.println("How many of the product is stocked");
            tempstocked = input.nextInt();
        }
        while (!tempproducttype.equals("NULL")) {
            out.println("What type of product is this product");
            tempproducttype = input.nextLine();
        }
        while (!checkifgame.equals("y") && !checkifgame.equals("Y") && !checkifgame.equals("yes") && !checkifgame.equals("Yes") && !checkifgame.equals("YES") && !checkifgame.equals("n") && !checkifgame.equals("N") && !checkifgame.equals("no") && !checkifgame.equals("No") && !checkifgame.equals("NO")) {
            if (remembertimesgames == 0) {
                out.println("Is this product a game?, yes or no");
                checkifgame = input.nextLine();
                remembertimesgames = remembertimesgames + 1;
            } else {
                out.println("The only responses possible are: Yes or No");
                checkifgame = input.nextLine();
                remembertimesgames = remembertimesgames + 1;
            }
        }
        if (!checkifgame.equals("y") || !checkifgame.equals("Y") || !checkifgame.equals("yes") || !checkifgame.equals("Yes") || !checkifgame.equals("YES")) {
            while (tempplatforms.equals("NULL")) {
                out.println("On what platforms is this game buyable?");
                tempplatforms = input.nextLine();
            }
            while (temppegirating == -1) {
                out.println("What is the PEGI (Pan European Game Information) Rating?");
                temppegirating = input.nextInt();
            }
        }

        //Product outputs
        minecraftb.Outputter();
        minecraftj.Outputter();
        gtav.Outputter();
        balpen.Outputter();
        tempoutputter();
    }
    public invertoryV2(){
        this.price = 0.00f;
        this.product = "PROD-PLACEHOLDER";
        this.producttype = "PRODTYPE-PLACEHOLDER";
        this.stocked = 0;
        gameplatform = false;
    }
    public invertoryV2(float price, String producttype, String product, int stocked){
        this.price = price;
        this.product = product;
        this.producttype = producttype;
        this.stocked = stocked;
        gameplatform = false;
    }
    public invertoryV2(float price, String producttype, String product, int stocked, String plaforms, int pegirating){
        this.price = price;
        this.product = product;
        this.producttype = producttype;
        this.stocked = stocked;
        this.platforms = plaforms;
        this.pegirating = pegirating;
        gameplatform = true;
    }
    public void Outputter(){
        out.println(divider_ns);
        out.println("Product                 :" + " " + this.product);
        out.println("Type Product            :" + " " + this.producttype);
        out.println("Prijs/Price             : " + this.price + " € (EUR)");
        out.println("Amount/Aantal voorraad  : " + this.stocked);

        //If TRUE: Adds game data
        if (gameplatform){
            out.println("Platformen              : " + this.platforms);
            out.println("PEGI Rating             : " + this.pegirating + "+");
        }
        out.println(divider_ns);
    }

    //outputs temp input of user
    public static void tempoutputter(){

        tppp = (int) (tempprice * tempstocked);
        out.println(divider_s);
        out.print("Product     : ");
        out.println(tempproduct);
        out.print("Price       : ");
        out.print(tempprice);
        out.println("€ (EUR)");
        out.print("Stocked     : ");
        out.println(tempstocked);
        out.print("Type Product       : ");
        out.println(tempproducttype);
        if (tempplatforms.equals("NULL") || temppegirating == -1) {
        } else {
            out.print("Platforms          :");
            out.println(tempplatforms);
            out.print("PEGI Rating        : ");
            out.print(temppegirating);
            out.println("+");
        }
        out.print("Total price (TPPP) : ");
        out.print(tppp);
        out.println("€");
        out.println(divider_s);
    }

}

