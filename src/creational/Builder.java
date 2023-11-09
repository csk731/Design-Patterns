package creational;

class Student{
    int ID;
    String name;
    String mail;
    String phone;
    int gradYear;
    private Student(StudentBuilder builder){
        this.ID=builder.ID;
        this.name=builder.name;
        this.mail=builder.mail;
        this.phone=builder.phone;
        this.gradYear=builder.gradYear;
    }
    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    static class StudentBuilder{
        int ID;
        String name;
        String mail;
        String phone;
        int gradYear;

        public StudentBuilder setID(int ID) {
            // Validations
            this.ID = ID;
            return this;
        }

        public StudentBuilder setName(String name) {
            // Validations
            this.name = name;
            return this;
        }

        public StudentBuilder setMail(String mail) {
            // Validations
            this.mail = mail;
            return this;
        }

        public StudentBuilder setPhone(String phone) {
            // Validations
            this.phone = phone;
            return this;
        }
        public StudentBuilder setGradYear(int gradYear) {
            // Validations
            this.gradYear = gradYear;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
}

}
public class Builder {
    public static void main(String[] args) {
        Student stud =Student.getBuilder()
                            .setID(1)
                            .setGradYear(2024)
                            .setName("Chaitanya")
                            .build();

    }
}
