package ru.gb;

import java.util.Arrays;

public class Home1 {

    public void method1(int a , int b) throws ArithmeticException{
        int result = a/b;
    }
    public int method2(String value)throws NumberFormatException{
        return Integer.parseInt(value);
    }
    public void method3(int[] arr)throws ArrayIndexOutOfBoundsException{
        for (int i = 0; i < arr.length+1; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public int[] newArr(int[] arr1,int[] arr2){
        int[] newArr = new int[arr1.length];

        try{

            for (int i = 0; i < arr2.length; i++) {
                newArr[i] = arr1[i]-arr2[i];
            }
        }catch (Exception e){
            System.out.println("длины массивов не равны" + e.getMessage());
        }
        return newArr;
    }


}
