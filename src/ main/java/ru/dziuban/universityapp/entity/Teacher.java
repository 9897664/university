package ru.dziuban.universityapp.entity;

public class Teacher implements TeacherAction {

    @Override

    public void answer() {
        System.out.println("Teacher: " + "Завтра после 6 урока!");
    }
}
