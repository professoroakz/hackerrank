import java.util.*;
public class Solution {


    static void partition(int[] ar) {
        int temp = 0;
        int pivot = ar[0];
        int pIndex = ar.length - 1;

        for(int i = ar.length - 1; i >= 1; i--) {
            if(ar[i] >= pivot) {
                temp = ar[i];
                ar[i] = ar[pIndex];
                ar[pIndex] = temp;
                pIndex -= 1;
            }
        }
        temp = ar[pIndex];
        ar[pIndex] = ar[0];
        ar[0] = temp;
        printArray(ar);
    }

 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }

      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt();
           }
           partition(ar);
       }
   }
