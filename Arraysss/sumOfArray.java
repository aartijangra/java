package Arraysss;

import java.util.*;

public class sumOfArray{
    public static void main(String args[]){
        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the array elements");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        //calculating sum
        int sum=0;
        for(int it:arr){
            sum+=it;
        }

        System.out.println("The sum of elements of the array is: "+sum);
    }
}