package d6.people;

import d6.people.Lecturer;
import d6.people.Person;
import d6.people.Student;

import java.util.Arrays;

public class PersonMain {
    public static void main(String[] args) {
        Person alex = new Student("Alex",20,"CSE");
        Person brad = new Student("Brad", 21,"CSE");
        Person chad = new Lecturer("Chad", 50,"OOP");
        Person dave = new Student("Dave",25,"CSE");
        Person eric = new Student("Eric",23,"CSE");


        alex.sayHello();
        brad.sayHello();
        chad.sayHello();

        Person[] people = {alex,brad,chad};
        for (Person person: people) {
            person.sayHello();
        }

        // 추상클래스는 인스턴스 화 할 수 없다.
        // Person noName = new Person();

        people = new Person[] {alex,brad,chad,dave,eric};
        // 배열을 정렬하는 메서드
        Arrays.sort(people); // 나이순 정렬
        for (Person person: people) {
            person.sayHello();
        }
    }
}
