import java.util.Scanner;
public class swapnum{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b;
        System.out.println("Enter a");
        a=sc.nextInt();
        System.out.println("Enter b");
        b=sc.nextInt();

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("After swapping "+a+" "+b);
    }
}