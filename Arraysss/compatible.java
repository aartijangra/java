// Compatible Arrays
// Two arrays are said to be compatible if they are of the same size and if the ith element in the first array is greater than or equal to the ith element in the second array for all ‘i’.  Write a  program to find whether 2 arrays are compatible or not.


package Arraysss;

import java.net.Socket;
import java.util.Scanner;


public class compatible {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        //input
        System.out.println("enter the size of arrays:");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        int arr2[] = new int[n];
        for(int i=0; i<n; i++){
            arr2[i] = sc.nextInt();
        }

        //checking compatibility
        boolean comp = true;
        for(int i=0; i<n; i++){
            if(arr1[i] < arr2[i]) comp=false;
        }

        //output
        if(comp == true) System.out.println("COMPATIBLE");
        else{
            System.out.println("INCOMPATIBLE");
        }
    }
}
