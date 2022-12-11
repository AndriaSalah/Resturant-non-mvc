import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    static Scanner in = new Scanner(System.in);
    static Users u = new Users();
    static Reservation reservation = new Reservation();
    static  Product p  = new Product();
    static ArrayList<String> Names= new ArrayList<>();
    static ArrayList<String> passwords = new ArrayList<>();
    static ArrayList<Integer>CustomerID = new ArrayList<>();
    static ArrayList<Integer>Phones = new ArrayList<>();
    static int increment=0;



    public static void RegisterUser(String name,String password,int phone){
        Names.add(name);
        passwords.add(password);
        Phones.add(phone);
        CustomerID.add(increment);
        increment ++;
    }

    public static void choices(){
        boolean exit = false;
        while (!exit) {
            System.out.println("welcome what would u like to do ? ");
            System.out.println("1-Check Main Dishes\n"+"2-Check Desserts\n"+"3-Check Appetizers\n"+"4-Check Drinks\n"+"5-Make A Reservation\n"+"6-exit");

            switch (in.nextInt()) {
                case 1 -> p.getMainDish();
                case 2 -> p.getDessert();
                case 3 -> p.getAppetizers();
                case 4 -> p.getDrinks();
                case 5 -> {
                    reservation.ReserveTable();
                    reservation.ShowReservName(Names.get(u.index));
                }
                case 6 -> exit = true;
            }
        }
    }


    public static void search(String input){}
}
