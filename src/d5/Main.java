package d5;

public class Main {
    /*
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextInt();
//        scanner.nextLine();
        Car myCar = new Car();
        Car.count += 1;
        myCar.brand = "Kia";
        myCar.name = "K5";
        myCar.fuel = 72;
        myCar.beap();
        myCar.printInfo();
        myCar.drive(10);
        // 1.
        System.out.println(Car.count);

        Car car = new Car();
        Car.count += 1;
        car.brand = "Hyundai";
        car.name = "Sonata";
        car.fuel = 80;
        car.printInfo();
        // 2.
        System.out.println(Car.count);

        Car someCar  = new Car();
        Car.count += 1;
        someCar.name = "K3";
        someCar.brand = "Kia";
        someCar.fuel = 60;
        someCar.printInfo();

        // ???????
        someCar.brand = "Mercedes-Benz";
        someCar.name = "E-Class";
        someCar.printInfo();



        Person me = new Person();
        me.name = "Subin Jang";
        me.age = 26;
        System.out.println(me.name);
        System.out.println(me.age);
        me.sayHello();
    }*/

    public static void main(String[] args) {
        Car someCar = new Car("K5","Kia",72);
//        someCar.name = "K5"; //private String name으로 선언되면 .으로 가져오려고 하는 것 자체가 오류
//        someCar.brand = "Kia";
////        someCar.fuel = 72;
        System.out.println(someCar.getBrand());
        someCar.printInfo();
        someCar.setFuel(100);
        someCar.printInfo();

        Car sonata = new Car();
        sonata.printInfo();
        System.out.println("total cars: " + Car.getCount());

        Person me = new Person("Subin Jang");
        for (int i = 0; i < 25; i++) {
            me.age();
        }
        System.out.println(me.getAge());
        me.sayHello();

//
//        // ????
//        someCar.name = "E-Class";
//        someCar.brand = "Mercedes-Benz";
//        someCar.printInfo();
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a); // 10
        System.out.println(b); // 20
        
        refuel(someCar);
        System.out.println(someCar.getFuel()); //150000
    }

    public static void refuel(Car car){
        car.setFuel(150000);
    }
    public static void swap(int a,int b){
        int tmp = a;
        a = b;
        b = tmp;
    }
}
