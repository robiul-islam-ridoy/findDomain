import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String email;
        String userName;
        String domain;

        System.out.println("Enter Your Email: ");
        
        email = sc.nextLine();

        userName = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@") + 1);

        System.out.println("User Name: " + userName);
        System.out.println("Domain: " + domain);

        sc.close();
    }
}
