package me.apoorvaagupta;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class ProcessorHandler<T> {

    @Resource
    private Processor<T> additionProcessor;

    @Resource
    private Processor<T> reversalProcessor;


    public<T> T process(int option , T ... v) {
        switch (option) {
            case 1:
                return (T)(this.additionProcessor.process(v));
            case 2:
                return (T)(this.reversalProcessor.process(v));
            default:
                return (T)(this.additionProcessor.process(v));

        }
    }
}
