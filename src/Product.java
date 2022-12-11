import java.util.ArrayList;

public class Product  {

    static String [] Maindish = {"Pizza","Rib-eye Steak","chicken curry","Burger"} ;
    static String [] Appetizers = {"Tomtato","Potatoe","Wings","Bread"};
    static String [] Drinks= {"Pepsi" , "Mountain dew" , "Coca Cola" , "Orange juice"};
    static String [] Desert={"Red velvet", "Molten cake", "Birthday cake","Brwonies"};
    public Product(){

    }


    public void getAppetizers() {
        System.out.println("Appetizers");
        System.out.println("--------------");
        for(int  i = 0 ; i < Appetizers.length; i ++){

          System.out.println(Appetizers[i]);

        }
        System.out.println("--------------");
    }

    public void getMainDish() {
        System.out.println("Main dishs");
        System.out.println("--------------");
        for(int  i = 0 ; i < Maindish.length; i ++){
            System.out.println(Maindish[i]);

        }
        System.out.println("--------------");
    }
    public void getDessert() {
        System.out.println("Dessert");
        System.out.println("--------------");
        for(int  i = 0 ; i < Desert.length; i ++){
            System.out.println(Desert[i]);

        }
        System.out.println("--------------");
    }

    public void getDrinks() {
        System.out.println("Drinks");
        System.out.println("--------------");
        for(int  i = 0 ; i < Drinks.length; i ++){
            System.out.println(Drinks[i]);

        }
        System.out.println("--------------");
    }

    }






