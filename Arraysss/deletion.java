package Arraysss;

import java.util.Scanner;

public class deletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the position of the element you want to delete");
        int pos = sc.nextInt();

        if(pos<1 || pos>n) {
            System.out.println("Invalid input!!!");
        }
        else{
            for(int i=pos-1; i<n-1; i++){
                arr[i]=arr[i+1];
            }
            n--;
        
        //output
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
}
