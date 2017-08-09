import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String funnyString(String s){
        String r = new StringBuilder(s).reverse().toString();
        String fun = "";
        for(int i = 1; i < r.length(); i++) {
            int ri = Math.abs((int)r.charAt(i) - (int)r.charAt(i-1));
            int si = Math.abs((int)s.charAt(i) - (int)s.charAt(i-1));
            if(ri != si) {
                fun = "Not Funny";
                return fun;
            }
        }
        fun = "Funny";
        return fun;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
