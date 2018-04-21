package me.apoorvaagupta;

import org.springframework.stereotype.Component;

@Component
public class InputHandler<T> {

    private Reader<T> consoleReader;
    private Reader<T> fileReader;
    private Reader<T> databaseReader;

    public <T> T takeInput(int option, int type) {

        switch (option) {
            case 1:
                return (T)(this.consoleReader.input(type));
            case 2:
                return (T)(this.fileReader.input(type));
            case 3:
                return (T)(this.databaseReader.input(type));
            default:
                return (T)(this.consoleReader.input(type));

        }

    }




}
