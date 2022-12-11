import javax.crypto.spec.PSource;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.ArrayList;
import java.util.Scanner;

public class Users {
    static Customer c = new Customer();
    static ArrayList<String> users = new ArrayList<>();
    static ArrayList<String> passwords = new ArrayList<>();
    static int index = 0;
    static Scanner in = new Scanner(System.in);

    public static void print(String input) {
        System.out.println(input);
    }


    public static void Register() {
        int counter = 0;
        String name_buffer, pass_buffer;
        int phone_buffer;
        in.nextLine();
        System.out.print("please enter your Name:");
        name_buffer = in.nextLine();
        System.out.print("\nplease enter your Password:");
        pass_buffer = in.nextLine();
        System.out.print("\nplease enter your Phone Number:");
        phone_buffer = in.nextInt();
        System.out.print("\n\n");
        c.RegisterUser(name_buffer, pass_buffer, phone_buffer);
        System.out.println("Account has been registered successfully\n\n ");
        counter ++;
    }


    public static void login(String Username, String Password) {

        if (Username.equals("admin") && Password.equals("1234")) {
            admin();

        } else {
            for (int i = 0; i < c.Names.size(); i++) {
                if (Username.equals(c.Names.get(i))&& Password.equals(c.passwords.get(i))){
                    index = i;
                    Customer();
                    return;
                }
            }
            System.out.println("username or password entered are not correct");

        }

    }

//    public static void Register(String Username, String Password) {
//        users.add(Username);
//        passwords.add(Password);
//    }

    public static void admin() {
        int err = 0;
        while (err != 1) {
            Admin a = new Admin();
            System.out.println("welcome what would u like to do ? ");
            System.out.println("1-Check Products\n2-Check Reservations\n3-Get a reservation by name\n4-exit");
            switch (in.nextInt()) {
                case 1:
                    a.getproducts();
                    break;
                case 2:
                    a.getreservations();
                    break;
                case 3:
                    System.out.println("please enter the name you are searching for");
                    in.nextLine();
                    a.GetReservationbyname(in.nextLine());
                    break;
                case 4:
                    err = 1;
                    break;
                default :
                    break;

            }
        }
    }

    public static void Customer() {
         c.choices();
        }

    }



