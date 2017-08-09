import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int bitwiseAnd(int n, int k) {
        int max = 0;
        for(int i = 1; i < n - 1; i++) {
            for(int j = i + 1; j <= n; j++) {
                int c = i & j;
                if(c < k && c > max) max = c;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            System.out.println(bitwiseAnd(n, k));
        }
    }
}
