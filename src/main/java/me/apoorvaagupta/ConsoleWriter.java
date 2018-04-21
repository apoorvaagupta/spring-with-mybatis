package me.apoorvaagupta;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component("consoleWriter")
public class ConsoleWriter<T> implements Writer<T> {

    @Override
    public void output(T... v) throws IOException {

        for (T i : v)
            System.out.println(i);
    }
}
