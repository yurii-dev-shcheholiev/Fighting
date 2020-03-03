package com.company;

public class Main {

    public static void main(String[] args) {
        Action action;
        Talk talk = new Insult("You peace of shit!");
        action = talk;
        action.execute();
    }
}
