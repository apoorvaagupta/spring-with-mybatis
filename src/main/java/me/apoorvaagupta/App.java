package me.apoorvaagupta;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("me.apoorvaagupta")
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

        ProcessorHandler ph = context.getBean(ProcessorHandler.class);
        String s = ph.process(1, "abd","cde");
        System.out.println(s);

        String s1 = ph.process(2, "abcjehckje");
        System.out.println(s1);
    }
}
