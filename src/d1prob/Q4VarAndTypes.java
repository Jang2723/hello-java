package d1prob;

import java.util.Scanner;

public class Q4VarAndTypes {
    public static void main(String[] args) {
        //시간과 오전 오후를 입력받고,오전 XX시의 형식으로 출력하는 코드를 작성하시오
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        // nextInt() 다음에 nextLine()을 쓰면 nextInt에 있는 공백떄문에 원하는 대로 출력되지 않음
        String amPm = scanner.next();
        String timeTemplate = "%s %d시";
        System.out.println(String.format(timeTemplate,amPm,time));

    }
}
