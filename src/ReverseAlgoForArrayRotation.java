

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arnav Aggarwal
 */
public class ReverseAlgoForArrayRotation {
    
    public static void CallRotation(int arr[],int d){
        int n =arr.length;
        ReverseArray(arr,0,d-1);
        ReverseArray(arr,d,n-1);
        ReverseArray(arr,0,n-1);
    }
    
    public  static void ReverseArray(int arr[],int s,int e){
        int temp;
        while(s<e){
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
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
        d=d%n;
        CallRotation(arr,d);
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            System.out.print(' ');

        }
    }
}
