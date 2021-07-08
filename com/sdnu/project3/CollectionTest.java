package com.sdnu.project3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Beyong
 * @Description CollectionTest1
 * @date 2021/07/06 14:51
 */

public class CollectionTest {
    public static void main(String[] args) {
        Collection object = new ArrayList<>();
        object.add("kkk");
        object.add(12);
        object.add(12.5);
        object.add(true);
        System.out.println(object);
    }
}


