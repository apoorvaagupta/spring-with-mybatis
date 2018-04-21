package me.apoorvaagupta;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;

@Component
public class DatabaseWriter<T> implements Writer<T> {

    @Resource
    private OutputMapper outputMapper;

    @Override
    public void output(T... v) throws IOException {

        if (v[0] instanceof Integer)
            outputMapper.insertOutput(new Output(1, (Integer) v[0]));
        else
            for (T i : v)
                System.out.println(i);
    }
}
