package com.company;

import java.util.ArrayList;

public class admin extends User{
    String Uname = "admin";
    String Pwd ="123";
    static ArrayList<Product> p = new ArrayList<>();
    public admin() {
        super.phone="12233";
        super.mail = "akndkas@lmlaasd.com";
    }
    public boolean loginAsAdmin(String Uname , String Pwd){
        if(Uname.equals(this.Uname)&&Pwd.equals(this.Pwd)){
            return true;
        }
        else return false;
    }



    public void viewReservations(ArrayList<customer> customers){
        for (int i = 0; i < customers.size() ; i++) {
            customers.get(i).viewReservations();
        }
    }
    public void searchReservations(String Name , ArrayList<customer> customers){
        for (int i = 0; i < customers.size() ; i++) {
            if(customers.get(i).Uname.equals(Name)){
                customers.get(i).viewReservations();
            }
        }
    }
    public void addProduct(String type , String dishName){
       // p.add(new Product(type,dishName));
        p.add( new Product("main","meat"));
        p.add( new Product("main","chicken"));
        p.add( new Product("main","fish"));
        p.add( new Product("main","vegetables"));
        p.add( new Product("appetizer","tomatoe"));
        p.add( new Product("appetizer","potatoe"));
        p.add( new Product("appetizer","chips"));
        p.add( new Product("appetizer","sausage"));
        p.add( new Product("dessert","roz be laban"));
        p.add( new Product("dessert","ice cream"));
        p.add( new Product("dessert","cake"));
        p.add( new Product("drinks","pepsi"));
        p.add( new Product("drinks","juice"));


    }
    public void removeProduct(String productName){

        for (int i = 0; i < p.size(); i++) {
            if(p.get(i).getDishName().equals(productName)){
                p.remove(i);
            }

        }
    }
    public ArrayList<Product> getP() {
        return p;
    }

}
