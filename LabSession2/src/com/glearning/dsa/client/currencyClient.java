package com.glearning.dsa.client;

import com.glearning.dsa.service.Denomination;

import java.util.Scanner;

public class currencyClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter size of denominations : ");
        int numberOfDenominations = sc.nextInt();
        long [] denominators = new long[numberOfDenominations];
        System.out.println("Please enter denominations in random order: ");
        for(int i =0; i<denominators.length;i++){
            denominators[i]= sc.nextLong();
        }
        System.out.println("Please enter a amount you want to payment: ");
        long amount = sc.nextLong();
        Denomination denomination = new Denomination();
        denomination.bubbleSort(denominators);
        denomination.checkDenomination(denominators,amount);

    }

}
