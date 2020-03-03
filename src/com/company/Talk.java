package com.company;

public class Talk extends Action {
    protected String _sentence;

    Talk(String st) {
        _sentence = st;
    }

    @Override
    public boolean execute() {
        talk();
        return false;
    }

    protected void talk() {
        System.out.println(_sentence);
    }
}
