package com.Java8;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class StringConcate {

    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("nda");
        list.add("pilot");
        list.add("deploy");
        list.add("maintain");
        String result = StringUtils.join(list, ", ");
        System.out.println(result);
    }
}
