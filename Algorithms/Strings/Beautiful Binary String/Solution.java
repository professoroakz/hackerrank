import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minSteps(int n, String B){
        int steps = 0;
        for(int i = 2; i < n; i++) {
            if(B.charAt(i-2) == '0' && B.charAt(i-1) == '1' && B.charAt(i) == '0') {
                steps++;
                i += 2;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}
