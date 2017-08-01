import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        public static boolean isBalanced(String expression) {
        Stack stack = new Stack();
 // pop inverse      compare w pop
        // ( ( (  |  ) ) )
        for(int i = 0; i < expression.length(); i++) {
            if(expression.charAt(i) == '(') {
                stack.push(')');
            } else if(expression.charAt(i) == '[') {
                stack.push(']');
            } else if(expression.charAt(i) == '{') {
                stack.push('}');
            } else if(stack.isEmpty() || stack.pop() != expression.charAt(i)) {
                return false;
            }
        }
        return stack.isEmpty();
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
