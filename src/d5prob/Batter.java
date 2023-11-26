package d5prob;
/*### Q5

야구의 타자를 나타내는 `Batter` 클래스를 만들어보자.

1. 타석수, 안타수, 볼넷수, 루타수에 대한 정보를 가지고 있다.
   - 초기값은 다 0이며 설정이 불가하다.
2. 타자의 타격 결과를 상징하는 메서드들을 가지고 있다.
   - 안타를 나타내는 `hit` 메서드를 가지고 있다.
     - 몇루타인지를 나타내는 `bases` 인자를 받는다. (`1 <= bases <= 4`)
     - 타석수와 안타수가 1씩 증가한다.
     - 전달된 `bases` 인자만큼 루타수가 증가한다.
     - `bases` 인자가 범위를 벗어나면 아무것도 하지 않는다.
   - 아웃을 나타내는 `out` 메서드를 가지고 있다.
     - 타석수가 1 증가한다.
   - 볼넷을 나타내는 `walk` 메서드를 가지고 있다.
     - 타석수와 볼넷수가 1씩 증가한다.
3. 타자의 성적을 묘사하는 메서드들을 가지고 있다.
   - 타율을 반환하는 `batAvg()` 메서드를 가지고 있다. 타율은 `안타수 / (타석수 - 볼넷수)`로 계산한다.
   - 출루율을 반환하는 `onBasePer()` 메서드를 가지고 있다. 출루율은 `(안타수 + 볼넷수) / 타석수`로 계산한다.
   - 장타율을 반환하는 `slugPer()` 메서드를 가지고 있다. 장타율은 `루타수 / (타석수 - 볼넷수)`로 계산한다.
   - OPS를 반환하는 `ops()` 메서드를 가지고 있다. OPS는 `출루율 + 장타율`로 계산한다.
   - 모든 결과는 실수범위에서 계산한다.


* */
public class Batter {
    //1. 타석수, 안타수, 볼넷수, 루타수에 대한 정보를 가지고 있다.
    //   - 초기값은 다 0이며 설정이 불가하다.
    public static int batNum = 0; // 타석수
    public static int hits = 0; // 안타수
    public static int walk = 0; // 볼넷수
    public static int basesNum = 0; // 루타수

    /*2. 타자의 타격 결과를 상징하는 메서드들을 가지고 있다.
   - 안타를 나타내는 `hit` 메서드를 가지고 있다.
     - 몇루타인지를 나타내는 `bases` 인자를 받는다. (`1 <= bases <= 4`)
     - 타석수와 안타수가 1씩 증가한다.
     - 전달된 `bases` 인자만큼 루타수가 증가한다.
     - `bases` 인자가 범위를 벗어나면 아무것도 하지 않는다.???
   */

    public void hit(int bases){ // bases : 몇 루타인지
        // 안타를 나타내는 메서드
        batNum +=1;
        hits += 1;
        basesNum += bases;
    }
    // - 아웃을 나타내는 `out` 메서드를 가지고 있다.
    //     - 타석수가 1 증가한다.
    public void out(){
        batNum += 1;
    }
    //- 볼넷을 나타내는 `walk` 메서드를 가지고 있다.
    //     - 타석수와 볼넷수가 1씩 증가한다
    public void walk(){
        walk += 1;
        batNum += 1;
    }

    //3. 타자의 성적을 묘사하는 메서드들을 가지고 있다.
    //   - 타율을 반환하는 `batAvg()` 메서드를 가지고 있다. 타율은 `안타수 / (타석수 - 볼넷수)`로 계산한다.
    //   - 출루율을 반환하는 `onBasePer()` 메서드를 가지고 있다. 출루율은 `(안타수 + 볼넷수) / 타석수`로 계산한다.
    //   - 장타율을 반환하는 `slugPer()` 메서드를 가지고 있다. 장타율은 `루타수 / (타석수 - 볼넷수)`로 계산한다.
    //   - OPS를 반환하는 `ops()` 메서드를 가지고 있다. OPS는 `출루율 + 장타율`로 계산한다.
    //   - 모든 결과는 실수범위에서 계산한다.

    public double onBasePer;
    public double slugPer;

    public double batAvg(){ //타율 반환 메서드
        //타율은 `안타수 / (타석수 - 볼넷수)
        double batAvg = (double)hits / (batNum - walk);
        return batAvg;
    }
    public double onBasePer(){ // 출루율 반환 메서드
        onBasePer = (double) (hits + walk) / batNum;
        return onBasePer;
    }

    //   public static int batNum = 0; // 타석수
    //    public static int hits = 0; // 안타수
    //    public static int walk = 0; // 볼넷수
    //    public static int basesNum = 0; // 루타수
    public double slugPer(){ // 장타율 반환 메서드
        slugPer = (double) basesNum/(batNum - walk);
        return slugPer;
    }
    //    //   - OPS를 반환하는 `ops()` 메서드를 가지고 있다. OPS는 `출루율 + 장타율`로 계산한다.
    public double ops(){
        return onBasePer + slugPer;
    }
}

