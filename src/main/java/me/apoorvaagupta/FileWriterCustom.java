package me.apoorvaagupta;

import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Component("fileWriterCustom")
public class FileWriterCustom<T> implements Writer<T> {

    @Override
    public void output(T... v) throws IOException {
        String fileName = "/Users/apoorvaagupta/Work/Development/intern-prep/springwithmybatis/src/main/java/me/apoorvaagupta/samplefile.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (T i : v)
            writer.write(i.toString());
        writer.close();
    }


}
