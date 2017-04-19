package com.camellia.systems.coding.easy;


/**
 * Created by satishdvla on 08/04/17.
 */
public class DiagonalDiff {



    private static int diagnolDiffArray(int a[][]) {

        int result = 0;
        int leftDiaSum = 0;
        int rightDiaSum = 0;
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j <a.length ; j++) {
             if(i == j) {

                leftDiaSum = leftDiaSum + a[i][j];
             }

             if((i+j)==a.length-1) {
                 rightDiaSum = rightDiaSum + a[i][j];
             }

            }
        }

        result = leftDiaSum - rightDiaSum;

      return result;
    }


    public static void main(String args[]) {

        int a[][] = {{10,12,23},{10,11,22},{10,11,22}};

        System.out.println(diagnolDiffArray(a));

    }



}
