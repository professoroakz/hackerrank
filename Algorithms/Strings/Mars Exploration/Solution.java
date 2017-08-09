import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int ruinedLetters(String transmission) {
        String sos = "SOS";
        int count = 0;
        for(int i = 0; i < transmission.length(); i++) {
            if(transmission.charAt(i) != sos.charAt(i % 3)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        System.out.println(ruinedLetters(S));
    }
}
