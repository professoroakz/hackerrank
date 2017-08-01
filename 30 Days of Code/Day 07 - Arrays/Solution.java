import java.io.*;
import java.util.*;


public class Solution {

    private static void printReverse(int[] arr) {
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.printf("%d ", arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        printReverse(arr);
    }
}
