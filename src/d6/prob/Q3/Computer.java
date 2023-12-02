package d6.prob.Q3;
//전원을 켰다 끌 수 있음을 나타내는 Switchable - boolean hitSwitch
//소리를 낼 수 있음을 나타내는 PlaySound - Sound
//영상을 보여줄 수 있음을 나타내는 Display - playMedia
//요리가 가능함을 나타내는 CookingUtensil - cook
public class Computer implements Switchable,PlaySound,Display{
    private boolean power;

    @Override
    public void playMedia(){
        System.out.println("Playing media File...");
    }

    @Override
    public void Sound(){
        System.out.println("Playing mp3 File...");
    }

    @Override
    public boolean hitSwitch(){
        this.power = !this.power;
        return this.power;
    }
}
