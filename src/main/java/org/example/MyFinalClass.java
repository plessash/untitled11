package org.example;

public final class MyFinalClass {

    private final Student student;

    public MyFinalClass(Student student) {
        this.student = new Student(student);
    }

    public Student getStudent() {
        return new Student(student);
    }

    private static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Student(Student other) {
            this.name = other.name;
            this.age = other.age;
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
