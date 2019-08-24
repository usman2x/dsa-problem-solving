package com.usman.dsa.random;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DistinctCount {

    public static void main(String[] args) {
        int[] numbers = {3, 4, -4, 3, 4, 1};
        DistinctCount distinctCount = new DistinctCount();
        distinctCount.countUsingJava8(numbers);
        distinctCount.countUsingSet(numbers);
    }

    private void countUsingSet(int[] numbers) {
        long distCount = IntStream.of(numbers).map(Math::abs).boxed().collect(Collectors.toSet()).size();
        System.out.printf("Distinct count using set = %d \n", distCount);
    }

    private void countUsingJava8(int[] numbers) {
        long distCount = IntStream.of(numbers).map(Math::abs).distinct().count();
        System.out.printf("Distinct count using java8 = %d \n", distCount);
    }
}
