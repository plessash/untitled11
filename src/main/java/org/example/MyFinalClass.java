package org.example;

import java.util.Objects;

public final class MyFinalClass {

    private final Student student;

    public MyFinalClass(Student student) {
        this.student = Objects.requireNonNull(student).clone();
    }

    public Student getStudent() {
        return student.clone();
    }

    private static class Student implements Cloneable {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public Student clone() {
            try {
                return (Student) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError("Clone is not supported", e);
            }
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
