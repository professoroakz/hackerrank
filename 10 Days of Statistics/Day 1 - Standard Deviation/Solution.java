import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static double calcMean(int[] X, double N) {
        double mean = 0.0;
        for(int i = 0; i < N; i++) mean += X[i];
        return mean / N;
    }

    public static double stdev(int[] X, double N, double mean) {
        double stdev = 0.0;
        for(int i = 0; i < N; i++) stdev += Math.pow(X[i] - mean, 2);
        return Math.sqrt(stdev / N);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];

        for(int i = 0; i < N; i++) X[i] = sc.nextInt();

        double dN = N / 1.0;
        double mean = calcMean(X, dN);
        double stdev = stdev(X, dN, mean);
        System.out.printf("%.1f", stdev);
    }
}
