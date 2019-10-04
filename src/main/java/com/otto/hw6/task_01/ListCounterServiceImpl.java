package com.otto.hw6.task_01;

import com.otto.hw6.task_01.ListCounterService;

import java.util.HashMap;
import java.util.List;

public class ListCounterServiceImpl implements ListCounterService {

    public HashMap<Integer, Integer> countIntegersOldWay(List<Integer> input) {

        HashMap<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < input.size(); i++) {

            int value = input.get(i);

            if (result.get(value) == null) {
                result.put(value, 1);
            } else {
                int oldValue = result.get(value);
                result.replace(value, oldValue + 1);
            }

        }

        return result;
    }

    @Override
    public HashMap<Integer, Integer> countIntegersJava8Way(List<Integer> input) {

        HashMap<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < input.size(); i++){
            result.computeIfPresent(input.get(i), (key, value)-> value+1);
            result.putIfAbsent(input.get(i), 1);
        }
        return result;
    }
}
