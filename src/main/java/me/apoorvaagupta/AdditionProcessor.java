package me.apoorvaagupta;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component("additionProcessor")
public class AdditionProcessor<T> implements Processor<T> {

    public <T> T process(ArrayList<T> v) {

        T sum;

        if (v.get(0) instanceof String)
            sum = (T) "";
        else
            sum = (T) new Integer(0);

        for (T i : v) {
            if (v.get(0) instanceof Integer) {
                sum = (T) new Integer((Integer) sum + (Integer) i);
            } else {
                sum = (T) ((String) sum + (String) i);
            }
        }

        return sum;
    }
}