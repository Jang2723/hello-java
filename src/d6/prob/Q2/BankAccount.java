package d6.prob.Q2;
/*
Q2
은행계좌 클래스 BankAccount를 만들고,
적금계좌 클래스 SavingsAccount를 만들어보자.

BankAccount 클래스는 현재 잔고, 비밀번호에 대한 정보를 가지고 있다.
BankAccount 클래스는 돈을 입금, 출금할 수 있다.
출금할때는 출금액과 비밀번호를 함께 제공해야 한다.
SavingsAccount 클래스는 몇번째 입금 회차인지에 대한 정보, 만기 회차 정보, 매 회차 입금액에 대한 정보를 가지고 있다.
SavingsAccount 클래스는 돈을 입금, 출금할 수 있다.
입금할때는 회차 입금액과 동일한 금액이 입금되어야 한다.
출금은 입금 회차가 만기 회차 보다 더 클때만 가능하다.
출금할때는 출금액과 비밀번호를 함께 제공해야 한다.
*/
public class BankAccount {
    private int balance; // 잔고
    private String password; // 비밀번호

    public BankAccount(String password){
        this.balance = 0;
        this.password =password;
    }

    public int getBalance(){ // 잔고 얼마인지 알아내기
        return balance;
    }
    // 비밀번호 확인
    public boolean checkPassword(String password){
        return this.password.equals(password);
    }
    // 입금
    public boolean deposit(int amoount){
        this.balance += amoount;
        return true;
    }

    // 출금
    public boolean withdraw(int amount, String password){
        if(!this.checkPassword(password) || this.balance < amount){
            // 비밀번호가 맞지 않거나 || 잔고가 출금액보다 작을 때
            return false;
        }
        this.balance -= amount;
        return true;
    }

}
