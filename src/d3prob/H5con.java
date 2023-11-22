package d3prob;

import java.util.Scanner;

/*한 정수를 입력받는다.
이후 이 정수를 거듭제곱하며 1의 자리를 확인하면서,
몇번 거듭제곱 했을 때 다시 원래의 숫자의 1의 자리랑 일치하는지 출력하여라.*/
public class H5con {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int x = n;
        while(true){
            x *=n;
            count++;
            if ( n % 10 == x % 10) { // 1의 자리 같은지 확인
                System.out.println(count);
                break;
            }
        }

    }
}
