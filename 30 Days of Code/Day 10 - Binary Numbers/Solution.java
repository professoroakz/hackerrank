import java.io.*;
import java.util.*;

public class Solution {

    static int countConsecOnesBinRepr(int n) {
        String binString = Integer.toBinaryString(n);
        int max = 0, currMax = 0;

        for(int i = 0; i < binString.length(); i++) {
            if(binString.charAt(i) == '1') {
                currMax++;
                max = Math.max(currMax, max);
            } else {
                currMax = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int nOnes = countConsecOnesBinRepr(n);
        System.out.println(nOnes);
    }
}
