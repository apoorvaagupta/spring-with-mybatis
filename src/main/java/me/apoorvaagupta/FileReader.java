package me.apoorvaagupta;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component("fileReader")
public class FileReader<T> implements Reader<T> {

    @Override
    public <T> ArrayList<T> input(int type) throws IOException {

        ArrayList fileInput;

        if (type == 1)
            fileInput = new ArrayList<Integer>();
        else
            fileInput = new ArrayList<String>();


        String filepath = "/Users/apoorvaagupta/Work/Development/intern-prep/springwithmybatis/src/main/java/me/apoorvaagupta/samplefile.txt";

        File file = new File(filepath);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()){
            if(type == 1)
                fileInput.add(new Integer(sc.nextLine()));
            else
                fileInput.add(sc.nextLine());
        }

        return fileInput;
    }
}
