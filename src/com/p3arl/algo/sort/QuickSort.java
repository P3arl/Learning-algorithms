package com.p3arl.algo.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = {9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0};
        quickSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void quickSort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    private static void quickSort(int[] a, int start, int end) {
        if (start < end) {
            int q = partition(a, start, end); // index of correctly positioned value in array.
            quickSort(a, start, q - 1); // sort left half
            quickSort(a, q + 1, end); // sort right half
        }
    }

    private static int partition(int[] a, int start, int end) {
        int pivot = a[end];
        int j = start;
        // in the first iteration, i starts from -1
        int i = j - 1;

        while (j < end) {
            if (a[j] <= pivot) {
                i++;
                swap(a, i, j);
            }
            j++;
        }
        // put pivot value in correct place.
        swap(a, i + 1, end);
        return i + 1;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
