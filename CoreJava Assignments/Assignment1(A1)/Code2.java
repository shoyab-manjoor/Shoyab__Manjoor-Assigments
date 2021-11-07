import java.util.Scanner;
public class Armstrong2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n ,m,r ,sum=0;
        System.out.println("Armstrong No b/w 100 and 1000 are :");
        for(n=101;n<=999;n=m+1)
        {
            m=n;
            sum=0;
            while(n>0)
            {
                r=n%10;
                sum=sum+(r*r*r);
                n=n/10;
            }
            if(sum==m)
            {
                System.out.println(m);
            }
        }
    }
    
}
