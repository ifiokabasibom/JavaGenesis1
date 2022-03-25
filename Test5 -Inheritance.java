import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {

        // Complete the function

        boolean isAnagram = true;  

        if (a.length() != b.length()) {  

            isAnagram = false;  

        } else {  

            char[] a_array = a.toLowerCase().toCharArray();  

            char[] b_array = b.toLowerCase().toCharArray();  

            sortCharArray(a_array);  

            sortCharArray(b_array);  

            isAnagram = arraysEquals(a_array, b_array);  

        }  

        return isAnagram; 

    }

    

    private static char[] sortCharArray(char[] arry){

        int length = arry.length;

        for(int i=0;i<length;i++){

            for(int j=i+1;j<length;j++){

                if (arry[j] < arry[i]) {

                    char temp = arry[i];

                    arry[i]=arry[j];

                    arry[j]=temp;

                }

            }

        }

        return arry;

    }

    private static boolean arraysEquals(char[] a_arry,char[] b_arry){

        boolean arryEq= true;

        int length = a_arry.length;

        for(int i=0;i<length;i++){

            if(a_arry[i]!=b_arry[i]){

                arryEq=false;

                break;

            }

        }

        return arryEq;

    }



  public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String a = scan.next();

        String b = scan.next();

        scan.close();

        boolean ret = isAnagram(a, b);

        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }

}