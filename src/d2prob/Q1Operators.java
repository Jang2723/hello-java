package d2prob;
import java.util.Scanner;

/*
세 과목의 시험점수(int)가 입력될 떄,
평균 점수(double)을 구하여라
*/
public class Q1Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] scores = new int[3];
        scores[0] = scanner.nextInt();
        scores[1] = scanner.nextInt();
        scores[2] = scanner.nextInt();
        // 나눗셈 직전에 피연산자 둘중 하나는 실수여야 한다.
        double averageScores = (double) (scores[0] + scores[1] + scores[2])/3.0;
        System.out.println("평균 점수 : " + averageScores);

    }
}
