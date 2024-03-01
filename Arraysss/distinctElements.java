package Arraysss;

import java.util.Scanner;

public class distinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int count = countDistinct(arr, n);
        System.out.println("No. of distinct elements are:"+count);

    }

    public static int countDistinct(int arr[],int n){
        int count = 0;
        boolean[] visited = new boolean[1001];
        // In your specific program, this line creates an array named visited that can store up to 1001 boolean values, all initialized to false by default. This array is used to keep track of which elements in the original arr array have already been encountered during the process of counting distinct elements.

        for(int i=0; i<n; i++){
            if(!visited[arr[i]]){
                count++;
                visited[arr[i]]=true;
            }
        }
        return count;
    }
}
