public class Teacher extends Person {

    private String subject;

    // CONTRUCTORS
    public Teacher() {
    }

    public Teacher(String name, int age, String gender, String subject) {
        super(name, age, gender);
        this.subject = subject;
    }

    // METHOD
    @Override
    public void introduce() {
        System.out.println("Hello, my name is " + this.name + " and I will be teaching you " + this.subject);
    }

    // GETTER & SETTER
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
