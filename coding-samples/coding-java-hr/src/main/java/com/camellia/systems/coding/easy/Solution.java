package com.camellia.systems.coding.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below. To make the problem a little easier, a portion of the code is provided for you in the editor.

 Note: We recommend completing Java Stdin and Stdout I before attempting this challenge.

 Input Format

 There are three lines of input:

 The first line contains an integer.
 The second line contains a double.
 The third line contains a String.
 Output Format

 There are three lines of output:

 On the first line, print String: followed by the unaltered String read from stdin.
 On the second line, print Double: followed by the unaltered double read from stdin.
 On the third line, print Int: followed by the unaltered integer read from stdin.
 To make the problem easier, a portion of the code is already provided in the editor.

 Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens;
 because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine()
 will be reading the remainder of the integer line (which is empty).

 Sample Input

 42
 3.1415
 Welcome to HackerRank's Java tutorials!
 Sample Output

 String: Welcome to HackerRank's Java tutorials!
 Double: 3.1415
 Int: 42
 */
public class Solution {


    public static void main(String[] args) throws NoSuchFieldException {

        //        int i = scan.nextInt();
//
//        double d = scan.nextDouble();

        String input = "42 3.1456 Welcome to HackerRank's Java tutorials!";

        String[] solution = new String[20];

        Scanner scan = new Scanner(input);

        for(int k=0; k<solution.length; k++) {
            if(scan.hasNext()) {
                solution[k] = scan.next();
            }
        }

        int i = Integer.parseInt(solution[0]);
        double d = Double.parseDouble(solution[1]);
        String s = "";
        System.out.println("Lenght" + solution.length);
        System.out.println("Lenght" + solution[2]);

        for(int j=2;j<solution.length;j++) {
            if(solution[j]!=null) {
                s = s+solution[j]+" ";
            }
        }



        String pattern = "[a-zA-Z]+";

        Pattern strP = Pattern.compile(pattern);

        //scan.

      //  while(scan.hasNext()) {
       //     s = s + scan.findInLine(strP);
      //  }



        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }


}
