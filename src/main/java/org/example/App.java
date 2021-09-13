package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables
        int len, wid;
        double sqft, gal;
        Scanner sc = new Scanner(System.in);

        //get user input
        len = sc.nextInt();
        wid = sc.nextInt();

        //calculate the amount of gallons and square feet
        sqft = len * wid;
        gal = Math.ceil(sqft / 350.0);

        //print findings
        System.out.println("You will need to purchase " + (int) gal + " gallons of paint to cover " + (int) sqft + " square feet.");

        sc.close();
    }
}