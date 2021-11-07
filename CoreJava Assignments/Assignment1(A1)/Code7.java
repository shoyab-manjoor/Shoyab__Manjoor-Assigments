import java.util.Scanner;

public class Code7{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int ar[] = new int[15];
        System.out.println("Enter 15 elements in array:");
        for(int i =0;i<ar.length;i++)
        {
            System.out.println("enter element:");
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter element to be search:");
        int x = sc.nextInt();
        for(int k : ar)
        {
            if(x==k)
            {
                System.out.println(x+" is present in the array !");
                return;
            }
        }
        System.out.println(x+" is not present in the array !");
    }
}