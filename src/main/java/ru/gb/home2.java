package ru.gb;

import java.util.InputMismatchException;
import java.util.Scanner;

public class home2 {

    public static void main(String[] args) {
        new home2().ex3();
    }

    public float getVal(){
        Scanner scanner = new Scanner(System.in);
        Float val = 0f;
        boolean isFloat = false;
         try{
               System.out.print("Print float value: ");
               val = scanner.nextFloat();
               System.out.println("---------------------------------");
               isFloat = true;
           }catch (InputMismatchException e){
               System.out.println("Error : ->  " + e.getMessage());
               getVal();

           }
           if(isFloat) return val;
       return val;
    }

    public void ex2(){
        try {
            int d = 0;
            int[] intArray = new int[8];
            double catchedRes1 = 0f;
            for (int i = 0; i < intArray.length; i++) {
                catchedRes1 += intArray[i] / d;
            }
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

    public void ex3(){

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        try{
            if(str.isBlank()){
               throw  new Exception();
            }

        }catch (Exception e){
            System.out.println("print not empty string -> " + e.getMessage());
        }


    }

}
