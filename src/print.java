public interface print {
     public static void p(String input){
        System.out.println(input);
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
