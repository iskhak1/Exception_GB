package ru.gb;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Home1 h = new Home1();
//        h.method1(1,0);
//        h.method2("erer");
        int[] a = {5,5,5,4,5,6,7};
        int[] b = {1,2,3,4,5,6,7,4,4,4,4,4};
        int[] c = h.newArr(a, b);
//        h.method3(a);
        System.out.println(Arrays.toString(c));
    }
}