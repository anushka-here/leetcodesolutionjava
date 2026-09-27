public class game {
    public static void main(String[] args) {
        System.out.println("Welcome to the Armstrong Number Checker!");
        armstrong.main(args);
    }   
    System.out.println("Thank you for using the Armstrong Number Checker!");
    while (true) {
        System.out.println("Do you want to check another number? (yes/no)");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine().trim().toLowerCase();
        if (!response.equals("yes")) {
            break;
        }
        armstrong.main(args);
    }
}
