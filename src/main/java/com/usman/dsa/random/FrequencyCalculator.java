package com.usman.dsa.random;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class FrequencyCalculator {
    public static void main(String[] args) {
        int[] frequency = {1, 3, 0, 2, 2, 3, 10, 7, 6, 5, 5, 6, 8, 9, 10, 0, 1, 1, 2, 11, 11, 11, 11};
        FrequencyCalculator frequencyCalculator = new FrequencyCalculator();
        frequencyCalculator.calculate(frequency);
    }

    private void calculate(int[] frequency) {
        Map<Integer, Integer> freq = new HashMap<>();
        IntStream.of(frequency).forEach(number -> {
            freq.put(number, freq.getOrDefault(number, 0) + 1);
        });
        System.out.println(freq);
    }

    private Integer incNumber(Integer key, Integer value) {
        return value + 1;
    }

}
