import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.time.*;

public class Solution {

    static LocalDate readDate(Scanner sc) {
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        return LocalDate.of(year, month, day);
    }

    static int calcFine(LocalDate ret, LocalDate expect) {
        int fine;
        if(ret.isEqual(expect) || ret.isBefore(expect)) {
            fine = 0;
        } else if(ret.getMonth() == expect.getMonth() && ret.getYear() == expect.getYear()) {
            fine = 15 * (ret.getDayOfMonth() - expect.getDayOfMonth());
        } else if(ret.getYear() == expect.getYear()) {
            fine = 500 * (ret.getMonthValue() - expect.getMonthValue());
        } else {
            fine = 10000;
        }

        return fine;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate ret = readDate(sc);
        LocalDate expect = readDate(sc);
        sc.close();

        System.out.println(calcFine(ret, expect));

    }
}
