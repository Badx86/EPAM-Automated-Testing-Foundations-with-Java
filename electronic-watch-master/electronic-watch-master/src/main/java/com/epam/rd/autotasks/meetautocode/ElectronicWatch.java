package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sec = scanner.nextInt();
        int hours = sec / 3600;
        int minutes = (sec % 3600) / 60;
        int seconds = sec % 60;
        String hrs = (hours < 24)? "" + hours : (hours==24)? "0" : Integer.toString(hours);
        System.out.printf ( hrs + ":" + "%02d:%02d", minutes, seconds);
    }

}