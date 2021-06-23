package OOPExercise01;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    List<Student> students = new ArrayList<Student>();

    public void addStudent() {
        StudentBuilder student = new StudentBuilder().setId(1);
        students.add(student.build());
        System.out.println(students.get(0).toString());
    }

    public void deleteStudent() {

    }

    public void saveToFile(String path) {

    }

    public void loadFromFile(String path) {

    }

    public Student getById(int id) {
        return null;
    }

    public Student[] findByName(String name) {
        return null;
    }

    public Student[] findByClassName(String className) {
        return null;
    }
    public static void main(String[] args) {
        StudentController st = new StudentController();
        st.addStudent();
    }
}


