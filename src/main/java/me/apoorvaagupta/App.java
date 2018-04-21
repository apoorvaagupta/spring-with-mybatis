package me.apoorvaagupta;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

@Configuration
@ComponentScan("me.apoorvaagupta")
@MapperScan("me.apoorvaagupta")
public class App 
{
    public static void main( String[] args ) throws IOException {

        Scanner scn = new Scanner(System.in);

        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

        InputHandler ih = context.getBean(InputHandler.class);
        OutputHandler oh = context.getBean(OutputHandler.class);
        ProcessorHandler ph = context.getBean(ProcessorHandler.class);

        System.out.println("What do you want to work with: 1. Integers\t2. Strings");
        int type = scn.nextInt();

        System.out.println("How do you want to take input: 1. Console\t2. File\t 3. Database");
        int optionInput = scn.nextInt();

        System.out.println("What process do you want to perform: 1. Addition\t2. Reversal");
        int optionProcess = scn.nextInt();

        System.out.println("How do you want to get output: 1. Console\t2. File\t 3. Database");
        int optionOutput = scn.nextInt();

        oh.writeOutput(optionOutput,ph.process(optionProcess, ih.takeInput(optionInput, type)));

    }
}
