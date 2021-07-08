package com.sdnu.generics;

/**
 * @author Beyong
 * @Description genericsInterface
 * @date 2021/07/07 16:30
 */

public class Test2 {
    public static void main(String[] args) {
        Cat object = new Cat();
        String s = object.move("myCat");
        System.out.println(s);
    }
}
interface Animal <T>{
    T move(T t);
}
class Cat implements Animal<String>{
    public String move(String s){
        return s + "catch mouse";
    }
}

