package ru.dziuban.universityapp.entity;

public class University implements Class {

    @Override

    public void lesson() {
        System.out.println("*Учитель и ученики зашли в класс*");
    }
}
