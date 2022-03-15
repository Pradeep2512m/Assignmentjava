package com.harman.project3;

import java.util.Scanner;

public class Childinheritance extends Inheritance {
    public static void main(String[] args) {
        Childinheritance clac = new Childinheritance();
        Scanner input = new Scanner(System.in);
        int x, y, addresult, subresult;
        System.out.println("enter the first num: ");
        x = input.nextInt();
        System.out.println("enter the second num: ");
        y = input.nextInt();
        addresult = clac.Add2numbers(x, y);
        System.out.println(addresult);
        subresult = clac.Sub2numbers(x, y);
        System.out.println(subresult);

    }
}