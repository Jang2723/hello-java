package d1prob;

import java.util.Scanner;

public class Q5VarAndTypes {
    public static void main(String[] args) {
         /* 사용자에게 3개의 0.0~4.5 사이의 실수를 입력받고
        그 뒤에 3개의 이름을 입력받은 뒤
        이름-<이름>,학점-<실수>의 형태로 3줄을 출력하는 프로그램을 작성
*/
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double [3];
        scores[0] = scanner.nextDouble();
        scores[1] = scanner.nextDouble();
        scores[2] = scanner.nextDouble();

        String[] names = new String[3];
        names[0] = scanner.next();
        names[1] = scanner.next();
        names[2] = scanner.next();

        String nameScores = "이름 - <%s>, 학점 - <%f>";
        System.out.println(String.format(nameScores,names[0],scores[0]));
        System.out.println(String.format(nameScores,names[1],scores[1]));
        System.out.println(String.format(nameScores,names[2],scores[2]));
    }
}
