package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<customer> customers = new ArrayList<>();
        admin admin = new admin();
        Scanner in = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println("(l)ogin or (r)egister");
            if (in.nextLine().equals("l")) {
                System.out.print("please enter your User name :");
                String userName = in.nextLine();
                System.out.print("please enter your Password :");
                String password = in.nextLine();
                if (userName.equals("admin")) {
                    if (admin.loginAsAdmin(userName, password)) {

                        boolean logout = false;
                        while (!logout) {
                            System.out.println("1-view all reservations \n2-search for a user's reservations \n3-add a product \n4-remove a product \n5-logout");
                            switch (in.nextInt()) {

                                case 1:
                                    in.nextLine();
                                    admin.viewReservations(customers);
                                    break;
                                case 2:
                                    in.nextLine();
                                    System.out.println("enter the username you want view their reservation");
                                    admin.searchReservations(in.nextLine(), customers);
                                    break;
                                case 3:
                                    in.nextLine();
                                    System.out.println("enter the product name : " );

                                    String DishName = in.nextLine();

                                    System.out.println("and it's type :");
                                    String DishType = in.nextLine();
                                    admin.addProduct(DishType,DishName);
                                    break;
                                case 4:
                                    in.nextLine();
                                    System.out.println("enter the product name that you want to remove");
                                    admin.removeProduct(in.nextLine());
                                    break;

                                case 5:
                                    in.nextLine();
                                    logout = true;
                                    break;
                            }
                        }
                    }
                } else {
                    for (int i = 0; i < customers.size(); i++) {
                        if (customers.get(i).loginAsCustomer(userName, password)) {
                            customers.get(i).showMenu();
                            break;
                        }
                    }
                }
            }
            else{
                System.out.println("enter your username");
                String Uname = in.nextLine();
                System.out.println("enter your password");
                String Pwd = in.nextLine();
                System.out.println("enter your phone");
                String phone = in . nextLine();
                System.out.println("enter your mail");
                String mail = in.nextLine();

                customers.add(new customer(phone,mail,Uname,Pwd));
            }
        }

    }
}