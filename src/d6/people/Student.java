package d6.people;

import d6.people.Person;

public class Student extends Person {
    private String major;

    public Student(String name, int age, String major){
        super(name, age);
        this.major = major;
    }

    public void sayHello(){
        System.out.println(String.format(
                "Hello, I'm %s, and studying %s!",
                getName(), this.major
        ));
    }
}
