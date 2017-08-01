import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void iceCreamParlorSnatchingChildrensMoney(int[] A, int N, int M) {
        Map<Integer, Integer> rems = new HashMap<Integer, Integer>();
        for(int i = 0; i < N; i++) {
            int currentID = i + 1;
            int cost = A[i];

            int restCost = M - cost;
            if(rems.containsKey(restCost)) {
                System.out.println(rems.get(restCost) + " " + currentID);
            }

            rems.putIfAbsent(cost, currentID);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }

            iceCreamParlorSnatchingChildrensMoney(a, n, m);
        }
    }
}
