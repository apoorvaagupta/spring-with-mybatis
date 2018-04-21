package me.apoorvaagupta;

import java.util.ArrayList;

public interface Processor<T> {

    public <T> T process(ArrayList<T> v);
}
