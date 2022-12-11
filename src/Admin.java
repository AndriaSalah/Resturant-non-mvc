import java.util.Scanner;

public class Admin {
    int Admin_id;
   static Resturant r = new Resturant();
   static Reservation reservation = new Reservation();
   static Scanner in = new Scanner(System.in);
    public static void getproducts(){
        r.GetAllProducts();
    }
    public static void getreservations(){
        r.GetALlReservations();
    }
    public static void GetReservationbyname(String input){
     r.Getreservname(input);
    }
    public static void DeleteRes(String name){

       r.deletereservations(in.nextLine());

    }


}
