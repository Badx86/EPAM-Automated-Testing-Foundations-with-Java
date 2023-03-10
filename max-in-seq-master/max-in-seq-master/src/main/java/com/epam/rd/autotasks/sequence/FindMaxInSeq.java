package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {

        // Put your code here
        int currentValue;
        int maxWannaBe = Integer.MIN_VALUE;
        String[] items = new Scanner(System.in).nextLine().split(" ");
        for (String item: items) {
            currentValue = Integer.parseInt(item);
            if (currentValue == 0) break;;
            if (currentValue > maxWannaBe) maxWannaBe = currentValue;
        }
        return maxWannaBe;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code
        FindMaxInSeq test = new FindMaxInSeq();
        System.out.println(FindMaxInSeq.max());
    }
}
