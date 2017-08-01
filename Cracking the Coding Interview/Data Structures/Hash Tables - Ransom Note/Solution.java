import java.util.*;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public Solution(String magazine, String note) {
        this.magazineMap = new HashMap<String, Integer>();
        this.noteMap = new HashMap<String, Integer>();

        for(String s : magazine.split(" ")) {
            if(magazineMap.get(s) != null) {
                magazineMap.put(s, magazineMap.get(s) + 1);
            } else {
                magazineMap.put(s, 1);
            }
        }

        for(String s : note.split(" ")) {
            if(noteMap.get(s) != null) {
                noteMap.put(s, noteMap.get(s) + 1);
            } else {
                noteMap.put(s, 1);
            }
        }
    }

    public boolean solve() {
        for(Map.Entry<String, Integer> entry : noteMap.entrySet()) {
            if(magazineMap.get(entry.getKey()) == null ||
               magazineMap.get(entry.getKey()) < entry.getValue()) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}
