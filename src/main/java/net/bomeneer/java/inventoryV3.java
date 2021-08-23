package net.bomeneer.java;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
import static net.bomeneer.java.invertoryV2.divider_s;

public class inventoryV3 {

    public static double price;
    public static String product;
    public static int stocked;
    public static String producttype;
    public static boolean gameplatform;
    public static String platforms;
    public static int pegirating;
    public static int newitems;
    public static boolean jeff = true;
    static Scanner input = new Scanner(in);
    static products minecraftj = new products(23.95, "Games (prepaid cards)", "Minecraft: Java Edition (Prepaid card)", 20, "Windows, MacOS, Linux", 7);
    static products minecraftb = new products(23.95, "Games (prepaid cards)", "Minecraft: Bedrock Edition (Prepaid card)", 20, "Windows, MacOS, Linux", 7);
    static products gtav = new products(50.55, "Games (Physical Copy)", "GTA V", 10, "PlayStation 3, Xbox 360, PlayStation 4, Xbox One, Windows, PlayStation 5, Xbox Series X", 18);
    static products balpen = new products(20.10, "Pennen", "Balpen", 500);
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

    public inventoryV3(float price, String producttype, String product, int stocked) {
        inventoryV3.price = price;
        inventoryV3.product = product;
        inventoryV3.producttype = producttype;
        inventoryV3.stocked = stocked;
        gameplatform = false;
    }

    public inventoryV3(float price, String producttype, String product, int stocked, String plaforms, int pegirating) {
        inventoryV3.price = price;
        inventoryV3.product = product;
        inventoryV3.producttype = producttype;
        inventoryV3.stocked = stocked;
        platforms = plaforms;
        inventoryV3.pegirating = pegirating;
        gameplatform = true;
    }

    public static void main() {
        if (newitems > 0 && newitems <= 10) {
            do {
                out.println("what is the price of the new product?, use price as '0.00' prices are in EUR(€)");
                while (newproducts[newitems - 1][0].equals("0.00") || newproducts[newitems - 1][0].equals("")) {
                    newproducts[newitems - 1][0] = input.nextLine();
                }

                out.println("What is the product type of the new product?");
                while (newproducts[newitems - 1][1].equals("ProductType"))

                newproducts[newitems - 1][1] = input.nextLine();
                out.println("What is the (product) name of the new product?");

                while (newproducts[newitems - 1][2].equals("Product")) newproducts[newitems - 1][2] = input.nextLine();
                out.println("How many items of the new product are stocked?");

                while (newproducts[newitems - 1][3] == "Stocked") newproducts[newitems - 1][3] = input.nextLine();
                newitems--;
            } while (newitems != 0);
            if (!newproducts[0][1].equals("ProductType") && !newproducts[0][2].equals("Product") && !newproducts[0][3].equals("Stocked")) {
                out.println(divider_s);
                out.println("Price: " + newproducts[0][0] + "€");
                out.println("Product Type: " + newproducts[0][1]);
                out.println("Product: " + newproducts[0][2]);
                out.println("Stocked: " + newproducts[0][3]);
                out.println(divider_s);
            }
            if (!newproducts[1][1].equals("ProductType") && !newproducts[1][2].equals("Product") && !newproducts[1][3].equals("Stocked")) {
                out.println(divider_s);
                out.println("Price: " + newproducts[1][0] + "€");
                out.println("Product Type: " + newproducts[1][1]);
                out.println("Product: " + newproducts[1][2]);
                out.println("Stocked: " + newproducts[1][3]);
                out.println(divider_s);
            }
            if (newproducts[2][1] != "ProductType" && newproducts[2][2] != "Product" && newproducts[2][3] != "Stocked") {
                out.println(divider_s);
                out.println("Price: " + newproducts[2][0] + "€");
                out.println("Product Type: " + newproducts[2][1]);
                out.println("Product: " + newproducts[2][2]);
                out.println("Stocked: " + newproducts[2][3]);
                out.println(divider_s);
            }
            if (newproducts[3][1] != "ProductType" && newproducts[3][2] != "Product" && newproducts[3][3] != "Stocked") {
                out.println(divider_s);
                out.println("Price: " + newproducts[3][0] + "€");
                out.println("Product Type: " + newproducts[3][1]);
                out.println("Product: " + newproducts[3][2]);
                out.println("Stocked: " + newproducts[3][3]);
                out.println(divider_s);
            }
            if (newproducts[4][1] != "ProductType" && newproducts[4][2] != "Product" && newproducts[4][3] != "Stocked") {
                out.println(divider_s);
                out.println("Price: " + newproducts[4][0] + "€");
                out.println("Product Type: " + newproducts[4][1]);
                out.println("Product: " + newproducts[4][2]);
                out.println("Stocked: " + newproducts[4][3]);
                out.println(divider_s);
            }
            if (newproducts[5][1] != "ProductType" && newproducts[5][2] != "Product" && newproducts[5][3] != "Stocked") {
                out.println(divider_s);
                out.println("Price: " + newproducts[5][0] + "€");
                out.println("Product Type: " + newproducts[5][1]);
                out.println("Product: " + newproducts[5][2]);
                out.println("Stocked: " + newproducts[5][3]);
                out.println(divider_s);
            }
            if (newproducts[6][1] != "ProductType" && newproducts[6][2] != "Product" && newproducts[6][3] != "Stocked") {
                out.println(divider_s);
                out.println("Price: " + newproducts[6][0] + "€");
                out.println("Product Type: " + newproducts[6][1]);
                out.println("Product: " + newproducts[6][2]);
                out.println("Stocked: " + newproducts[6][3]);
                out.println(divider_s);
            }
            if (newproducts[7][1] != "ProductType" && newproducts[7][2] != "Product" && newproducts[7][3] != "Stocked") {
                out.println(divider_s);
                out.println("Price: " + newproducts[7][0] + "€");
                out.println("Product Type: " + newproducts[7][1]);
                out.println("Product: " + newproducts[7][2]);
                out.println("Stocked: " + newproducts[7][3]);
                out.println(divider_s);
            }
            if (newproducts[8][1] != "ProductType" && newproducts[8][2] != "Product" && newproducts[8][3] != "Stocked") {
                out.println(divider_s);
                out.println("Price: " + newproducts[8][0] + "€");
                out.println("Product Type: " + newproducts[8][1]);
                out.println("Product: " + newproducts[8][2]);
                out.println("Stocked: " + newproducts[8][3]);
                out.println(divider_s);
            }
            if (newproducts[9][1] != "ProductType" && newproducts[9][2] != "Product" && newproducts[9][3] != "Stocked") {
                out.println(divider_s);
                out.println("Price: " + newproducts[9][0] + "€");
                out.println("Product Type: " + newproducts[9][1]);
                out.println("Product: " + newproducts[9][2]);
                out.println("Stocked: " + newproducts[9][3]);
                out.println(divider_s);
            }
            minecraftb.Outputter();
            minecraftj.Outputter();
            gtav.Outputter();
            balpen.Outputter();
        } else if (newitems > 10) {
            out.println("oops, to much new products");
        } else {
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
                jeff = false;
            } catch (InputMismatchException e) {
                out.println("oops, only integers are allowed (error_ Java:InputMismatchException)");
                newitems = input.nextInt();
                jeff = true;
            } finally {
                main();
                jeff = false;
            }
            //the if newitems <= 0 is handled @ main(){}
        } while (jeff);
    }

}