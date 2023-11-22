package d3prob;

import java.util.Scanner;

/*축구리그에서는 승점을, 승리시 3점 무승부시 1점, 패배시 0점을 획득한다.
남은 경기와 현재 승점과 목표 승점이 주어졌을 때,
남은 경기에서 목표 승점을 넘을 수 있으면 필요한 최소 승수를
없으면 최고 승점을 출력하여라.*/
/* ex)
1. 목표 승점을 넘을 수 있음
    2 3 5 -> 최소 승수 0 무승부 2로 이김
2. 목표 승점을 넘을 수 없음
    2 3 15 -> 최고 승점
*/
public class H2con {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int remainGame = scanner.nextInt();     // 남은 경기 수
        int currentPoint = scanner.nextInt();   // 현재 승점
        int goalPoint = scanner.nextInt();      // 목표 승점

        int needPoint = goalPoint - currentPoint; // 승리하기 위해 남은 포인트
        // 15 - 2 = 13
        if (needPoint > remainGame *3) {
            // 목표 승점을 넘을 수 없음  + 최고 승점 출력
            System.out.println("최고 승점 : " + (currentPoint + remainGame * 3)); // 현재 점수 + 남은 게임수 * 승리3점
        }
        else{
            // 목표 승점을 넘을 수 있음
            // 최소 승수 구하기 =  남은 포인트 / 승리 3점 = 승리 횟수 * 3점 + 나머지
            int minimumWin = needPoint / 3;
            System.out.println("최소 승수 : " + minimumWin);
        }
    }
}
