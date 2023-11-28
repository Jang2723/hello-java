package d6.vehicles;

import d6.vehicles.Car;

// 가장 먼저 자동차의 모든 기능을 가지게 만들자.
public class Truck extends Car {
    // 짐을 실을 수 있는 한도
    private final int maxLoad;
    // 현재 실린 짐
    private int load;

    public Truck(int maxLoad){
        super(100); //부모의 기능
        this.maxLoad = maxLoad;
        this.load = 0;
    }

    @Override
    public void drive(int kilos){
        System.out.println("drive truck");
        // setFuel(getFuel() -1); private fuel일 때
        this.fuel -= load /(maxLoad /10); // protected fuel일 때
        super.drive(kilos);
    }

    // 짐을 인자로 받아, 추가 했을 때 총 짐이 maxLoad 이하면 추가하고
    // 아니면 추가하지 않은 다음
    // 추가 성공 여부를 boolean으로 반환하는 메서드
    public boolean addLoad(int addLoad){
        if (this.load + addLoad <= this.maxLoad){
            this.load += addLoad;
            return true;
        }
        else{
            return false;
        }
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public int getLoad() {
        return load;
    }
}
