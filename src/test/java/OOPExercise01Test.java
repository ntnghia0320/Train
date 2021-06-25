import OOPExercise01.Student;
import OOPExercise01.StudentController;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OOPExercise01Test {
    StudentController studentController;
    Student studentToAdd;
    List<Student> studentsGetAllExpect;
    Student studentFoundByIdExpect;
    List<Student> studentsFoundByNameExpect;
    List<Student> studentsFoundByClassNameExpect;

    @BeforeEach
    void innit() {
        studentController = new StudentController();
        studentToAdd = new Student.Builder()
                .setId(1)
                .setFirstName("Nguyen")
                .setLastName("A1")
                .setBirthday("2000")
                .setClassName("class1")
                .setAddress("address1")
                .build();
        studentsGetAllExpect = new ArrayList<>(Collections.singletonList(studentToAdd));
        studentFoundByIdExpect = studentToAdd;
        studentsFoundByNameExpect = new ArrayList<>(Collections.singletonList(studentToAdd));
        studentsFoundByClassNameExpect = new ArrayList<>(Collections.singletonList(studentToAdd));
    }

    @Nested
    class TestStudentController {

        @AfterAll
        static void afterAll() throws IOException {
            Files.deleteIfExists(Path.of("./src/data.json"));
        }

        @BeforeEach
        void innit() {
            studentController.add(studentToAdd);
        }

        @Test
        void test_getALL() {
            assertEquals(studentsGetAllExpect, studentController.getAll());
        }

        @Test
        void test_delete() {
            studentController.delete(1);
            assertTrue(studentController.isStudentsEmpty());
        }

        @Test
        void test_getById() {
            assertNull(studentController.getById(999));
            assertEquals(studentFoundByIdExpect, studentController.getById(1));
        }

        @Test
        void test_findByName() {
            List<Student> studentsFoundByName = studentController.findByName("NguyenA1");
            assertEquals(studentsFoundByNameExpect, studentsFoundByName);

            studentsFoundByName = studentController.findByName("NgnA1");
            assertTrue(studentsFoundByName.isEmpty());
        }

        @Test
        void test_findByClassName() {
            List<Student> studentsFoundByClassName = studentController.findByClassName("class1");
            assertEquals(studentsFoundByClassNameExpect, studentsFoundByClassName);

            List<Student> studentsEmpty = studentController.findByClassName("class2");
            assertTrue(studentsEmpty.isEmpty());
        }

        @Test
        void test_saveToFile() throws IOException {
            studentController.saveToFile();
            assertTrue(Files.exists(Path.of("./src/data.json")));
        }

        @Nested
        class TestLoadFile {
            File tempFile;
            List<Student> studentsBeforeLoad;
            List<Student> studentsAfterLoad;

            @AfterAll
            static void afterEach() throws IOException {
                Files.deleteIfExists(Path.of("./src/temp_data.json"));
                Files.deleteIfExists(Path.of("./src/data.json"));
            }

            @BeforeEach
            void setUp() throws IOException {
                studentController.saveToFile();
                tempFile = new File("./src/temp_data.json");
                Files.copy(Path.of("./src/data.json"), Path.of("./src/temp_data.json"));
                studentsBeforeLoad = studentController.getAll();
            }

            @Test
            void test_loadFromFile() throws FileNotFoundException {
                studentController.loadFromFile();
                studentsAfterLoad = studentController.getAll();
                assertEquals(studentsBeforeLoad, studentsAfterLoad);
            }
        }
    }
}