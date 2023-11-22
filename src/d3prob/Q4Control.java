package d3prob;

import java.util.Scanner;

// 정수 n이 입력된 뒤, n개의 이름이 개행을 기준으로 입력이 된다고 가정할 때,
// n개의 이름을 입력된 순서의 반대로 출력하여라.
public class Q4Control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] name = new String[n];

        for (int i = 0; i < n; i++) {
            name[i] = scanner.nextLine();
        }

        for (int i=0;  i<n ; i++) {
            System.out.println(name[n - 1 - i]);
        }
        // 0 ~ n + 1 까지 n개
        //제일 뒤에 있는 애는 n-1
    }
}
