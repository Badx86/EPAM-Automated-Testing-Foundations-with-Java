package com.epam.rd.autotasks.godutch;
import java.util.Scanner;
public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner scanner = new Scanner( System.in );
        int checkSum = scanner.nextInt();
        if (checkSum < 0) {
            System.out.println("Bill total amount cannot be negative");
            return;
        }
        int friendsNum = scanner.nextInt();
        if (friendsNum <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
            return;
        }
        int totalSum = checkSum + checkSum / 10;
        System.out.println((int)Math.ceil(totalSum / friendsNum));
//        int totalSum = checkSum / friendsNum;
//        System.out.println((int)Math.ceil(checkSum * 1.1 / friendsNum));
    }
}

