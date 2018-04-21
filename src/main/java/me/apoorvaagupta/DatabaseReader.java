package me.apoorvaagupta;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;

@Component
public class DatabaseReader<T> implements Reader<T> {

    @Resource
    private InputMapper inputMapper;

    @Override
    public <T> ArrayList<T> input(int type) throws IOException {

        ArrayList inputs;
        if (type == 1) {
            Input i = inputMapper.selectInput(1);
            inputs = new ArrayList<Integer>();
            inputs.add(i.getInput1());
            inputs.add(i.getInput2());
            return inputs;
        } else {
            inputs = new ArrayList<String>();
            inputs.add("abc");
            inputs.add("def");
            return inputs;
        }

    }
}
