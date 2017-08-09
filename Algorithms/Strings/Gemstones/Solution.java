import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.BitSet;

public class Solution {

    static int gemstones(String[] arr) {
        int nChars = 26;

        BitSet bitset = new BitSet(nChars);
        bitset.set(0, nChars);

        for(String s : arr) {
            BitSet current = new BitSet(nChars);
            for(Character c : s.toCharArray()) {
                current.set(c - 'a');
            }
            bitset.and(current);
        }

        return bitset.cardinality();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }
}
