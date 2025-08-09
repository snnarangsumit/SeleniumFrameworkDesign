package JavaCodes;

import java.util.*; 

public class maxProductArrayOfposnegInteger { 
      
    // Function to find maximum product pair 
    // in arr[0..n-1] 
    static void maxProduct(int arr[], int n) 
    { 
        if (n < 2) 
        { 
            System.out.println("No pairs exists"); 
            return; 
        } 
       
        // Initialize max product pair 
        int a = arr[0], b = arr[1], c=arr[2];
       
        // Traverse through every possible pair 
        // and keep track of max product 
        for (int i = 0; i < n; i++) 
          for (int j = i+1; j < n; j++) 
        	  for (int k = j+1; k < n; k++) 
             if (arr[i] * arr[j] * arr[k]> a * b * c){ 
                a = arr[i];  
                b = arr[j]; 
                c= arr[k];
             } 
               
        System.out.println("Max product pair is {" + 
                           a + "," + b + ","+ c +"}"); 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        int arr[] = {1, 4, 3, 2}; 
        int n = arr.length; 
        maxProduct(arr, n); 
              
    } 
} 
  