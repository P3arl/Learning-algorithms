package com.p3arl.algo.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {9, 8, 3, 13, 87, 12, 99};
        final int[] sorted = insertionSort(a);
        for (int i : sorted) {
            System.out.println(i);
        }
    }

    private static int[] insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int element = a[i]; // element contains the data we want to move to sorted area.
            int j = i-1; // j will always point to last position of sorted area.
            while (j >= 0 && a[j] > element) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = element;
        }
        return a;
    }
}
