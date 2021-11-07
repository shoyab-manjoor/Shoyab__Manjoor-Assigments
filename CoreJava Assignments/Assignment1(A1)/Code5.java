import java.util.Scanner;
public class IncTax {
    public static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
    System.out.println("Enter salary :");
    double salary = sc.nextDouble();
    double tax=0;
    if(salary>0 && salary <= 180000)
    {
               tax=0*salary;
    }
    else if(salary>=181001 && salary<=300000){
        tax=0.1*salary;
    }
    else if(salary>=300001 && salary<=500000){
        tax=0.2*salary;
    }
    else if(salary>=500001 && salary<=1000000){
        tax=0.3*salary;
    }
    System.out.println("your tax on salary : "+ tax);
}    
}
