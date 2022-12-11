import java.util.Scanner;

public class Main implements print {

    public static void main(String[] args)  {
        int exit = 0;
        while (exit != 1) {
            String username;
            String Password;
            Scanner in = new Scanner(System.in);
            Users u = new Users();
            Customer c = new Customer();
            // for testing purposes only
            c.RegisterUser("andria","123",151515115);
            c.RegisterUser("ibrahim","123",151515115);
            System.out.println("Welcome to our Resturant");
            System.out.println("press 1 if you are already a user\npress 2 if you would like to register a new account\nPress 3 if you would like to exit");
            switch (in.nextInt()) {
                case 1:
                    System.out.println("please enter your user name ");
                    in.nextLine();
                    username = in.nextLine();
                    System.out.println("Please enter your password");
                    Password = in.nextLine();
                    u.login(username, Password);
                    break;

                case 2:
                    u.Register();
                    break;

                case 3 :
                    exit = 1;
                    break;
                default:
                    print.p("\nwrong choice \n");
                    //needs ansi escape code support to work
                    print.clearScreen();


            }


        }


    }

}
