package com.p3arl.algo.recursion;

public class App {

    public static void main(String[] args) {
        //reduceByOne(10);
        int[] a = {2,3,1,45,13,76,0,4};
        System.out.println(recursiveLinearSearch(a, 0, 3));
    }

    public static void reduceByOne(int n) {
        if(n >= 0)
            reduceByOne(n-1);

        System.out.println("Completed call: " + n);
    }

    public static int recursiveLinearSearch(int[] a, int i, int x) {
        if(i > a.length - 1) {
             return -1;
        } else if(a[i] == x) {
            return i;
        } else {
            System.out.println("index at: " + i);
            return recursiveLinearSearch(a, i+1, x);
        }
    }
}
