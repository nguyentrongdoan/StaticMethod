package com.codegym;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        // Tao 1 object moi:
        Student s1 = new Student(111, "Bach");
        s1.display();
    }
}