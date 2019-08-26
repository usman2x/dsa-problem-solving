package com.usman.dsa.array.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {0, 4, 12, 7, 3, 6, 4, -1, -2};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int anArr : arr) {
            System.out.println(anArr);
        }
    }

    /**
     * Compare adjacent array elements and swap if elemnts are not in sorting order
     *
     * @param arr given array of size N
     */
    private void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
