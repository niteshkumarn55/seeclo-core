package com.Hacker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolList {

    public static int toolchanger(List<String> tools, int k, String q) {

        Map<String, Integer> map = new HashMap<>();
        for(int i = 1; i<=tools.size(); i++){
            map.put(tools.get(i-1), i);
        }
        Integer value = map.get(q);
        int loc1  = k - tools.size() + value +1;
        int loc2 = k - value +1 ;

        // Write your code here
        return loc1>loc2?Math.abs(loc1):Math.abs(loc2);
    }

    public static void main(String[] args) {
        List<String> tools = new ArrayList<>();
        tools.add("b");
        tools.add("f");
        tools.add("k");
        tools.add("s");

        int val = toolchanger(tools, 1, "s");
        System.out.println(val);
    }
}
