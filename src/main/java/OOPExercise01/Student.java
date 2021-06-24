package OOPExercise01;

public class Student {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String birthday;
    private final String className;
    private final String address;

    public Student(int id, String firstName, String lastName, String birthday, String className, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.className = className;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getClassName() {
        return className;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder {
        private int id;
        private String firstName;
        private String lastName;
        private String birthday;
        private String className;
        private String address;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder setClassName(String className) {
            this.className = className;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(id, firstName, lastName, birthday, className, address);
        }
    }

    @Override
    public String toString() {
        return id + "" + firstName + "" + lastName + "" + birthday + "" + className + "" + address;
    }
}


