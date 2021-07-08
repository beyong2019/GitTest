package com.sdnu.project3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Beyong
 * @Description InteratorTest
 * @date 2021/07/06 17:33
 */

public class IteratorTest {
    public static void main(String[] args) {
        Collection object = new ArrayList<>();
        Iterator it = object.iterator();
        object.add("kkk");
        object.add("mmm");
        object.add("kkk");
        //Iterator it = object.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}


