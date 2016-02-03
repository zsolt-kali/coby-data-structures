package com.example.obeserver;

/**
 * Created by kalizsolt on 02/02/16.
 */
public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
