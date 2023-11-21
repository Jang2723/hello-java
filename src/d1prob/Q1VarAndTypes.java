package d1prob;

import java.util.Scanner;

public class Q1VarAndTypes {
    public static void main(String[] args) {
        //사용자에게 입력을 받고, 동일한 내용을 세번 출력하는 코드
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        /*
        for(int i=0; i<3;i++) {
            System.out.println(str);
        }
         */
    }
}
