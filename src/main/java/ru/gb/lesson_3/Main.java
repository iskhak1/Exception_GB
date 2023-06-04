package ru.gb.lesson_3;

public class Main {

    public static void main(String[] args) {
        WorkSheet workSheet = new WorkSheet();
        try {
            workSheet.fillWorksheet();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
