package com.codegym;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    // Tao 1 construction Student:
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    // tao phuong thuc static
    static void change() {
        college = "CODEGYM";
    }

    // method in display values:
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}



