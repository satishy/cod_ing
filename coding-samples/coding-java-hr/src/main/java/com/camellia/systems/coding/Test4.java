package com.camellia.systems.coding;

/**
 * Created by satishdvla on 17/04/17.
 */
public final class Test4 {
    class Inner {
        void test() {
            if (Test4.this.flag) {
                sample();
            }                }
    }        private boolean flag = true;
    public void sample() {
        System.out.println("Sample");
    }        public Test4() {
        (new Inner()).test();
    }
    public static void main(String args []) {
        new Test4();
    } }