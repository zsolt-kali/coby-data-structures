package com.example.obeserver;

import javax.security.auth.*;
import java.util.*;

/**
 * Created by kalizsolt on 02/02/16.
 */
public class PostOffice implements Subject {
    private List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observerList) {
            o.update();
        }
    }
}
