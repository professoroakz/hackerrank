import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim().toLowerCase();
        Set<Character> alphabet = new HashSet<Character>();
        int a = (int)'a';
        int z = (int)'z';
        for(; a < z; a++) {
            char c = (char)a;
            alphabet.add(c);
        }

        for(Character c : s.toCharArray()) {
            if(alphabet.contains(c)) { alphabet.remove(c); }
        }

        if(alphabet.size() == 0) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }
}
