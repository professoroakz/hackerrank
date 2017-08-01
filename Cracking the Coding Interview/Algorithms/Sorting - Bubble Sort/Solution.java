import java.io.*;
import java.util.*;

public class Solution {
    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void bubbleSort(int[] A, int N) {
        int totalSwaps = 0;
        for(int i = 0; i < N; i++) {
            int numSwaps = 0;
            for(int j = 0; j < N - 1; j++) {
                if(A[j] > A[j + 1]) {
                    swap(A, j, j+1);
                    numSwaps++;
                    totalSwaps++;
                }
            }

            if(numSwaps == 0) break;
            numSwaps = 0;
        }

        System.out.printf("Array is sorted in %d swaps.\n", totalSwaps);
        System.out.printf("First Element: %d\n", A[0]);
        System.out.printf("Last Element: %d\n", A[A.length - 1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++) A[i] = sc.nextInt();
        bubbleSort(A, N);
    }
}
