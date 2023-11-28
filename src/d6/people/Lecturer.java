package d6.people;

// 이름, 주제, 인사
public class Lecturer extends Person {
    private String subject;
    public Lecturer(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public void sayHello(){
        System.out.println(String.format(
                "Hello, I'm %s, and today's subject is %s!",
                getName(), this.subject
        ));
    }

}
