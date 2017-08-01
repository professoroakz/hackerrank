import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static long swaps = 0;

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void merge(int[] arr, int[] help, int start, int mid, int end) {
        for(int i = start; i <= end; i++) {
            help[i] = arr[i];
        }

        int current = start;
        int left = start;
        int right = mid + 1;

        while(left <= mid && right <= end) {
            if(help[left] <= help[right]) {
                arr[current++] = help[left++]; // sets and increments later
            } else {
                // count swaps each time we use right
                swaps += mid + 1 - left;
                arr[current++] = help[right++];
            }
        }

        while(left <= mid) {
            arr[current++] = help[left++];
        }
    }

    public static long mergeSort(int[] arr) {
        int[] help = new int[arr.length];
        mergeSort(arr, help, 0, arr.length - 1);
        return swaps;
    }

    public static void mergeSort(int[] arr, int[] help, int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, help, start, mid);
            mergeSort(arr, help, mid + 1, end);
            merge(arr, help, start, mid, end);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int arr_i=0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            System.out.println(mergeSort(arr));
            swaps = 0;
        }
    }
}
