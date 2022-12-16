package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class customer extends User {
    String Uname,Pwd;
    ArrayList<Reservations> res = new ArrayList<>();
    Scanner in  = new Scanner(System.in);
    static int tableNumber = 1 ;
    public customer(String phone, String mail,String Uname ,String Pwd) {
        super(phone, mail);
        this.Uname = Uname;
        this.Pwd = Pwd;
    }

    public boolean loginAsCustomer(String Uname , String Pwd){
        if(Uname.equals(this.Uname)&&Pwd.equals(this.Pwd)){
            return true;
        }
        else return false;
    }

    public void showMenu(){

        boolean logout = false;
        while (!logout) {
            System.out.println("enter the corresponding number to your operation");
            System.out.println("1-Make a New Reservation \n2-View Previous Reservation\n3-logout");
            switch (in.nextInt()) {
                case 1:
                    in.nextLine();
                    startReservation();
                    break;
                case 2:
                    in.nextLine();
                    viewReservations();
                    break;
                case 3:
                    in.nextLine();
                    logout = true;
                    break;
            }
        }


    }

    public void startReservation(){
        String time = java.time.LocalDate.now().toString();
        res.add(new Reservations(time,tableNumber++));
    }
    public void viewReservations(){
        if(res.size()==0){
            System.out.println("there are no reservations made under the user " + Uname);
        }
        else {
            System.out.println("reservations under the name : "+Uname);
            for (int i = 0; i < res.size(); i++) {
                System.out.println("Reservation ("+i+")\n"+"Reservation date: "+res.get(i).reservationDate+"\n"+"Reservation table: "+res.get(i).reservationTable+"\n"+"order:  "+res.get(i).reservationOrder);
                System.out.println("---------------------------");
            }
        }
    }

}

