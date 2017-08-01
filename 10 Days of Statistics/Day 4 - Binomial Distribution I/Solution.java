import java.io.*;
import java.util.*;

public class Solution {

    private static long factorial(int n) {
        if(n < 0) return 1;
        long res = 1;
        while(n > 0) res *= n--;
        return res;
    }

    private static long combination(int n, int x) {
        if(n < 0 || x < 0 || x > n) return 1;
        return factorial(n) / (factorial(x) * factorial(n - x));
    }

    private static double binomial(int n, int x, double p) {
        if(p < 0 || p > 1 || n < 0 || x < 0 || x > n) return 1;
        return combination(n, x) * Math.pow(p, x) * Math.pow(1 - p, n - x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ratio = sc.nextDouble();
        double p = ratio / (1 + ratio);
        int n = 6;

        double res = 0.0;
        for(int i = 3; i <= n; i++) res += binomial(n, i, p);

        System.out.format("%.3f", res);
    }
}
