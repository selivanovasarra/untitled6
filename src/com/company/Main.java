package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int nM, nH;
        System.out.println("enter how many kids are in this grup");
        nH=input.nextInt();
        nM=nH/10;
        if(nH % 10 ==0)
            System.out.println("The number of gids that the camp need for this year is "+nM);
        else
            System.out. println("The number of gids that the camp need for this year is "+(nM+1));
    }
}
