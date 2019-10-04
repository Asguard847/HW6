package com.otto.hw6.service.impl;

import com.otto.hw6.task_01.ListCounterService;
import com.otto.hw6.task_01.ListCounterServiceImpl;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class ListCounterServiceImplTest {

    public static final List<Integer> INTEGER_LIST = Arrays.asList(1, 2, 3, 3, 3, 3, 3, 4, 4, 4);

    ListCounterService service = new ListCounterServiceImpl();

    @Test
    public void testListCounterOld() {

        Map<Integer, Integer> result = service.countIntegersOldWay(INTEGER_LIST);

        assertTrue(result.get(2) == 1);
        assertTrue(result.get(3) == 5);
        assertTrue(result.get(4) == 3);
        assertNull(result.get(5));
    }

    @Test
    public void testListCounterJava8(){

        Map<Integer, Integer> result = service.countIntegersJava8Way(INTEGER_LIST);

        assertTrue(result.get(2) == 1);
        assertTrue(result.get(3) == 5);
        assertTrue(result.get(4) == 3);
        assertNull(result.get(5));
    }

}