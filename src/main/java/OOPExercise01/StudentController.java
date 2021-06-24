package OOPExercise01;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    private static final List<Student> students = new ArrayList<>(Arrays.asList(
            new Student.Builder().setId(1).setFirstName("Nguyen").setLastName("A1").
                    setBirthday("2000").setClassName("a1").setAddress("abc").build(),
            new Student.Builder().setId(2).setFirstName("Nguyen").setLastName("A2").setClassName("a2").
                    setBirthday("2000").setClassName("a2").setAddress("abc").build(),
            new Student.Builder().setId(3).setFirstName("Nguyen").setLastName("A3").setClassName("a3").
                    setBirthday("2000").setClassName("a3").setAddress("abc").build()
    ));

    public void add(Student student) {
        students.add(student);
    }

    public void delete(int id) {
        students.remove(getById(id));
    }

    public void saveToFile(String path) throws IOException {
        String json = new Gson().toJson(students);
        FileWriter myWriter = new FileWriter(path + "student.txt");
        myWriter.write(json);
        myWriter.close();
    }

    public void loadFromFile(String path) throws FileNotFoundException {
        File file = new File(path + "student.txt");
        Scanner scan = new Scanner(file);
        scan.useDelimiter("\\Z");
        String json = scan.next();
        List<Student> students = new Gson().fromJson(json, new TypeToken<List<Student>>() {
        }.getType());
        scan.close();

        StudentController.students.clear();
        StudentController.students.addAll(students);
    }

    public List<Student> getAll() {
        return students;
    }

    public Student getById(int id) {
        for (Student student : students) {
            if (student.getId() == id) return student;
        }

        return null;
    }

    public List<Student> findByName(String name) {
        List<Student> listStudentFoundByName = new ArrayList<>();

        for (Student student : students) {
            if ((student.getFirstName() + student.getLastName()).equals(name)) listStudentFoundByName.add(student);
        }

        return listStudentFoundByName;
    }

    public List<Student> findByClassName(String className) {
        List<Student> listStudentFoundByClassName = new ArrayList<>();

        for (Student student : students) {
            if (student.getClassName().equals(className)) listStudentFoundByClassName.add(student);
        }

        return listStudentFoundByClassName;
    }
}


