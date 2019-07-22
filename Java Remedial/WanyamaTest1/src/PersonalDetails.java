import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, password;

        System.out.println("Enter your username");
        username = input.nextLine();

        System.out.println("Enter your password");
        password = input.nextLine();

        if (username.equals("Amos") && (password.equals("Kibet"))) {
            System.out.println("Welcome Amos,So glad you could join us");
        } else {
            System.out.println("Please try again..network error");
        }
    }
}
