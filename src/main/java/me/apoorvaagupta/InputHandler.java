package me.apoorvaagupta;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;

@Component
public class InputHandler<T> {

    @Resource
    private Reader<T> consoleReader;

    @Resource
    private Reader<T> fileReader;

    @Resource
    private Reader<T> databaseReader;

    public <T> ArrayList<T> takeInput(int option, int type) throws IOException {

        switch (option) {
            case 1:
                return this.consoleReader.input(type);
            case 2:
                return this.fileReader.input(type);
            case 3:
                return this.databaseReader.input(type);
            default:
                return this.consoleReader.input(type);

        }

    }




}
