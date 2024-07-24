package com.lambda;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Lee
 * @date 2024/07/22 21:55
 **/
public class IdeaTest1 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (Integer integer : myList) {
            System.out.println(integer);


        }

        for (Integer integer : myList) {
            System.out.println();
        }
        System.out.println("格式化代码快捷键 “CTRl + alt + r");
        System.out.println("Ni");
        System.out.println("学费了吗" +
                "");
        HashMap<Object, Object> map = new HashMap<>();
        System.out.println(1);
        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
