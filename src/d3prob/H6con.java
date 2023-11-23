package d3prob;
import java.util.Scanner;
/*1월 1일의 요일과 2월 29일의 유무가
            정수, 불린으로 주어진다.
이때 1월 1일의 요일은,
0 - 월요일, 1 - 화요일, 2 - 수요일, 3 - 목요일, 4 - 금요일, 5 - 토요일, 6 - 일요일
으로 입력된다.
각 달의 1일이 무슨 요일인지 1월부터 12월까지 순서대로 출력하는 코드를 작성하시오. */
public class H6con {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 요일 정수
        boolean exNoEx = scanner.nextBoolean(); // 29일 유무
        String[] week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31}; //각 달의 일수
        String thisWeek; //이번달 1일 요일
        System.out.println("1월 1일 "+ week[n]);
        // 저번달 요일 인덱스
        int monthIndex = n;


        if (!exNoEx) {
            // 28일까지 있을 때
            //((전달 일수 % 7) + 전달요일 인덱스 ) %7
            for (int i = 0; i < days.length-1; i++) {
                //2월부터
                thisWeek = week[(days[i]%7 + monthIndex) %7];
                System.out.println(String.format("%d월 1일 %s", i+2,thisWeek));
                monthIndex = (days[i]%7 + monthIndex );
            }
        }
        else{
            // 29일까지 있을 떄 //3월 계산에만 영향
            for (int i = 0; i < days.length-1; i++) {
                if (i == 1){
                    thisWeek = week[((days[i]+1)%7 +monthIndex) %7];
                    System.out.println(String.format("%d월 1일 %s", i+2,thisWeek));
                    monthIndex = ((days[i]+1)%7 + monthIndex );

                }else {
                    thisWeek = week[((days[i]) % 7 + monthIndex) % 7];
                    System.out.println(String.format("%d월 1일 %s", i + 2, thisWeek));
                    monthIndex = (days[i]%7 + monthIndex );
                }

                }
            }
        }
}
