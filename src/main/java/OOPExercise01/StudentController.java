package OOPExercise01;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    private final List<Student> students = new ArrayList<>();

    public void add(Student student) {
        students.add(student);
    }

    public void delete(int id) {
        students.remove(getById(id));
    }

    public void saveToFile() throws IOException {
        String userDirectory = System.getProperty("user.dir");
        String json = new Gson().toJson(students);
        FileWriter myWriter = new FileWriter(userDirectory + "/src/data.json");
        myWriter.write(json);
        myWriter.close();
    }

    public void loadFromFile() throws FileNotFoundException {
        String userDirectory = System.getProperty("user.dir");
        File file = new File(userDirectory + "/src/data.json");
        Scanner scan = new Scanner(file).useDelimiter("\\Z");
        String json = scan.next();
        scan.close();
        List<Student> students = new Gson().fromJson(json, new TypeToken<List<Student>>() {
        }.getType());
        this.students.clear();
        this.students.addAll(students);
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

    public boolean isStudentsEmpty() {
        return students.isEmpty();
    }
}


