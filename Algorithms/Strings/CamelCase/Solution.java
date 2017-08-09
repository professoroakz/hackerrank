import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int wc = 1;
        for(int i = 0; i < s.length(); i++) {
            // swoop until character is in range of capital character.
            // new word, continue until next one
            int currentAscii = (int) s.charAt(i);
            if(currentAscii >= 65 && currentAscii <= (65 + 25)) wc++;
        }
        System.out.println(wc);
    }
}
