import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] X = new int[N];
        int[] W = new int[N];

        for(int i = 0; i < N; i++) X[i] = sc.nextInt();
        for(int i = 0; i < N; i++) W[i] = sc.nextInt();

        sc.close();

        int total = 0, totalWeights = 0;
        for(int i = 0; i < X.length; i++) {
            total += X[i] * W[i];
            totalWeights += W[i];
        }

        double wM = (double) total / totalWeights;
        System.out.format("%.1f", wM);
    }
}
