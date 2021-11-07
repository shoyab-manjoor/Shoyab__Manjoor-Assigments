import java.util.Scanner;

public class Code6 {
    public static Scanner sc = new Scanner(System.in);
   public static void main(String[] args) {
       int count = 1;
       while(count<=3)
       {
        String username = "User";
        String password = "password";
        System.out.println("Enter user name:");
        String name = sc.nextLine();
        System.out.println("Enter password:");
        String pass = sc.nextLine();
        if(username.equalsIgnoreCase(name) && pass.equalsIgnoreCase(password))
        {
            System.out.println("Welocme\nYou are Signed in ");
            return;
        }
        else {
             count++;
            System.out.println("Try Again !");
        }
       }  
       System.out.println("Contact admin");
   } 
}
