import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int maxHourglass(int[][] M) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                int current = M[i][j] + M[i][j+1] + M[i][j+2] + M[i+1][j+1]
                    + M[i + 2][j] + M[i + 2][j + 1] + M[i + 2][j + 2];
                max = Math.max(current, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(maxHourglass(arr));

    }
}
