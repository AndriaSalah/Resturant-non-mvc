import java.util.ArrayList;
import java.util.Scanner;

public class Reservation {
    static Users u = new Users();
    static Product p  = new Product();
    static Customer c = new Customer();
    static Scanner in = new Scanner(System.in);
    static ArrayList<String> ReservDate = new ArrayList<>();
    static ArrayList<String> ReserveTime = new ArrayList<>();
    static ArrayList<Integer> ReserveTable = new ArrayList<>();
    static ArrayList<String> Order=new ArrayList<>();
    static ArrayList<String> reservName = new ArrayList<>();
    static String appetizer, maindish, drinks, dessert, order;
    static final int maxcounter = 10;
    static int counter = 0;
    static int index;
    public Reservation() {
    }
//    public static void Addreservation(String name,String date,String time, int table,String order ){
//        if(counter < maxcounter) {
//            ReservDate.add(date);
//            ReserveTime.add(time);
//            ReserveTable.add(table);
//            Order.add(order);
//            counter++;
//        }
//        else {
//            System.out.println("there is no available tables left");
//        }
//    }

    public static void ShowReservName(String name){
        if(!reservName.isEmpty()) {
            for (int i = 0; i < reservName.size(); i++) {
                if (name.equals(reservName.get(i))) {
                    System.out.println("Reservation under the name of :" + " -- " + reservName.get(i));
                    System.out.println("Reservation time :" + " -- " + ReserveTime.get(i));
                    System.out.println("Reservation Date" + " -- " + ReservDate.get(i));
                    System.out.println("Dishes Orderd" + " -- " + Order.get(i));
                    System.out.println("Table : " + " -- " + ReserveTable.get(i));
                    System.out.println(" ---------------------- ");
                    return;
                }
//                index = i;
//                break;
            }
             System.out.println("Name not found");
        }
    }
    public static void ShowReservations(){
        if(ReserveTime.isEmpty()) {
            System.out.println("There are no reservations available");

        }
        else{
            System.out.println("Today's reservations are : ");
            for (int i = 0; i < ReservDate.size(); i++) {
                System.out.println(" -----------"+i+"----------- \n");
                System.out.println("Reservation under the name of :" + " -- " + reservName.get(i));
                System.out.println("Reservation time :" + " -- " + ReserveTime.get(i));
                System.out.println("Reservation Date" + " -- " + ReservDate.get(i));
                System.out.println("Dishes Orderd"+ " -- " + Order.get(i));
                System.out.println(" ---------------------------- ");
            }
        }
      }

      public static boolean CheckAvail(){
       if (counter < maxcounter){
           return true;
       }
       else{
           return false;
       }
      }

      public static void  ReserveTable(){
        if (CheckAvail()) {

            addReservName();
            System.out.println("please enter the reservation date");
            reserveDate(in.nextLine());
            System.out.println("please enter the reservation time");
            addreservTime(in.nextLine());

            System.out.println("You will now place your order");
            System.out.println("please enter the name and quantity of your desired dish");
//            System.out.println("please Select The Appetizers");
            p.getAppetizers();
            reservappetizer(in.nextLine());

//            System.out.println("please Select your Main Dish");
            p.getMainDish();
            reservmaindish(in.nextLine());

//            System.out.println("please Select your Dessert");
            p.getDessert();
            reservdessert(in.nextLine());

//            System.out.println("please Select your Drinks");
            p.getDrinks();
            reservedrinks(in.nextLine());
            saveorder();
            reservTable();
        }
        else   {

            System.out.println("Unfortunately there are no available tables");
        }

      }
      public static void reservappetizer(String input){
          appetizer = "Appetizers : " + input;

      }
      public static void reservmaindish(String input){
          maindish = "Main Dish : " + input;
      }
      public static void reservdessert(String input){
          dessert = "Dessert : " + input;
      }
      public static void reservedrinks(String input){ drinks = "Drinks : " + input;

      }
      public static void saveorder(){
          order="\n"+ appetizer+ "\n" + maindish + "\n" + dessert +"\n"+ drinks + "\ntable number : " + counter;
          Order.add(order);
      }
      public static void addReservName(){
          reservName.add(c.Names.get(u.index));
      }
      public static void addreservTime(String input){
        ReserveTime.add(input);
        System.out.println("the chosen time " + input);
      }
      public static void reservTable(){
          ReserveTable.add(counter);
          counter ++;
      }
      public static void reserveDate(String input){
          System.out.println("the chosen Date " + input);
          ReservDate.add(input);
      }

//      public static void Checktime(){
//
//      }
//      public static void Checkdate(){
//
//      }
    }

