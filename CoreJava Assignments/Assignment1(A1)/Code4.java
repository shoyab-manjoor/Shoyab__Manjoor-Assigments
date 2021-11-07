import java.util.Scanner;

public class Result {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int marks1 ,marks2,marks3;
        System.out.println("Enter Marks of 1st subject: ");
        marks1 = sc.nextInt();
        System.out.println("Enter Marks of 2nd subject: ");
        marks2 = sc.nextInt();
        System.out.println("Enter Marks of 3rd subject: ");
        marks3 = sc.nextInt();
        if(marks1>60 && marks2>60 && marks2>60)
        {
            System.out.println("Pass");
        }
        else if((marks1>60 && marks2>60) || (marks1>60 && marks3>60) || (marks2>60 && marks3>60) )
        {
            System.out.println("Promoted");
        }
        else
        {
            System.out.println("fail");
        }
    }
}