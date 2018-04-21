package me.apoorvaagupta;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Scanner;

@Component("consoleReader")
public class ConsoleReader<T> implements Reader<T> {

    @Override
    public <T> ArrayList<T> input(int type) {
        Scanner scn = new Scanner(System.in);
        ArrayList input;
        char ch = 'y';

        if (type == 1) {
            input = new ArrayList<Integer>();
        } else {
            input = new ArrayList<String>();
        }

        while (ch == 'y') {

            if (type == 1) {
                input.add(scn.nextInt());
            } else {
                input.add(scn.next());
            }

            System.out.println("Do you want to take another input? Press 'y' for yes and 'n' for no.");
            ch = scn.next().charAt(0);

        }

        return input;

    }
}
