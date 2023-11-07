import java.util.Scanner;
public class SignUp {
    public static void main(String[] args) {
        System.out.println("\t Sign Up!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your required username:");
        String usernameSign = sc.nextLine();
        System.out.println("Enter your required password:");
        boolean valid = true;
        String passwordSign = null;
        while (valid) {
            passwordSign = sc.nextLine();
            if (passwordSign.length() > 8 && passwordSign.contains("@")) {
                System.out.println("Valid password");

                valid = false;
            } else {
                System.out.println("Password must be more than 8 characters and contain'@'");
            }
        }

        boolean sign = true;
        System.out.println("\t Log In!");
        while (sign) {
            System.out.println("Enter your username:");
            String username = sc.nextLine();
            System.out.println("Enter your password: (must contain @ and be more than 8 letters):");
            String password = sc.nextLine();
            if (password.equals(passwordSign) && username.equals(usernameSign)) {
                System.out.println("Logged In!");
                sign=false;
            }
            else {
                System.out.println("Incorrect username or password");
            }
        }
    }
}