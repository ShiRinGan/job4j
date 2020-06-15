package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setUser("Lobin Filipp Dmitrievich");
        student.setGroup("programming group");
        student.setAdmission(new Date());

        System.out.println(student.getUser() + " entered to - " + student.getGroup());
    }

}
