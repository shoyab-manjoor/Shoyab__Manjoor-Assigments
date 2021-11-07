import java.util.Scanner;
public class Armstrong{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n , m ,r ,sum=0;
        System.out.println("Enter any number :");
        n = sc.nextInt();
        m=n;
        while(n>0)
        {
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(sum==m)
        {
            System.out.println("Number is armstrong:"+m);
        }
        else{
            System.out.println("Number is not  armstrong:"+m);   
        }
    }
}