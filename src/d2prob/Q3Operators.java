package d2prob;


/*
Scanner 이외의 변수를 한개만 선언하여
정수를 총 5개 입력받아,
첫번째 입력된 숫자에, 이후에 입력된 숫자를 순서대로
더하고 빼고 곱하고 몫을 구하여 출력하라.
*/

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Q3Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* 조건의 허를 지르는 점(배열)
        int[] nums = new int[5];
        nums[0] = scanner.nextInt();
        nums[1] = scanner.nextInt();
        nums[2] = scanner.nextInt();
        nums[3] = scanner.nextInt();
        nums[4] = scanner.nextInt();

        int result;
        result = nums[0] + nums[1];
        System.out.println(result);
        result -= nums[2];
        System.out.println(result);
        result *= nums[3];
        System.out.println(result);
        result /= nums[4];
        System.out.println(result);*/
        int num = scanner.nextInt();
        num += scanner.nextInt();
        num -= scanner.nextInt();
        num *= scanner.nextInt();
        num /= scanner.nextInt();
        System.out.println(num);
    }
}
