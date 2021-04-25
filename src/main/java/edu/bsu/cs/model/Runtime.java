package edu.bsu.cs.model;

public interface Runtime { // is this the idea of how I am suppose to set up interfaces?
    int date(int day,
             int month,
             int year);

    int time(int hours,
             int minutes,
             int seconds);
}
