package com.sdnu.project1;
import java.util.LinkedList;

/**
 * @author Beyong
 * @Description LinkedList
 * @date 2021/05/27 08:49
 */

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.addFirst("kkk");
        System.out.println(list);
    }
}


