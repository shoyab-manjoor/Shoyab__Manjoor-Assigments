import java.util.Scanner ;
public class Interest {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
     double p , r,t ,si,amount,mult;
     System.out.println("Enter principle:");
     p = sc.nextDouble();
     System.out.println("Enter rate:");
     r = sc.nextDouble();
     System.out.println("Enter time :");
     t = sc.nextDouble();
     si=(p*r*t)/100.0;
     amount=p;
    System.out.println("Simple interest: "+si+"\nAmount of Simple Interest:"+(p+si));
    mult=Math.pow((1+(r/100)), t);
    amount=p*mult;
    System.out.println("compound interest: "+(amount-p)+"\nAmount of Compound Interest:"+(amount));
    }
}
