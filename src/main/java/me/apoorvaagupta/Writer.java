package me.apoorvaagupta;

import java.io.IOException;
import java.util.ArrayList;

public interface Writer<T> {

    public void output(T... v) throws IOException;

}
