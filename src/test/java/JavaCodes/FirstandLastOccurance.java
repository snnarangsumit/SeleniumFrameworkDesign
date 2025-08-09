package JavaCodes;

import java.io.*; 

public class FirstandLastOccurance  
{ 
    // Function for finding first and last occurrence 
    // of an elements 
    public static void findFirstAndLast(int arr[], int x) 
    { 
        int n = arr.length; 
        int first = -1, last = -1;
        int i=0;
//         for (int i = 0; i < n; i++) 
//        { 
//            if (x != arr[i]) 
//                continue; 
//            if (first == -1) 
//                first = i; 
//            last = i; 
//        } 
//        if (first != -1){ 
//            System.out.println( "First Occurrence = "  + first); 
//            System.out.println("Last Occurrence = " + last); 
//        } 
//        else
//            System.out.println("Not Found"); 
        for (i=0;i<n;i++)
        {
        	if (arr[i] == x && first == -1) {
        		first=i;}
        	if (arr[i] == x && first != -1) {
        		last=i;
        		}
        }
        System.out.println("first index is:" + first);
        System.out.println("last index is:" + last);
    	
    } 
      
    public static void main (String[] args)  
    { 
         int arr[] = {1, 2, 2, 2, 2, 1, 4, 7 ,8 ,8 }; 
         int x = 1; 
         findFirstAndLast(arr, x); 
    } 
} 