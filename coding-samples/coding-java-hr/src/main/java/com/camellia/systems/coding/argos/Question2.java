package com.camellia.systems.coding.argos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by satishdvla on 09/04/17.
 */
public class Question2 {


    static int maxDifference(int[] a) {

        int maxValue = 0;
        int maxIndex = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];
                maxIndex = i;
            }
        }

        int minValue = maxValue;
        int minIndex = 0;

        for (int j = 0; j < maxIndex; j++) {

            if (a[j] < maxValue) {
                minValue = a[j];
                minIndex = j;
            }
        }

        if (maxValue > minValue && maxIndex > minIndex) {
            return maxValue - minValue;
        } else {
            return -1;
        }

    }


    public static void main(String[] args) throws IOException {


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        System.out.println(maxDifference(a));
    }

}


