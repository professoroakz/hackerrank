import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        ArrayList<Character> l = new ArrayList<Character>();
        String hackerrank = "hackerrank";
        for(Character c : "hackerrank".toCharArray()) l.add(c);
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int current = 0;
            for(Character c : s.toCharArray()) {
                if(l.size() == current) { break; }
                if(c.equals(l.get(current))) current++;
            }

            if(l.size() == current) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
