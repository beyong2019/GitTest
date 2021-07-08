package com.sdnu.project1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Beyong
 * @Description entry
 * @date 2021/07/07 22:26
 */

public class ergodicMap2 {
    public static void main(String[] args) {
        HashMap<Integer,String> sites = new HashMap<>();
        sites.put(1,"Beijing");
        sites.put(2,"Shanghai");
        sites.put(3,"Shenzhen");
        Set<Map.Entry<Integer,String>> it = sites.entrySet();
        Iterator<Map.Entry<Integer,String>> object = it.iterator();
        while(object.hasNext()){
            Map.Entry<Integer,String> node = object.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key + " = " + value);
        }
    }
}


