import java.util.Scanner;

public class Login {

    public boolean authenticate(String username, String password) {

        // Hardcoded credentials (for now)
        String correctUsername = "admin";
        String correctPassword = "1234";

        if(username.equals(correctUsername) && password.equals(correctPassword)) {
            return true;
        } else {
            return false;
        }
    }
}
