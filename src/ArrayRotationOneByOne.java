
import java.util.Scanner;

public class ArrayRotationOneByOne {
  public  static void Rotation(int arr[],int n){
        int temp ;
        temp = arr[0];
        for(int i =0 ; i < n-1 ; i++ ){
            arr[i] =arr[i+1];
        }
        arr[n-1] = temp;
    }
    public static void  CallRotation(int arr[],int d){
        int n = arr.length;
        for (int i = 0; i < d; i++) {
            Rotation(arr,n);    
        }
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the no of Elements\n");
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
        }
        System.out.println("Enter the no of times you want to Rotate the array");
        int d = sc.nextInt();
        CallRotation(arr,d);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            System.out.print(' ');

        }
    }
    
}
