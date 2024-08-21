// import java.util.*;
// class primecount {
 

// static void primecheck(int a[]){
//     int cnt=0;
//     for(int i=0;i<a.length;i++){
//           for(int j=2;j<=a[i]/2;j++){
//             if(a[i]%j==0)
//                 break;
//             }
//         }
//             if( j > a[i]/2){
//              cnt++;
//             }
//           System.out.println(cnt);
//     }

//     public static void main(String args[]){
//         int n;
//         Scanner sc =new Scanner(System.in);
//         n=sc.nextInt();

//         int a[]=new int[n];
//         for( int i = 0;i<n;i++){
//         a[i]=sc.nextInt();
//         }
//         primecheck(a);
//         sc.close();
//     }
//  }
import java.util.Scanner;

class PrimeCount {

    static void primeCheck(int[] a) {
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            boolean isPrime = true;
            if (a[i] <= 1) {
                continue; 
            }
            for (int j = 2; j <= a[i] / 2; j++) {
                if (a[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                cnt++;
            }
        }
        System.out.println("Number of prime numbers in the array: " + cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        primeCheck(a);
        sc.close();
    }
}
