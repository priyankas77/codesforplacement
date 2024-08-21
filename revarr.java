import java.util.Scanner;

public class revarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
    int length=sc.nextInt();
    int [] arr =new int [length];
     for(int i=0;i<length;i++){
        arr[i]=sc.nextInt();
     }
      for(int i=0;i<length/2;i++){
        int temp=arr[i];
        arr[i]=arr[length-1-i];
        arr[length-1-i]=temp;
      }
      System.out.println("reversing the array ");
      for(int i=0;i< length;i++){
        System.out.println(arr[i]+" ");
      }
    }
}
