package JavaCodes;


import java.util.*; 
  
public class RemoveConsecutiveDuplicate 
{ 
  
    // A iterative function that removes  
    // consecutive duplicates from string S 
    static void removeDuplicates(char[] S)  
    { 
        int n = S.length; 
  
        // We don't need to do anything for 
        // empty or single character string. 
        if (n < 2)  
        { 
            return; 
        } 
  
        // j is used to store index is result 
        // string (or index of current distinct 
        // character)  
        int j = 0; 
  
        // Traversing string  
        for (int i = 1; i < n; i++)  
        { 
            // If current character S[i] 
            // is different from S[j] 
            if (S[j] != S[i]) 
            { 
                j++; 
                S[j] = S[i]; 
                System.out.println(S);
            } 
        } 
        System.out.println(Arrays.copyOfRange(S, 0, j + 1)); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        char S1[] = "geeks".toCharArray(); 
        removeDuplicates(S1); 
  
        char S2[] = "aabcca".toCharArray(); 
        removeDuplicates(S2); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */