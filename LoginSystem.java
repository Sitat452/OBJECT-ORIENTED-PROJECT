
import java.util.Scanner;

public class LoginSystem {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin123";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int attempts = 3;

        while (attempts > 0) {

            System.out.println("\nLogin Attempt Remaining: " + attempts);

            System.out.print("Enter Username: ");
            String inputUsername = sc.nextLine();

            System.out.print("Enter Password: ");
            String inputPassword = sc.nextLine(); // Scanner reads password as String

            if (inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)) {
                System.out.println("\nLogin Successful! Welcome " + inputUsername + ".");
                sc.close();
                return;
            } else {
                attempts--;
                System.out.println("Invalid username or password.");

                if (attempts == 0) {
                    System.out.println("\nMaximum attempts reached. Access denied.");
                } else {
                    System.out.println("Please try again.");
                }
            }
        }

        sc.close();
    }
}
