import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Student Management System Login ===");

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        Login login = new Login();

        if(login.authenticate(username, password)) {
            System.out.println("Login Successful ✅");
        } else {
            System.out.println("Invalid Credentials ❌");
        }
    }
