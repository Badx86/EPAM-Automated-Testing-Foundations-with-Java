package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;
public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner scanner = new Scanner(System.in);
        String stringNumber = scanner.nextLine();
        int number = Integer.parseInt(stringNumber);
        if (number < 0) {
            System.out.println("Seriously? Why so negative?");
        } else if (number == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else {
            String[] list = new String[number];
            for (int i = 0; i < number; i++) {
                String string = scanner.nextLine();
                list[i] = string;
            }
            for (int i = 0; i < number; i++) {
                System.out.println("Hello, " + list[i]);
            }
        }
    }
}
