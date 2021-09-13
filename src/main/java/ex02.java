/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Chase Cutshall
 */

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("What is input string?");

        name=input.next();

        int count=0;

        for (int i= 0; i<name.length(); i++)
        {
            if (name.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println(name+ " has "+ count + " characters.");
    }
}
