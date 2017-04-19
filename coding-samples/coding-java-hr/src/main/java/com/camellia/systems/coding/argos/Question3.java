package com.camellia.systems.coding.argos;


class MyComparator {


    public boolean compare(final int a, final int b) {

        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public boolean compare(final String a, final String b) {

        if (a.equals(b)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean compare(final int[] a, final int[] b) {

        boolean result = false;
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == b[i]) {
                    result = true;
                } else {
                    result = false;
                }
            }


        }
        return result;
    }
}


public class Question3 {

    public static void main(String[] args) {

    }
}