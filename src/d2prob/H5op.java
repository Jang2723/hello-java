package d2prob;
import java.util.Scanner;
/*
Scanner 이외의 변수를 한개만 선언하여
정수 A를 입력받아,
A^2, A^4, A^8의 1의 자리를 순서대로 한줄씩 출력하시오.
*/
public class H5op {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();                                        //2 일경우
        /*
        System.out.println(String.format("A^2의 1의 자리 : %1d",a*a%10 ));     //4
        System.out.println(String.format("A^4의 1의 자리 : %1d",a*a*a*a%10)); //6
        System.out.println(String.format("A^8의 1의 자리 : %1d",a*a*a*a*a*a*a*a%10)); //6
        */
        a *= a;
        a %= 10;
        System.out.println(a);
        a *= a;
        a %= 10;
        System.out.println(a);
        a *= a;
        a %= 10;
        System.out.println(a);

    }
}
