import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static double getMedian(int[] A, int start, int end) {
        if((end - start) % 2 == 0) {
            return A[(start + end) / 2];
        } else {
            int left = A[(start + end) / 2];
            int right = A[(start + end) / 2 + 1];
            return (left + right) / 2.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] X = new int[N];
        for(int i = 0; i < N; i++) X[i] = sc.nextInt();

        int[] F = new int[N];
        int sSize = 0;
        for(int i = 0; i < N; i++) {
            F[i] = sc.nextInt();
            sSize += F[i];
        }

        int[] S = new int[sSize];
        int sIdx = 0;

        for(int i = 0; i < N; i++) {
            int current = X[i];
            for(int j = 0; j < F[i]; j++) {
                S[sIdx] = X[i];
                sIdx++;
            }
        }

        Arrays.sort(S);

        double q1 = getMedian(S, 0, S.length / 2 - 1);
        double q3 = getMedian(S, (S.length + 1) / 2, S.length - 1);
        System.out.println(q3 - q1);
    }
}
