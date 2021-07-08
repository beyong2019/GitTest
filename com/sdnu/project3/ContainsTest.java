package com.sdnu.project3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Beyong
 * @Description ContainsTest
 * @date 2021/07/06 16:45
 */

public class ContainsTest {
    public static void main(String[] args) {
        Collection object = new ArrayList<>();
        //object.add(12);
        object.add("Jack");
       // object.add(12.89);
        object.add("XiaoMing");
        User u1 = new User("kkk");
        object.add(u1);
        User u2 = new User("kkk");
        //System.out.println(object.contains(12));
        System.out.println(object.contains("Jack"));
        System.out.println(object.contains(u2));
    }
}
class User {
    public String name;
    public User(String name){
        this.name = name;
    }
}


