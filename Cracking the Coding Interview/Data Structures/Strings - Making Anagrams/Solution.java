import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {

    public static int numberNeeded(String first, String second) {
        int[] A = new int[26];

        for(int i = 0; i < first.length(); i++) {
            A[first.charAt(i) - 'a'] += 1;
        }

        for(int j = 0; j < second.length(); j++) {
            A[second.charAt(j) - 'a'] -= 1;
        }

        int toDelete = 0;
        for(int k = 0; k < A.length; k++) {
            toDelete += Math.abs(A[k]);
        }

        return toDelete;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
