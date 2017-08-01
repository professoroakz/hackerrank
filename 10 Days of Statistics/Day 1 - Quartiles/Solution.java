import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++) A[i] = sc.nextInt();
        sc.close();

        // 1: Sort Array
        Arrays.sort(A);

        // 2: Split in mid
        int q1 = (int)findMedian(A, 0, (A.length / 2) - 1);
        int q2 = (int)findMedian(A, 0, A.length - 1);
        int q3 = (int)findMedian(A, (A.length + 1) / 2, A.length - 1);

        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
    }

    private static double findMedian(int[] A, int start, int end) {
        if((end - start) % 2 == 0) {
            return (A[(end + start)/2]);
        } else {
            return (A[(end + start)/2] + A[(end + start)/2 + 1]) / 2;
        }
    }
}
