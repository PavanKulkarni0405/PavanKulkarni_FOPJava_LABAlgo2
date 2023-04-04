package com.glearning.dsa.service;

public class Transaction {
    private long [] arr = {100,200,310,500,600,700,800};
    boolean success;


    public void checkTarget(long[] arr,long target){

        long sum =0;
        for(int i =0; i< arr.length; i++){
            sum +=arr[i];
            if(sum >= target){
                System.out.println("Target is achieved after "+ (i+1) +" transactions");
                success = true;
                break;
            }
        }
        if(!success) {
            System.out.println("Target can not be achieved");
        }
    }
}
