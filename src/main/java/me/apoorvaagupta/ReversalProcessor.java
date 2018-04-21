package me.apoorvaagupta;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component("reversalProcessor")
public class ReversalProcessor<T> implements Processor<T> {

    public <T> T process(ArrayList<T> v) {

        T output;

        if (v.get(0) instanceof String) {

            StringBuilder sb = new StringBuilder();
            sb.append(v.get(0));
            sb = sb.reverse();
            output = (T) sb.toString();
        } else {
            Integer reverse = 0, n = (Integer) v.get(0);
            while (n != 0) {
                reverse = reverse * 10;
                reverse = reverse + n % 10;
                n = n / 10;
            }
            output = (T) new Integer(reverse);
        }

        return output;
    }
}