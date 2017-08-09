import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int i = 0; i < n; i++) unsorted[i] = in.next();

        Comparator bigIntComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return compareBigStringIntegers(s1, s2);
            }
        };

        Arrays.sort(unsorted, bigIntComparator);

        for(String i : unsorted) {
            System.out.println(i);
        }
    }

    static int compareBigStringIntegers(String s1, String s2) {
        if(s1.length() > s2.length()) return 1;
        if(s2.length() > s1.length()) return -1;
        for(int i = 0; i < s1.length(); i++) {
            if((int)s1.charAt(i) > (int)s2.charAt(i)) return 1;
            if((int)s2.charAt(i) > (int)s1.charAt(i)) return -1;
        }
        return 0;
    }
}
