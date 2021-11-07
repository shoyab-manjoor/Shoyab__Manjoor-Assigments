import java.util.Scanner;

public class Code8 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i;
        System.out.println("Enter No of elements to be insert in array:");
        int size = sc.nextInt();
        int ar[] = new int[size];
        for (i = 0; i < size; i++) {
            System.out.println("enter element:");
            ar[i] = sc.nextInt();
        }
        System.out.println("Before sorting array as:");
        for (int k : ar) {
            System.out.print(k + "\t");
        }
        for (i = 0; i < size; i++)
            for (int j = 0; j < size - 1; j++)
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
        System.out.println("\nAfter sorting array as:");
        for (int k : ar) {
            System.out.print(k + "\t");
        }
        System.out.println("\nEnter element to be search in array:");
        int x = sc.nextInt();
        for (int k : ar) {
            if (x == k) {
                System.out.println(x + " is present in the array !");
                return;
            }
        }
        System.out.println(x + " is not present in the array !");
    }
}

