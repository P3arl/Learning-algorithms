package com.p3arl.algo.binarysearch;

public class App {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,7,12,18};
        //System.out.println(binarySearch(a, 20));
        System.out.println(recursiveBinarySearch(a, 0, 6, 99));
    }

    public static int binarySearch(int[] a, int x) {
        int p = 0;
        int r = a.length - 1;

        while (p <= r) {
            int q = (p + r)/2;

            if(x < a[q]) r = q-1;
            else if(x > a[q]) p = q+1;
            else return q;
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] a, int p, int r, int x) {
        System.out.println("[ " + p + "..." + r + " ]");
        if(p > r) {
            return -1;
        }
        int q = (p+r)/2;
        if(x < a[q]) {
            return recursiveBinarySearch(a, p, q-1, x);
        } else if(x > a[q]) {
            return recursiveBinarySearch(a, q+1, r, x);
        } else {
            return q;
        }
    }
}
