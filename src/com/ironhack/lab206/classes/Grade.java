package com.ironhack.lab206.classes;

import java.util.Map;

public class Grade {

    public static Map<String, Student> gradeIncrease (Map<String, Student> studentMap){

        for(Student student : studentMap.values()) student.setGrade(student.getGrade()*1.1);

        return studentMap;
    }


}
