import OOPExercise01.Student;
import OOPExercise01.StudentController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class OOPExercise01Test {
    StudentController studentController;

    Student student = new Student.Builder().setId(4).setFirstName("Nguyen").setLastName("A4").setClassName("a4").build();

    @Nested
    class WhenNew {
        @BeforeEach
        void innit() {
            studentController = new StudentController();
        }

        @Test
        void test_add() {

        }
    }
//    @Test
//    public void test_add() {
//        studentController.add(student);
//
//        assertNotNull(studentController.getById(4));
//    }
//
//    @Test
//    public void test_delete() {
//        studentController.delete(4);
//        assertNull(studentController.getById(4));
//    }
//
//    @Test
//    public void test_saveToFile() throws IOException {
//        studentController.saveToFile("/home/ntnghia0320/Documents/");
//    }
//
//    @Test
//    public void test_loadFromFile() throws FileNotFoundException {
//        studentController.loadFromFile("/home/ntnghia0320/Documents/");
//    }
//
//    @Test
//    public void test_getAll() {
//        List<Student> students = studentController.getAll();
//    }
//
//    @Test
//    public void test_getById() {
//        assertNull(studentController.getById(999));
//        assertNotNull(studentController.getById(2));
//    }
//
//    @Test
//    public void test_findByName() {
//        List<Student> students = studentController.findByName("NguyenA1");
//    }
//
//    @Test
//    public void test_findByClassName() {
//        List<Student> students = studentController.findByClassName("a3");
//    }
}