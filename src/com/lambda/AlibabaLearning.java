package com.lambda;

import java.util.Arrays;

/**
 * @author Lee
 * @date 2024/08/06 22:58
 **/
public class AlibabaLearning {
    public static void main(String[] args) {
        String str = "a,b,c,,";
        String[] strs = str.split(",");
        System.out.println(Arrays.toString(strs));
    }
}
