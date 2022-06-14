package com.ironhack.lab206.main;

import com.ironhack.lab206.classes.Student;

import java.util.HashMap;
import java.util.Map;

import static com.ironhack.lab206.classes.Grade.gradeIncrease;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Betty Rizzo", 55);
        Student s2 = new Student("Sandra Dee", 65);
        Student s3 = new Student("Danny Zuko", 99);

        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("Betty Rizzo", s1);
        studentMap.put("Sandra Dee", s2);
        studentMap.put("Danny Zuko", s3);

        gradeIncrease(studentMap);

        System.out.println(studentMap.values());

    }
}
