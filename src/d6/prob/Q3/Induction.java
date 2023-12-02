package d6.prob.Q3;
//전원을 켰다 끌 수 있음을 나타내는 Switchable - boolean hitSwitch
//소리를 낼 수 있음을 나타내는 PlaySound - Sound
//영상을 보여줄 수 있음을 나타내는 Display - playMedia
//요리가 가능함을 나타내는 CookingUtensil - cook
public class Induction implements Switchable,CookingUtensil{
    public boolean power;

    @Override
    public void cook(){
        System.out.println("Cooking Something...");
    }

    @Override
    public boolean hitSwitch(){
        this.power = !this.power;
        return this.power;
    }
}
