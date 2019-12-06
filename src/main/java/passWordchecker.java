import java.util.*;

class passwordchecker {

    public boolean funcPassword(String password){

        String regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,50}$";
        Scanner input = new Scanner(System.in);

        if (password.matches(regexp)== true &&  password != " ")
        {
            System.out.println("password meets requirements.");
        }
        else {
            while (password.matches(regexp) == false) {
                System.out.println("Password should include Special Characters and should be between 8 and cannot be null");

                System.out.println("Please create password:");
                password = input.nextLine();

                if (password.matches(regexp) == true && password != " ") {
                    System.out.println("password meets requirements.");
                }
            }

        }
        return true;
    }



}