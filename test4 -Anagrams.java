//JAVA Anagrams | HackerRank

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function

    
        // Converting input string to character array
        char firstArray[] = a.toCharArray();
        char secondArray[] = b.toCharArray();
        
        Arrays.sort(firstArray);

        Arrays.sort(secondArray);


        if(Arrays.equals(firstArray, secondArray)){
            System.out.println("Anagrams");
        } else{
            System.out.println("Not Anagrams");
        }
    }

    public static void main(String[] args) {