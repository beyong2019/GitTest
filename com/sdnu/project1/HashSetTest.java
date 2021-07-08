package com.sdnu.project1;
import java.util.HashSet;

/**
 * @author Beyong
 * @Description HashSet
 * @date 2021/05/27 08:56
 */

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<>();
        sites.add("aaa");
        sites.add("bbb");
        sites.add("ccc");
        sites.add("ccc");
        System.out.println(sites);
        for(String i : sites){
            System.out.println(i);
        }
    }
}


