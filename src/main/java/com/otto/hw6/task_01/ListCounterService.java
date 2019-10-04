package com.otto.hw6.task_01;

import java.util.HashMap;
import java.util.List;

public interface ListCounterService {

    HashMap<Integer, Integer> countIntegersOldWay(List<Integer> input);

    HashMap<Integer, Integer> countIntegersJava8Way(List<Integer> input);

}
