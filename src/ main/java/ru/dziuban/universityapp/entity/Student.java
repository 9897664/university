package ru.dziuban.universityapp.entity;

public class Student implements StudentAction {

    String name;
    int age;
    String post;

    @Override

    public void ask() {

        Student student = new Student();
        student.name = "Мария";
        student.age = 10;
        student.post = "ученик";
        System.out.println("Post: " + student.post + ", teacher name: " + student.name + ", age: " + student.age + ".");
        ask2();
    }

    private void ask2() {
        System.out.println("Student: " + "Когда можно исправть оценку за тест?");
    }
}


