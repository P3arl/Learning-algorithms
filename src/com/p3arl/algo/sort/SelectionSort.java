package com.p3arl.algo.sort;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {9, 8, 3, 13, 87, 12, 99};
        final int[] sorted = selectionSort(a);
        for (int i : sorted) {
            System.out.println(i);
        }
    }

    private static int[] selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    min = j;
                }
            }
            swap(a, i, min);
        }
        return a;
    }

    private static void swap(int[] a, int i, int min) {
        int temp = a[i];
        a[i] = a[min];
        a[min] = temp;
    }
}
