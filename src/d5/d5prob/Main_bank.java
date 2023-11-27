package d5.d5prob;

import java.util.Scanner;

public class Main_bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 계좌 생성
        BankAccount bank1 = new BankAccount();
        //계좌 수 카운드
        BankAccount.accountNum +=1;
        // 계좌 번호 입력
        System.out.println("계좌 번호 입력 : ");
        bank1.account = scanner.next();
        // 계좌 비밀 번호 입력
        System.out.println("비밀 번호 입력 : ");
        bank1.password = scanner.next();
        // 입금할 금액
        System.out.println("입금할 금액 입력 : ");
        bank1.deposit(scanner.nextInt());

        // 출금
        System.out.println("출금 -> 비밀 번호 입력, 출금액 입력 ");
        System.out.println("출금 : " + bank1.withdraw(scanner.next(), scanner.nextInt()));
        System.out.println("출금 후 잔액 : " + bank1.money);

        // 계좌 생성
        BankAccount bank2 = new BankAccount();
        //계좌 수 카운드
        BankAccount.accountNum +=1;
        // 계좌 번호 입력
        System.out.println("계좌 번호 입력 : ");
        bank2.account = scanner.next();
        // 계좌 비밀 번호 입력
        System.out.println("비밀 번호 입력 : ");
        bank2.password = scanner.next();
        // 입금할 금액
        System.out.println("입금할 금액 입력 : ");
        bank2.deposit(scanner.nextInt());

        // 출금 성공
        System.out.println("출금 -> 비밀 번호 입력, 출금액 입력 ");
        System.out.println("출금 : " + bank2.withdraw(scanner.next(), scanner.nextInt()));
        System.out.println("출금 후 잔액 : " + bank2.money);

        System.out.println();
        System.out.println();
        System.out.println();

        // 총 계좌 수
        System.out.println("총 계좌 수 : ");
        System.out.println(BankAccount.getAccountNum());

        // 전체 계좌 돈
        System.out.println("전체 계좌 잔고 총합 : ");
        System.out.println(BankAccount.getMoneyAll());




    }

}


