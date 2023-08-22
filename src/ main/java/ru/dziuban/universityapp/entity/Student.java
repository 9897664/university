package ru.dziuban.universityapp.entity;

public class Student implements StudentAction {

    @Override

    public void ask() {
        System.out.println("Student: " + "Когда можно исправть оценку за тест?");
    }
}


