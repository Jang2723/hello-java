package d6.vehicles;

import d6.vehicles.Car;
import d6.vehicles.Truck;

public class Main {
    public static void main(String[] args) {
//        Car sonata = new Car();
//        refuel(sonata);
//        System.out.println(sonata.getFuel());
//        sonata.drive(100);
//        sonata.beep();
//
//        Truck porter = new Truck(100);
//        refuel(porter);
//        System.out.println(porter.getFuel());
//        porter.drive(100);
//        porter.beep();
//        porter.addLoad(30);
//        System.out.println(String.format(
//                "max load: %d, current load: %d",
//                porter.getMaxLoad(), porter.getLoad())
//        );
//
//        Car bongo = new Truck(100);
//        ((Truck)bongo).addLoad(10); // 문제 발생 bongo는 지금 Car로 만들어서, 형변환을 해주면 오류 안남
//        //((Truck)sonata).addLoad(20); // 오류 발생
//        if(isTruck(sonata))
//            ((Truck)sonata).addLoad(10);
//        else System.out.println("is not truck");

//        porter.drive(30);
//
//        refuel(bongo);
//        bongo.drive(100); //drive truck 출력됨
// 단순상속
/*        Car sonata = new Car(100);
//        Truck porter = new Truck(100);
//        Car bongo = new Truck(100);
//        refuel(porter);
//        refuel(bongo);
//        porter.addLoad(30);
//        if(bongo instanceof Truck)
//            ((Truck)bongo).addLoad(50);
//
//        sonata.drive(100);
//        porter.drive(100);
//        bongo.drive(100);*/
    }

    public static boolean isTruck(Car car){
        return car instanceof Truck;
    }
    public static void refuel(Car car){
        car.setFuel(100);
    }
}
