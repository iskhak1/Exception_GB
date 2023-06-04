package ru.gb.lesson_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkSheet {
    private Scanner SCANNER;
    private List<String> list;

    public WorkSheet(){
        SCANNER = new Scanner(System.in);
        list = new ArrayList<>();
    }
    public void fillWorksheet()  {
        System.out.println("------------Fill worksheet--------------");
        System.out.print("FIO: ");
        String fio = SCANNER.nextLine();
        list.add(fio);
        checkFormat("fio",fio);
        System.out.print("BirthDate: [format  dd.mm.yyyy] ");
        String birthDate = SCANNER.nextLine();
        list.add(birthDate);
        checkFormat("birthDate",birthDate);
        System.out.print("Phone number: ");
        String number = SCANNER.nextLine();
        list.add(number);
        checkFormat("phoneNumber",number);
        System.out.print("Sex: ");
        String sex = SCANNER.nextLine();
        list.add(sex);
        checkFormat("sex",sex);
        try {
            if(check()) {
                FileController fileController = new FileController();
                String lastName = fio.split(" ")[0];
                fileController.toDataBase(lastName,fio,birthDate,number,sex);
            }
        } catch (Exception e) {
            System.err.print("ERROR -> ________ -> Fill all fields");
        }

    }
    private boolean check() throws Exception {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length()<0){
                throw new Exception();
            }
        }
        return true;
    }
    private void checkFormat(String name ,String values){
        switch (name){
            case "fio":
                if(values.split(" ").length<3)
                    System.err.println("bad fio format");
                break;
            case "birthDate":
                  String[] date = values.split("\\.");
                  if(
                          date.length<2 || Integer.parseInt(date[0])>31
                          || Integer.parseInt(date[1])>12 || Integer.parseInt(date[2])<1930
                     )
                      System.err.println("bad date format");
                  break;
            case "phoneNumber":
                if(values.split(" ").length>1 || values.split("-").length>1)
                    System.err.println("bad number format");
                break;
            case "sex":
                if(values.length()>1)
                    System.err.println("bad sex format");
                break;
        }
    }

}
