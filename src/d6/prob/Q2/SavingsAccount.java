package d6.prob.Q2;
/*SavingsAccount 클래스는 몇번째 입금 회차인지에 대한 정보, 만기 회차 정보, 매 회차 입금액에 대한 정보를 가지고 있다.
SavingsAccount 클래스는 돈을 입금, 출금할 수 있다.
입금할때는 회차 입금액과 동일한 금액이 입금되어야 한다.
출금은 입금 회차가 만기 회차 보다 더 클때만 가능하다.
출금할때는 출금액과 비밀번호를 함께 제공해야 한다.*/
public class SavingsAccount extends BankAccount{ // 적금계좌
    private int round; // 회차 정보
    private int targetRound; // 만기 회차 정보
    private int depositAmount; // 예금 입금액

    public SavingsAccount(String password){
        super(password);
    }

    @Override
    public boolean deposit(int amount){
        if(amount != depositAmount)
            return false;
        this.round++;
        return super.deposit(amount);
    }

    @Override
    public boolean withdraw(int amount, String password){
        if(this.round < this.targetRound) //입금회차가 만기회차 보다 낮으면 출금불가
            return false;
        return super.withdraw(amount, password);
    }
}
