package org.example.ex2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;

public class Service {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static List<Student> readStudentsFromFile(String fileName) throws IOException {
        String json = Files.readString(Path.of(fileName));
        List<Student> students = OBJECT_MAPPER.readValue(json, new TypeReference<List<Student>>() {
        });
        return students;
    }

    public static void main(String[] args) throws IOException {
        List<Student> result = readStudentsFromFile("data.json");
        result.stream()
                .peek(System.out::println)
                .flatMap(student -> student.getBooks().stream())
                .peek(System.out::println)
                .sorted(Comparator.comparingInt(Book::getPages))
                .distinct()
                .filter(book->book.getYear()>2000)
                .limit(3)
                .map(Book::getYear)
                .findFirst()
                .ifPresentOrElse(
                        System.out::println,
                        ()-> System.out.println("Такая книга отсутствует"));
    }
}