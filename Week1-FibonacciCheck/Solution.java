import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        List<Long> list = new ArrayList<Long>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            br.readLine();
            String text = br.readLine();
            while (text != null) {
                list.add(Long.parseLong(text));
                text = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
        for(Long value : list) {
            long fib = 0, num1 = 0, num2 = 1;
            while(fib < value) {
                fib = num1 + num2;
                num1 = num2;
                num2 = fib;
            }
            if (fib == value) {
                System.out.println("IsFibo");
            } else {
                System.out.println("IsNotFibo");
            }
        }
    }
}