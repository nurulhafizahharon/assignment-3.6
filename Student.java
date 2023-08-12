public class Student extends Person {
    private int yrLevel;

    // CONTRUCTORS
    public Student() {
    }

    public Student(String name, int age, String gender, int yrLevel) {
        super(name, age, gender);
        this.yrLevel = yrLevel;
    }

    // METHOD
    @Override
    public void introduce() {
        System.out.println("Hello, my name is " + this.name + " and I am a " + this.yrLevel + " year student.");
    }

    // GETTER & SETTER
    public int getYrLevel() {
        return yrLevel;
    }

    public void setYrLevel(int yrLevel) {
        this.yrLevel = yrLevel;
    }

}
