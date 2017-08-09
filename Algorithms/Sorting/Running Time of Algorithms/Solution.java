import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int insertionSortWithPrints(int[] A) {
        int swaps = 0;
        for(int i = 1; i < A.length; i++) {
            int x = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > x) {
                A[j+1] = A[j];
                j = j - 1;
                swaps++;
            }
            A[j+1] = x;
        }
        return swaps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < A.length; i++) A[i] = sc.nextInt();

        System.out.println(insertionSortWithPrints(A));
    }
}
