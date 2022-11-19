package net.bomeneer.java;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
import static net.bomeneer.java.invertoryV2.Divider_s;

public class inventoryV3 {

    public static double Price;
    public static String Product;
    public static int Stocked;
    public static String Producttype;
    public static boolean Gameplatform;
    public static String Platforms;
    public static int Pegirating;
    public static int Newitems;
    public static boolean Jeff = true;
    static Scanner Input = new Scanner(in);
    static products Minecraftj = new products(23.95f, "Games (prepaid cards)", "Minecraft: Java Edition (Prepaid card)", 20, "Windows, MacOS, Linux", 7);
    static products Minecraftb = new products(23.95f, "Games (prepaid cards)", "Minecraft: Bedrock Edition (Prepaid card)", 20, "Windows, MacOS, Linux", 7);
    static products Gtav = new products(50.55f, "Games (Physical Copy)", "GTA V", 10, "PlayStation 3, Xbox 360, PlayStation 4, Xbox One, Windows, PlayStation 5, Xbox Series X", 18);
    static products Balpen = new products(20.10, "Pennen", "Balpen", 500);
    static String[][] newproducts = {
            /*NewProduct 1*/{"0.00", "ProductType", "Product", "Stocked"},
            /*NewProduct 2*/{"0.00", "ProductType", "Product", "Stocked"},
            /*NewProduct 3*/{"0.00", "ProductType", "Product", "Stocked"},
            /*NewProduct 4*/{"0.00", "ProductType", "Product", "Stocked"},
            /*NewProduct 5*/{"0.00", "ProductType", "Product", "Stocked"},
            /*NewProduct 6*/{"0.00", "ProductType", "Product", "Stocked"},
            /*NewProduct 7*/{"0.00", "ProductType", "Product", "Stocked"},
            /*NewProduct 8*/{"0.00", "ProductType", "Product", "Stocked"},
            /*NewProduct 9*/{"0.00", "ProductType", "Product", "Stocked"},
            /*NewProduct 10*/{"0.00", "ProductType", "Product", "Stocked"}
    };

    public inventoryV3(float price, String producttype, String product, int stocked, String plaforms, int pegirating) {
        inventoryV3.Price = price;
        inventoryV3.Product = product;
        inventoryV3.Producttype = producttype;
        inventoryV3.Stocked = stocked;
        Platforms = plaforms;
        inventoryV3.Pegirating = pegirating;
        Gameplatform = true;
    }

    public static void main() {
        if (Newitems > 0 && Newitems <= 10) {
            do {
                out.println("what is the price of the new product?, use price as '0.00' prices are in EUR(€)");
                while (newproducts[Newitems - 1][0].equals("0.00") || newproducts[Newitems - 1][0].equals(""))
                    newproducts[Newitems - 1][0] = Input.nextLine();

                out.println("What is the product type of the new product?");
                while (newproducts[Newitems - 1][1].equals("ProductType"))
                    newproducts[Newitems - 1][1] = Input.nextLine();

                out.println("What is the (product) name of the new product?");

                while (newproducts[Newitems - 1][2].equals("Product")) newproducts[Newitems - 1][2] = Input.nextLine();
                out.println("How many items of the new product are stocked?");

                while (newproducts[Newitems - 1][3].equals("Stocked")) newproducts[Newitems - 1][3] = Input.nextLine();
                Newitems--;
            } while (Newitems != 0);
            for(int i = 0; i < 10; i++) {
                if (!newproducts[i][1].equals("ProductType") && !newproducts[i][2].equals("Product") && !newproducts[i][3].equals("Stocked")) {
                    out.println(Divider_s);
                    out.println("Price: " + newproducts[i][0] + "€");
                    out.println("Product Type: " + newproducts[i][1]);
                    out.println("Product: " + newproducts[i][2]);
                    out.println("Stocked: " + newproducts[i][3]);
                    out.println(Divider_s);
                }
            }
            Minecraftb.Outputter();
            Minecraftj.Outputter();
            Gtav.Outputter();
            Balpen.Outputter();
        } else if (Newitems > 10) {
            out.println("oops, to much new products");
        } else {
            Minecraftb.Outputter();
            Minecraftj.Outputter();
            Gtav.Outputter();
            Balpen.Outputter();
        }

    }

    public static void startcheck() {
        out.println("how many items do you want to add?, if none use '0'");
        try {
            Newitems = Input.nextInt();
            main();
            Jeff = false;
        } catch (InputMismatchException e) {
            out.println("oops, only integers are allowed (error_ Java:InputMismatchException)");
            Newitems = Input.nextInt();
        } finally {
            main();
            Jeff = false;
        }
        //the if newitems <= 0 is handled @ main(){}
    }

}