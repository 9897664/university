package ru.dziuban.universityapp._main;

import ru.dziuban.universityapp.entity.Student;
import ru.dziuban.universityapp.entity.Teacher;
import ru.dziuban.universityapp.entity.University;
import ru.dziuban.universityapp.service.UniversityDemonstratorService;

public class _Main {
    public static void main(String[] args) {

        Student student = new Student();
        Teacher teacher = new Teacher();
        University university = new University();
        UniversityDemonstratorService universityDemonstratorService = new UniversityDemonstratorService();

        UniversityDemonstratorService.makeStudy(university);
        UniversityDemonstratorService.makeStudent(student);
        UniversityDemonstratorService.makeTeacher(teacher);
    }
}
