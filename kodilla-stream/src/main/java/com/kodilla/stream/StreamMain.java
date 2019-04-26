package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Przykładowy tekst do upiększenia", text -> "ABC " + text + " ABC");
        poemBeautifier.beautify("Inny tekst poddany upiększaniu.", text -> toUpperCase(text));
        poemBeautifier.beautify("yuppi", text -> "@_### " + text + " ###_@");
        poemBeautifier.beautify("Przykładowy tekst do upiększenia", text -> "Mały tekst: " + toLowerCase(text) + " i duży tekst " + toUpperCase(text) + " koniec tekstów.");
        poemBeautifier.beautify("Inny tekst poddany Upiększaniu", text -> "& " + toLowerCase(text) + " &");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
