import java.util.Scanner;
public class countnumstr {
    public static void main(String[] args) {
      
      String msg ;
      Scanner sc =new Scanner(System.in);
      msg=sc.nextLine();
      int total =1;// initial count 
      int  i=0;
      while(i<msg.length()){
         if ((msg.charAt(i)==' ') && (msg.charAt(i+1)!= ' ')){
         total++;
         }
         i++;
      }
      System.out.println("Number of words in a string "+total );
    }
}

    