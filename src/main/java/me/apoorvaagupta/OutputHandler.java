package me.apoorvaagupta;

import org.springframework.stereotype.Component;

@Component
public class OutputHandler {

    private Writer<String> consoleWriter;
    private Writer<String> fileWriter;
    private Writer<String> databaseWriter;

    public<T> void writeOutput(int option, T var) {

        switch (option) {
            case 1:
                this.consoleWriter.output((String) var);
            case 2:
                this.fileWriter.output((String) var);
            case 3:
                this.databaseWriter .output((String) var);
            default:
                this.consoleWriter.output((String) var);

        }

    }
}
