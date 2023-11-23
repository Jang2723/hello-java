package d4prob;

import java.util.Scanner;

/*사칙연산을 나타내는 문자(char) (+, -, *, /) 하나와
두개의 정수를 입력받아, 각 기호에 대응하는 연산의 결과를
반환하는 메서드를 작성하시오.
단, 정수 범위에서만 결과를 반환합니다.*/
public class H3methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String op = scanner.next();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((Operation(op,a,b)));
    }
    public static int Operation(String op, int a,int b ){
        int cal =0;
        switch(op){
            case "+":
                cal = a + b;
                break;
            case "-":
                cal = a - b;
                break;
            case "*":
                cal = a * b;
                break;
            case "/":
                cal = a / b;
                break;
        }
        return cal;
    }
}
