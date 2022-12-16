package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Reservations {
    admin ah = new admin();
    ArrayList<Product> p = ah.getP();
    Scanner in = new Scanner(System.in);
    String reservationDate;
    int reservationTable;
    StringBuilder reservationOrder = new StringBuilder();

    public Reservations(String reservationDate, int reservationTable) {
        this.reservationDate = reservationDate;
        this.reservationTable = reservationTable;

        System.out.println("Main Dishes : ");
        for (int i = 0; i <p.size() ; i++) {
            if(p.get(i).getType().equals("main")){
                System.out.println(p.get(i).getDishName());
            }
        }
        System.out.println("what would you like to order as a main dish");
        reservationOrder.append(in.nextLine()+" ");

        System.out.println("Appetizers : ");
        for (int i = 0; i <p.size() ; i++) {
            if(p.get(i).getType().equals("appetizer")){
                System.out.println(p.get(i).getDishName());
            }
        }
        System.out.println("what would you like to order as a appetizer");
        reservationOrder.append(in.nextLine()+" ");

        System.out.println("Dessert : ");
        for (int i = 0; i <p.size() ; i++) {
            if(p.get(i).getType().equals("dessert")){
                System.out.println(p.get(i).getDishName());
            }
        }
        System.out.println("what would you like to order as a dessert");
        reservationOrder.append(in.nextLine()+" ");

        System.out.println("Drinks : ");
        for (int i = 0; i <p.size() ; i++) {
            if(p.get(i).getType().equals("drinks")){
                System.out.println(p.get(i).getDishName());
            }
        }
        System.out.println("what would you like to order as a drink");
        reservationOrder.append(in.nextLine()+" ");
    }
}
