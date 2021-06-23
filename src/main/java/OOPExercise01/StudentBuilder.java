package OOPExercise01;

public class StudentBuilder {
    private int id;
    private String firstName;
    private String lastName;
    private String birthday;
    private String className;
    private String address;

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public StudentBuilder setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public StudentBuilder setClassName(String className) {
        this.className = className;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Student build() {
        return new Student(id, firstName, lastName, birthday, className, address);
    }
}
