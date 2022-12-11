import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Resturant {
  static String RateAndReview;
  static Reservation reservation = new Reservation();
    static Scanner in = new Scanner(System.in);
    public static Product p = new Product();

    public Resturant() {

    }

    public void GetAllProducts() {
        p.getMainDish();
        p.getAppetizers();
        p.getDessert();
        p.getDrinks();
    }

    public void deletereservations (String name){
        Getreservname(name);
        System.out.println("this will delete all reservation under the name :" + reservation.reservName.get(reservation.index));
        System.out.println("press y to delete or n to cancel " );
        switch (in.nextLine()){
            case "y" :
                for (int i = 0 ; i < reservation.reservName.size();i++){
                    if (name.equals(reservation.reservName.get(i))){
                        reservation.Order.remove(i);
                        reservation.ReserveTable.remove(i);
                        reservation.counter -- ;
                        reservation.ReservDate.remove(i);
                        reservation.ReserveTime.remove(i);
                        reservation.reservName.remove(i);
                    }
                }

                break;
            case "n":
                break;
        }

    }


    public static void  GetALlReservations(){
        System.out.println("Today's reservations are : ");
        reservation.ShowReservations();
    }

    public void Getreservname(String buffer){

        reservation.ShowReservName(buffer);

    }
}
