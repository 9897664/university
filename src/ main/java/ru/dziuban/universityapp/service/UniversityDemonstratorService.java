package ru.dziuban.universityapp.service;

import ru.dziuban.universityapp.entity.Student;
import ru.dziuban.universityapp.entity.Teacher;
import ru.dziuban.universityapp.entity.University;

public class UniversityDemonstratorService {
    public static void makeStudy(University university){
        university.lesson();
    }
    public static void makeTeacher(Teacher teacher){
        teacher.answer();
    }
    public static void makeStudent(Student student){
        student.ask();
    }
}
