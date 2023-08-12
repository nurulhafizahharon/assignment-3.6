public class Person {

    protected String name;
    private int age;
    private String gender;

    // CONSTRUCTORS
    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // METHODS
    public void greet(String friendName) {
        System.out.println("Nice to meet you, " + friendName);
    }

    public void introduce() {
        System.out.println("Hello, my name is " + this.name);
    }

    public void haveBirthday() {
        age++;
        System.out.println("Happy " + this.age + "th Birthday " + this.name + "!");
    }

    // GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
