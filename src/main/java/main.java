import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        passwordchecker pass = new passwordchecker();
        System.out.println("Please create password:");
        String password = input.nextLine();
        pass.funcPassword(password);
    }
}
