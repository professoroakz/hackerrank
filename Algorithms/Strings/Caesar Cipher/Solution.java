import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if(Character.isLetter(s.charAt(i))) {
                int curr = (int) s.charAt(i);
                int aA = (Character.isUpperCase(curr) ? (int)'A' : (int)'a');
                char c =  (char)(aA + (curr - aA + k) % 26);
                sb.append(c);
            } else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
