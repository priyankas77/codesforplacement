import java.util.Scanner;
public class revstring {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        String str;
        str=sc.next();
        String reversestring=" ";
           for (int i=str.length()-1;i>=0;i--){
               reversestring=reversestring+str.charAt(i);
           }
           
           System.out.println(reversestring);
           sc.close();
    }
}