import java.util.Scanner;

public class fibonacci {
   public static void main(String[] args) {
       int n1=0,n2=1,s=0;
       System.out.println("enter the num");
       Scanner sc =new Scanner(System.in);
       int num=sc.nextInt();
       System.out.println(n1 +" " +n2+" ");
       
           for(int i=2;i<num;i++){
              s=n1+n2;
          System.out.println(s+" ");
          n1=n2;
          n2=s;
           }
   }    
}
