package com.kodilla.stream;

import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;

import java.io.InputStream;
import java.io.OutputStream;

public class StreamMain {
    public static void main(String[] args) {
//        System.out.println("Welcome to module 7 - Stream");
//
//        SaySomething saySomething = new SaySomething();
//        saySomething.say();

        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);
    }
}
