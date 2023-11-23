package d4prob;
import java.util.Scanner;
/*미세먼지 수치를 입력받고,
0 ~ 30 이면 "좋음"
31 ~ 80 이면 "보통"
80 ~ 150 이면 "나쁨"
151 ~ 이면 "매우 나쁨"
이라는 문자열을 반환하는 메서드를 작성하시오.*/
public class H1methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dust = scanner.nextInt();
        System.out.println(Weather(dust));
    }
    public static String Weather(int dust) {
        String str;
        if (dust <= 30) {
            str = "좋음";
            return str;
        } else if (dust <= 80) {
            str = "보통";
            return str;
        } else if (dust <= 150) {
            str = "나쁨";
            return str;
        } else {
            str = "매우 나쁨";
            return str;
        }
    }
}