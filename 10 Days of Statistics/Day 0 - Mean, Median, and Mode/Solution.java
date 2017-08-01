import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import org.apache.commons.lang.ArrayUtils;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Float> nums = new ArrayList<Float>();
        Map<Float, Integer> counts = new HashMap<Float, Integer>();

        int n = sc.nextInt();
        float sum = 0;

        for(int i = 0; i < n; i++) {
            float current = sc.nextFloat();

            nums.add(current);

            if(counts.get(current) != null) {
                counts.put(current, counts.get(current) + 1);
            } else {
                counts.put(current, 1);
            }

            sum += current;
        }

        Collections.sort(nums);

        float mean = (float)(sum / n);
        float median = (n % 2 == 0) ? ((float)(nums.get(n/2 - 1) + nums.get(n/2)) / 2) : nums.get(n/2 - 1);
        float mode = nums.get(0);
        int currentSize = counts.get(nums.get(0));

        for(int x = 1; x < nums.size(); x++) {
            if(counts.get(nums.get(x)) > currentSize) {
                currentSize = counts.get(nums.get(x));
                mode = nums.get(x);
            }
        }

        System.out.println(mean);
        System.out.println(median);
        System.out.println(Math.round(mode));
    }
}
