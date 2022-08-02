package net.bomeneer.java;

import static java.lang.System.out;

public class products {
    public double Price;
    public String Product;
    public int Stocked;
    public String Producttype;
    public boolean Gameplatform;
    public String Platforms;
    public int Pegirating;

    public String divider = "[------------------------------]\r\n";


    public products(double price, String producttype, String product, int stocked) {
        Price = price;
        Product = product;
        Producttype = producttype;
        Stocked = stocked;
        Gameplatform = false;
    }

    public products(float price, String producttype, String product, int stocked, String plaforms, int pegirating) {
        Price = price;
        Product = product;
        Producttype = producttype;
        Stocked = stocked;
        Platforms = plaforms;
        Pegirating = pegirating;
        Gameplatform = true;
    }

    public static void main() {
        //Start of main file
        products minecraftj = new products(23.95f, "Games (prepaid cards)", "Minecraft: Java Edition (Prepaid card)", 20, "Windows, MacOS, Linux", 7);
        products minecraftb = new products(23.95f, "Games (prepaid cards)", "Minecraft: Java Edition (Prepaid card)", 20, "Windows, MacOS, Linux", 7);
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
        out.println("Product                 :" + " " + Product);
        out.println("Type Product            :" + " " + Producttype);
        out.println("Prijs/Price             : " + Price + " € (EUR)");
        out.println("Amount/Aantal voorraad  : " + Stocked);
        out.println(Gameplatform ? "Platformen              : " + Platforms + "\r\nPEGI Rating             : " + Pegirating + "+" : "");
        out.println(divider);
    }
}
