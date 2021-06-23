package OOPExercise01;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String birthday;
    private String className;
    private String address;

    public Student(int id, String firstName, String lastName, String birthday, String className, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.className = className;
        this.address = address;
    }

    @Override
    public String toString() {
        return id + "" + firstName + "" + lastName + "" + birthday + "" + className + "" + address;
    }
}


