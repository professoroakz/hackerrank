import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar) {
        for(int i = 1; i < ar.length; i++) {
            int j = i;
            while(j > 0 && ar[j-1] > ar[j]) {
                int temp = ar[j-1];
                ar[j-1] = ar[j];
                ar[j] = temp;
                j--;
            }
            printArray(ar);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
       }
       insertionSortPart2(ar);
    }

    private static void printArray(int[] ar) {
      for(int n : ar){
         System.out.print(n + " ");
      }
        System.out.println();
   }
}
