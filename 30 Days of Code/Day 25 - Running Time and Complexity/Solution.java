import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static boolean isPrime(int p) {
        if(p < 2) return false;
        int sq = (int) Math.floor(Math.sqrt(p));

        for(int i = 2; i <= sq; i++) {
            if(p % i == 0) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int p = sc.nextInt();
            System.out.println(isPrime(p) ? "Prime" : "Not prime");
        }
    }
}
