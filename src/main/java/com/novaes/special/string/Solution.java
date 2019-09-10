/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novaes.special.string;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kbos
 */
public class Solution {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int begin = 0;
            int end = i;
            while (end < s.length()+1) {
                String current = s.substring(begin, end);
                if(verify(current)) {
                    result.add(current);
                }
                begin = begin + 1;
                end = end + 1;
            }

        }
        return result.size();
    }

    static boolean verify(String s) {
        if (s.chars().distinct().count() == 1L) {
            return true;
        }

        if (s.length() % 2 == 1) {
            int middle = (s.length() + 1) / 2;
            String begin = getBegin(s, middle);
            String strMiddle = getMiddle(s, middle);
            String end = getEnd(s, middle);
            if (begin.equals(end)) {
                return true;
            }
        }
        return false;
    }

    static String getBegin(String s, int middle) {
        return s.substring(0, middle - 1);
    }

    static String getMiddle(String s, int middle) {
        return s.substring(middle - 1, middle);
    }

    static String getEnd(String s, int middle) {
        return s.substring(middle, s.length());
    }

}
