package d6.prob.Q4;
//자동차(Car)는 경적(horn)을 울리고,
//배(Ship)는 뱃고동(fogHorn)을 울리고,
//확성기(Megaphone)는 사이렌(siren)을 울린다.
public class Ship implements NoiseMaker{
    public void fogHorn(){
        System.out.println("뿌아아아아앙");
    }

    @Override
    public void makeNoise(){
        this.fogHorn();
    }
}
