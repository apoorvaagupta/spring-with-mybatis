package me.apoorvaagupta;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;

@Component
public class OutputHandler<T> {

    @Resource
    private Writer<T> consoleWriter;

    @Resource
    private Writer<T> fileWriterCustom;

    @Resource
    private Writer<T> databaseWriter;

    public void writeOutput(int option, T ... v) throws IOException {

        switch (option) {
            case 1:
                this.consoleWriter.output(v);
                break;
            case 2:
                this.fileWriterCustom.output(v);
                break;
            case 3:
                this.databaseWriter.output(v);
                break;
            default:
                this.consoleWriter.output(v);

        }

    }
}
