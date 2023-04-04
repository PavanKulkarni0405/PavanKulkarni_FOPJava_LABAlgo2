package com.glearning.dsa.service;

import java.util.ArrayList;
import java.util.List;

public class Denomination {

    public void bubbleSort(long [] denominator){

        for(int i=0; i<denominator.length-1;i++){
            for(int j=0; j<denominator.length-1;j++){
                if(denominator[j]<denominator[j+1]){
                    long tmp = denominator[j+1];
                    denominator[j+1] = denominator[j];
                    denominator[j] = tmp;
                }
            }

        }
        System.out.println("Sorted array : ");
        for(int k=0; k<denominator.length;k++){
            System.out.print(denominator[k]+" ");
            System.out.println();
        }

    }
    public void checkDenomination(long [] denominator,double amount ){
        boolean flag = true;
        List<String> result = new ArrayList<>();
        while(flag){
            for(int i =0; i < denominator.length;i++){
                int numberOfDenominator =0;
                while(amount >= denominator[i]){
                    amount = amount - denominator[i];
                    numberOfDenominator++;
                }
                if(numberOfDenominator != 0) {
                    result.add("Number of denominator :: " + numberOfDenominator + " Currency : " + denominator[i]);
                }
            }
            flag = false;
        }
        System.out.println("Your payment approach in order to give min no of notes will be\n"+result);



    }



}
