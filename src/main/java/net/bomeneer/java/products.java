package net.bomeneer.java;

import static java.lang.System.out;

public class products {
    public double price;
    public String product;
    public int stocked;
    public String producttype;
    public boolean gameplatform;
    public String platforms;
    public int pegirating;

    public String divider = "[------------------------------]\r\n";

    public products(double v, String producttype, String product, int stocked, String plaforms, int pegirating) {
        this.price = 0.00f;
        this.product = "PROD-PLACEHOLDER";
        this.producttype = "PRODTY-PLACEHOLDER";
        this.stocked = 0;
        gameplatform = false;
    }

    public products(double price, String producttype, String product, int stocked) {
        this.price = price;
        this.product = product;
        this.producttype = producttype;
        this.stocked = stocked;
        gameplatform = false;
    }

    public products(float price, String producttype, String product, int stocked, String plaforms, int pegirating) {
        this.price = price;
        this.product = product;
        this.producttype = producttype;
        this.stocked = stocked;
        this.platforms = plaforms;
        this.pegirating = pegirating;
        gameplatform = true;
    }

    public static void main() {
        //Start of main file
        products minecraftj = new products(23.95f, "Games (prepaid cards)", "Minecraft: Java Edition (Prepaid card)", 20, "Windows, MacOS, Linux", 7);
        products minecraftb = new products(23.95, "Games (prepaid cards)", "Minecraft: Java Edition (Prepaid card)", 20, "Windows, MacOS, Linux", 7);
        products gtav = new products(50.55f, "Games (Physical Copy)", "GTA V", 10, "PlayStation 3, Xbox 360, PlayStation 4, Xbox One, Windows, PlayStation 5, Xbox Series X", 18);
        products balpen = new products(20.10f, "Pennen", "Balpen", 500);
        //Product outputs
        minecraftb.Outputter();
        minecraftj.Outputter();
        gtav.Outputter();
        balpen.Outputter();
    }

    public void Outputter() {
        out.println(divider);
        out.println("Product                 :" + " " + this.product);
        out.println("Type Product            :" + " " + this.producttype);
        out.println("Prijs/Price             : " + this.price + " € (EUR)");
        out.println("Amount/Aantal voorraad  : " + this.stocked);
        out.println(gameplatform ?"Platformen              : " + this.platforms + "\r\nPEGI Rating             : " + this.pegirating + "+" : "");
        out.println(divider);
    }
}
