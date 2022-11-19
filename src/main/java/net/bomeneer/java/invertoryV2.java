package net.bomeneer.java;

import java.util.Scanner;

import static java.lang.System.out;

public class invertoryV2 {

    //Declaring and adding placeholders (to) InvV2 Variables
    public static Scanner Input = new Scanner(System.in);
    public static double Tempprice = -1;
    public static String Tempproduct = "NULL";
    public static int Tempstocked = -1;
    public static String Tempproducttype = "NULL";
    public static String Checkifgame = "NULL";
    public static int Remembertimesgames = 0;
    public static String Tempplatforms = "NULL";
    public static int Temppegirating = -1;
    public static int Tppp;


    //Declaring InvV1 Variables
    //Divider for Static items (because of Static<>><Non-Static Errors)
    public static String Divider_s = "[------------------------------]\r\n";
    public double Price;
    public String Product;
    public int Stocked;
    public String Producttype;
    public boolean Gameplatform;
    public String Platforms;
    public int Pegirating;
    //Divider for Non-Static items (because of Static<>><Non-Static Errors)
    public String Divider_ns = "[------------------------------]\r\n";

    public invertoryV2(double price, String producttype, String product, int stocked, String plaforms, int pegirating) {
        Price = price;
        Product = product;
        Producttype = producttype;
        Stocked = stocked;
        Platforms = plaforms;
        Pegirating = pegirating;
        Gameplatform = true;
    }

    public static void main() {
        products minecraftj = new products(23.95f, "Games (prepaid cards)", "Minecraft: Java Edition (Prepaid card)", 20, "Windows, MacOS, Linux", 7);
        products minecraftb = new products(23.95f, "Games (prepaid cards)", "Minecraft: Bedrock Edition (Prepaid card)", 20, "Windows, MacOS, Linux", 7);
        products gtav = new products(50.55f, "Games (Physical Copy)", "GTA V", 10, "PlayStation 3, Xbox 360, PlayStation 4, Xbox One, Windows, PlayStation 5, Xbox Series X", 18);
        products balpen = new products(20.10f, "Pennen", "Balpen", 500);
        //Inputs, inputs temp data for Inventory
        //While loops to prevent a overlap of inputs
        while (Tempprice == -1) {
            out.println("What is the price? use as : 0,00");
            Tempprice = Input.nextDouble();
        }
        while (!Tempproduct.equals("NULL")) {
            out.println("What is the name of the product?");
            Tempproduct = Input.nextLine();
        }
        while (Tempstocked == -1) {
            out.println("How many of the product is stocked");
            Tempstocked = Input.nextInt();
        }
        while (!Tempproducttype.equals("NULL")) {
            out.println("What type of product is this product");
            Tempproducttype = Input.nextLine();
        }
        while (!Checkifgame.equals("y") && !Checkifgame.equals("yes") && !Checkifgame.equals("n") && !Checkifgame.equals("no")) {
            if (Remembertimesgames == 0) {
                out.println("Is this product a game?, yes or no");
            } else {
                out.println("The only responses possible are: Yes or No");
            }
            Checkifgame = Input.nextLine().toLowerCase();
            Remembertimesgames++;
        }
        while (Tempplatforms.equals("NULL")) {
            out.println("On what platforms is this game buyable?");
            Tempplatforms = Input.nextLine();
        }
        while (Temppegirating == -1) {
            out.println("What is the PEGI (Pan European Game Information) Rating?");
            Temppegirating = Input.nextInt();
        }

        //Product outputs
        minecraftb.Outputter();
        minecraftj.Outputter();
        gtav.Outputter();
        balpen.Outputter();
        tempoutputter();
    }

    //outputs temp input of user
    public static void tempoutputter() {

        Tppp = (int) (Tempprice * Tempstocked);
        out.println(Divider_s);
        out.print("Product     : ");
        out.println(Tempproduct);
        out.print("Price       : ");
        out.print(Tempprice);
        out.println("€ (EUR)");
        out.print("Stocked     : ");
        out.println(Tempstocked);
        out.print("Type Product       : ");
        out.println(Tempproducttype);
        if (!Tempplatforms.equals("NULL") && Temppegirating != -1) {
            out.print("Platforms          :");
            out.println(Tempplatforms);
            out.print("PEGI Rating        : ");
            out.print(Temppegirating);
            out.println("+");
        }
        out.print("Total price (TPPP) : ");
        out.print(Tppp);
        out.println("€");
        out.println(Divider_s);
    }

    public void Outputter() {
        out.println(Divider_ns);
        out.println("Product                 :" + " " + Product);
        out.println("Type Product            :" + " " + Producttype);
        out.println("Prijs/Price             : " + Price + " € (EUR)");
        out.println("Amount/Aantal voorraad  : " + Stocked);

        //If TRUE: Adds game data
        if (Gameplatform) {
            out.println("Platformen              : " + Platforms);
            out.println("PEGI Rating             : " + Pegirating + "+");
        }
        out.println(Divider_ns);
    }

}

