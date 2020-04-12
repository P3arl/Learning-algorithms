package com.p3arl.algo.linearsearch;

public class App {

    public static void main(String[] args) {
        int[] a = {};
        linearSearch(a, 3);
    }

    public static int linearSearch(int[] a, int x) {
        //int result = -1;
        for(int i=0;i<a.length;i++) {
            if(a[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
