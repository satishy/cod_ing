package com.camellia.systems.coding.argos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by satishdvla on 09/04/17.
 */
public class Question1 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String res;
        String _s;
        try {
            _s = in.nextLine();
        } catch (Exception e) {
            _s = null;
        }

        res = is_Palindrome(_s);
        bw.write(res);
        bw.newLine();

        bw.close();
    }

    static String is_Palindrome(String s) {

        int [] count = new int[26];
        for( int i = 0; i < s.length(); i++ )
        {
            char ch = s.charAt(i);
            count[ch-'a']++;
        }
        int oddOccur = 0;
        for( int cnt:count )
        {
            if( oddOccur > 1)
                return "NO";
            if( cnt%2 == 1 )
                oddOccur++;
        }
        return "YES";
    }

}