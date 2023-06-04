package ru.gb.lesson_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileController {

    private File file;
    private FileWriter writer;

    public void toDataBase(String file_name,String ... info) throws IOException {
        file = new File(file_name);
        writer = new FileWriter(file_name,true);
            writer.write(pattern(info)+"\r\n");
            writer.write("-----------------------------------------------------"+"\r\n");
            writer.flush();
    }
    private String pattern(String ... values){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < values.length ; i++) {
            stringBuilder.append("<"+values[i]+">");
        }
        return stringBuilder.toString();
    }
}
