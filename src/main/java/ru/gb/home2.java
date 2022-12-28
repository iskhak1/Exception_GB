package ru.gb;

import java.util.InputMismatchException;
import java.util.Scanner;

public class home2 {

    public static void main(String[] args) {
        new home2().getVal();
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

}
