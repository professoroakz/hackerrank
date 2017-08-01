import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            String s = sc.nextLine();
            for(int j = 0; j < s.length(); j++) {
                if(j % 2 == 0) even.append(s.charAt(j));
                else odd.append(s.charAt(j));
            }
            System.out.printf("%s %s\n", even.toString(), odd.toString());
        }
    }
}
