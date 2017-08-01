import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static double[] getMedians(int[] array) {
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return -1 * a.compareTo(b);
            }
        };

        PriorityQueue<Integer> lowers = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> highers = new PriorityQueue<Integer>(); // min heap

        double[] medians = new double[array.length];

        for(int i = 0; i < array.length; i++) {
            int number = array[i];
            addNumber(number, lowers, highers);
            rebalance(lowers, highers);
            medians[i] = getMedian(lowers, highers);
        }

        return medians;
    }

        public static void addNumber(int number, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
            if(lowers.size() == 0 || number < lowers.peek()) {
                lowers.add(number);
            } else {
                highers.add(number);
            }
        }

        public static void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
            PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
            PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;

            if(biggerHeap.size() - smallerHeap.size() >= 2) {
                smallerHeap.add(biggerHeap.poll());
            }
        }

        public static double getMedian(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
            PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
            PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;

            if(biggerHeap.size() == smallerHeap.size()) {
                return ((double)biggerHeap.peek() + smallerHeap.peek()) / 2;
            } else {
                return biggerHeap.peek();
            }
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        double[] r = getMedians(a);
        for(double d : r) System.out.println(d);
    }
}
