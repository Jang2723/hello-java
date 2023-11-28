package d6.object;

public class Main {
    public static void main(String[] args) {
        // Person alex = new Person("Alex", 25);
        Person alex = new Student(
                "Alex",25,"CSE");
        Person brad = new Lecturer(
                "Brad", 40, "Generics");
        Person alex2 = new Student(
                "Alex", 25, "CSE");
        Person alex3 = new Lecturer(
                "Alex", 25, "Korean");

        int a = 0;
        // 수 많은 계산이 진행
        // 이후 int a가 얼마인지 확이하려면?
        System.out.println(a);
        // 그렇다면 alex에 어떤값이 있는지는
        // Getter를 쓰겠지만
        System.out.println(alex);
        System.out.println(brad);

        System.out.println(alex == alex2); // false
        System.out.println(alex.equals(alex2)); // true
        System.out.println(alex.equals(alex3)); // fasle -> person equals 2번 떄문에, 같은 클래스가 아니어서
        System.out.println(alex3.equals(alex));
//        printPerson(alex);
//        printPerson(brad);

        // null
        Person noName = new Student();
        System.out.println(noName.getAge());
        System.out.println(noName.getName());
        //System.out.println(noName.getName().equals("Alex"));
        System.out.println("Alex".equals(noName.getName()));
        if (noName.getName() != null)
            noName.getName().equals(alex.getName());
        try{
            System.out.println(noName.getName().equals("Alex"));
        }catch (NullPointerException e){
            System.out.println("name was null");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void printPerson(Person person){
        System.out.println(person);
    }

}
