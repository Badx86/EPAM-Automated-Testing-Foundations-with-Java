package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        int sum = 0;
        int avg = 0;
        int numberOfNumbers = 0;
        while(true){

            int number = Integer.valueOf(scanner.nextInt());
            numberOfNumbers = numberOfNumbers+1;
            if(number != 0){
                sum = sum+number;
                avg = sum/numberOfNumbers;
            }
            if(number == 0){
                break;
            }
        }
        System.out.println(avg);
    }

}