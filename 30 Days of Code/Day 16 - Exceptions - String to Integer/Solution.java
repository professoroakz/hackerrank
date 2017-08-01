import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void strtoi(String instr) {
        try {
            int s = Integer.valueOf(instr);
            System.out.println(s);
        } catch(NumberFormatException e) {
            System.out.println("Bad String");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        strtoi(S);
    }
}
