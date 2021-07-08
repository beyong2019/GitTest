package com.sdnu.project1;
import java.util.HashMap;

/**
 * @author Beyong
 * @Description HashMapTest
 * @date 2021/05/27 09:01
 */

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"aaa");
        map.put(2,"bbb");
        map.put(3,"ccc");
        for(Integer i : map.keySet()){
            System.out.println( i + map.get(i));
        }
    }
}


