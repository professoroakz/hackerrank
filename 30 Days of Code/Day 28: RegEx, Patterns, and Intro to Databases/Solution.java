import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String gmailRegex = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(gmailRegex);

        List<String> l = new ArrayList<String>();

        for(int a0 = 0; a0 < N; a0++){
            String name = in.next();
            String email = in.next();
            Matcher m = pattern.matcher(email);
            if(m.find()) l.add(name);
        }

        Collections.sort(l);

        for(String s : l) {
            System.out.println(s);
        }
    }
}
