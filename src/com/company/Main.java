package com.company;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int total = 0;
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("How many sides does your dice have? ");
        int sides = input.nextInt();
        ArrayList<Integer> valuesList= new ArrayList<Integer>();
        for(int i=0; i<sides;i++){
            valuesList.add(0);
        }
        System.out.println("How many times do you want to throw it? ");
        int throwamount = input.nextInt();
        for (int i = 0; i <throwamount ; i++) {
            int value =  random.nextInt(sides)+1;
            total = total+value;
            valuesList.set(value-1,valuesList.get(value-1)+1);

        }
        for (int i = 0; i <sides ; i++) {
            System.out.println("the side number "+(i+1)+"was landed on "+((double)valuesList.get(i)/sides*100)+"% of the time");

        }
        System.out.println(total);
    }
}