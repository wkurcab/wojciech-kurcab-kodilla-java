package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyWillThroeException(1.0, 1.5);
        } catch (Exception e) {
            System.out.println("It's problem! Error " + e);
        } finally {
            System.out.println("End");
        }
    }
}
