package me.apoorvaagupta;

import java.io.IOException;
import java.util.ArrayList;

public interface Reader<T> {

    public <T> ArrayList<T> input(int type) throws IOException;

}
