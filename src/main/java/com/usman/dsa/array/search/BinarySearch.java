package com.usman.dsa.array.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 9, 10, 114, 115};//sorted array
        BinarySearch binarySearch = new BinarySearch();

        System.out.println(binarySearch.search(arr, 1) == 0);
        System.out.println(binarySearch.search(arr, 5) == 1);
        System.out.println(binarySearch.search(arr, 6) == 2);
        System.out.println(binarySearch.search(arr, 9) == 3);
        System.out.println(binarySearch.search(arr, 10) == 4);
        System.out.println(binarySearch.search(arr, 114) == 5);
        System.out.println(binarySearch.search(arr, 115) == 6);
        System.out.println(binarySearch.search(arr, 11) == -1);
        System.out.println(binarySearch.search(arr, 0) == -1);
    }

    private int search(int[] arr, int searchElement) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (searchElement == arr[middle]) {
                return middle;
            }
            if (searchElement < arr[middle]) {
                //search in first half
                end = middle - 1;
            } else {
                //search in second half
                start = middle + 1;
            }
        }
        return -1;
    }
}
