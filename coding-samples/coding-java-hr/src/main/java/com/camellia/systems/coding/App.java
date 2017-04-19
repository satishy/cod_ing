package com.camellia.systems.coding;

/**
 * Hello world!
 *
 */
public class App 
{



    public static void divide(int a, int b) {
        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.print("Exception ");
        } finally {
            System.out.println("Finally");        } }


    public static void main( String[] args )
    {
        divide(4,0);
        System.out.println( "Hello World!" );
    }
}
