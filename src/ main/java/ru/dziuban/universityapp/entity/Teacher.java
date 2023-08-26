package ru.dziuban.universityapp.entity;

public class Teacher implements TeacherAction {

    String name;
    int age;
    String post;

    @Override

    public void answer() {

        Teacher teacher = new Teacher();
        teacher.name = "Анна Владимировна";
        teacher.age = 35;
        teacher.post = "учитель";
        System.out.println("Post: " + teacher.post + ", teacher name: " + teacher.name + ", age: " + teacher.age + ".");
        ans();

    }

    private void ans() {
        System.out.println("Teacher: " + "Завтра после 6 урока!");
    }
}
