package com.p3arl.algo.sort;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = {9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0};
        mergeSort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

    private static void mergeSort(int[] a) {
        mergeSort(a, 0, a.length - 1);
    }

    private static void mergeSort(int[] a, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(a, start, mid); // sort left half
            mergeSort(a, mid + 1, end); // sort right half
            merge(a, start, mid, end); // merge sorted results into input array.
        }
    }

    private static void merge(int[] a, int start, int mid, int end) {
        int[] tempArray = new int[end - start + 1];
        // index counter for left array.
        int leftSlot = start;
        // index counter for right array.
        int rightSlot = mid + 1;
        // index for tempArray
        int k = 0;

        while (leftSlot <= mid && rightSlot <= end) {
            if (a[leftSlot] < a[rightSlot]) {
                tempArray[k] = a[leftSlot];
                leftSlot++;
            } else {
                tempArray[k] = a[rightSlot];
                rightSlot++;
            }
            k++;
        }
        // if leftSlot and rightSlot doesn't move to their endpoints, then push elements to tempArray.
        if (leftSlot <= mid) {
            while (leftSlot <= mid) {
                tempArray[k] = a[leftSlot];
                leftSlot++;
                k++;
            }
        } else if (rightSlot <= end) {
            while (rightSlot <= end) {
                tempArray[k] = a[rightSlot];
                rightSlot++;
                k++;
            }
        }

        // copy contents from tempArray to a[].
        for (int i = 0; i < tempArray.length; i++) {
            a[start + i] = tempArray[i];
        }
    }
}
