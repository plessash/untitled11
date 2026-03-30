package org.example.ex2;

import java.util.List;

public class Student {
    private String name;
    private List<Book> book;

    public Student() {
    }

    public Student(String name, List<Book> books) {
        this.name = name;
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return book;
    }

    public void setBooks(List<Book> books) {
        this.book = books;
    }

    @Override
    public String toString() {
        return name;
    }
}
