package me.apoorvaagupta;

public class Input {

    private int id;
    private int input1;
    private int input2;

    public Input(int id, int input1, int input2) {

        this.id = id;

        this.input1 = input1;
        this.input2 = input2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInput1() {
        return input1;
    }

    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public int getInput2() {
        return input2;
    }

    public void setInput2(int input2) {
        this.input2 = input2;
    }
}
