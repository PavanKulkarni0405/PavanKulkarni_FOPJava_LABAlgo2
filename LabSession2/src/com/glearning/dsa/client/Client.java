package com.glearning.dsa.client;

import com.glearning.dsa.service.Transaction;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        System.out.println("Please enter number of transactions");
        int transactions = sc.nextInt();
        long [] arr = new long[transactions];
        System.out.println("Please enter transactions");
        for(int i =0; i<transactions;i++){
            arr[i]=sc.nextLong();
        }
        System.out.println("Please enter the Target");
        long target = sc.nextLong();
        Transaction transaction = new Transaction();
        transaction.checkTarget(arr,target);

    }
}
