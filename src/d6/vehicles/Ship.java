package d6.vehicles;

import d6.vehicles.Beeper;

public class Ship implements Beeper {
    @Override
    public void beep(){
        System.out.println("부아아아앙");
    }
}
