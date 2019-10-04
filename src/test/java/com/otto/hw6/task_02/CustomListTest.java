package com.otto.hw6.task_02;

import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;

public class CustomListTest {

    private static CustomList<String> list ;

    @BeforeClass
    public static void setUp(){
        list = new CustomList<>();
        list.add("Hi");
        list.add("my");
        list.add("name");
        list.add("is");
        list.add("Billy");
    }

    @Test
    public void CustomListInsertTest(){

        assertEquals("Hi", list.get(0));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void CustomListRemoveTest(){
        list.remove(1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void CustomListClearTest(){
        list.clear();
    }

}