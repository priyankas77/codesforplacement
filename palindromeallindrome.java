// import java.util.Scanner;

// public class pallindrome {
//     public static void main(String[] args) {
        
//         int reverse=0,rem;
       
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int dup =num;
//         while(num>0)
//         {
//             rem=num%10;
//             reverse= (reverse * 10 )+rem ;
//             num=num/10;
//         }
//             if(num==dup){
//                 System.out.println("it is a pallindrome " );
//             }
//             else 
//             {
//                 System.out.println("it is not a pallindrome number");
//             }
          
//         }

// }

import java.util.Scanner;

public class palindromeallindrome {
    public static void main(String[] args) {
        int reverse = 0, rem;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dup = num; // duplicate of the original number

        while (num > 0) {
            rem = num % 10;
            reverse = (reverse * 10) + rem;
            num = num / 10;
        }

        if (reverse == dup) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome number.");
        }
    }
}