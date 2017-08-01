import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // xor between same number is 0
    public static int lonelyInteger(int[] a) {
        int lonely = 0;
        for(int i = 0; i < a.length; i++) {
            lonely ^= a[i];
        }

        return lonely;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
}
