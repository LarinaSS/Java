package com.company;

import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
        String [] array = new String [] {"cat", "mouse", "dog", "crocodile", "tiger", "deer", "cat", "moose", "wolf"};
        Map<String, Integer> map = new HashMap<>();
        for(String str: array) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        System.out.println(map);

    }
}
