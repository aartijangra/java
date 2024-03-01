package Arraysss;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        double med = medianOfArray(arr,n);
        System.out.println("Median of the array is:" + med);
    }
    public static double medianOfArray(int arr[] , int n){
        
        Arrays.sort(arr);
        int midElement = n/2;
        if(n%2==0){
            return (arr[midElement-1] + arr[midElement])/2.0;
        }
        else{
            return arr[midElement];
        }
        
    }
}
