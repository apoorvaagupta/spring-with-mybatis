package me.apoorvaagupta;

import org.springframework.stereotype.Component;

@Component
public class InputHandler {

    private Reader<String> consoleReader;
    private Reader<String> fileReader;
    private Reader<String> databaseReader;

    public <T> T takeInput(int option) {

        switch (option) {
            case 1:
                return (T)(this.consoleReader.input());
            case 2:
                return (T)(this.fileReader.input());
            case 3:
                return (T)(this.databaseReader.input());
            default:
                return (T)(this.consoleReader.input());

        }

    }




}
