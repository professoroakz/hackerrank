import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static long makeChange(int[] coins, int money) {
        long[] memo = new long[money + 1];
        memo[0] = 1;
        for(int coin : coins) {
            for(int j = coin; j < memo.length; j++) {
                memo[j] += memo[j - coin];
            }
        }
        return memo[money];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }
        System.out.println(makeChange(coins, n));
    }
}
