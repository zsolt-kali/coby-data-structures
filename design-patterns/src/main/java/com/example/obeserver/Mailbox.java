package com.example.obeserver;

/**
 * Created by kalizsolt on 02/02/16.
 */
public class Mailbox implements Observer {
    private final String name;

    public Mailbox(String s) {
        this.name = s;
    }

    @Override
    public void update() {
        System.out.println(name + ": I got a new Mail!");
    }
}
