package OOPExercise01;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class StudentControllerTest {
    StudentController studentController = new StudentController();
    Student student = new Student.Builder().setId(4).setFirstName("Nguyen").setLastName("A4").setClassName("a4").build();

    @Test
    public void test_add() {
        studentController.add(student);

        assertNotNull(studentController.getById(4));
    }

    @Test
    public void test_delete() {
        studentController.delete(4);
        assertNull(studentController.getById(4));
    }

    @Test
    public void test_saveToFile() throws IOException {
        studentController.saveToFile("/home/ntnghia0320/Documents/");
    }

    @Test
    public void test_loadFromFile() throws FileNotFoundException {
        studentController.loadFromFile("/home/ntnghia0320/Documents/");
    }

    @Test
    public void test_getAll() {
        List<Student> students = studentController.getAll();
    }

    @Test
    public void test_getById() {
        assertNull(studentController.getById(999));
        assertNotNull(studentController.getById(2));
    }

    @Test
    public void test_findByName() {
        List<Student> students = studentController.findByName("NguyenA1");
    }

    @Test
    public void test_findByClassName() {
        List<Student> students = studentController.findByClassName("a3");
    }
}