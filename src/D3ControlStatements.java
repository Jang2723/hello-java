import java.util.Scanner;

public class D3ControlStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 나이를 입력받고, 나이가 20 미만일때 입장불가 출력
        int age = scanner.nextInt();
        if (age < 20) {
            System.out.println("입장불가");
            System.out.println(String.format("%d년 뒤에 오세요", 20 - age));
        }

        int multiple  = scanner.nextInt();
        // multiple이 2의 배수면, 2의 배수 출력
        if (multiple % 2 == 0){
            System.out.println("2의 배수");
        }
        // multiple이 5의 배수면, 5의 배수 출력
        if (multiple % 5 == 0){
            System.out.println("5의 배수");
        }
        // multiple이 10의 배수면, 10의 뱃 출력
        if (multiple % 10 == 0){
            System.out.println("10의 배수");
        }
        // 몇년인지 받는다.
        int year = scanner.nextInt();
        if ( year % 4 == 0){
            scanner.nextInt();
            String message = scanner.nextLine();
            if(year % 100 != 0){
                System.out.println("윤년이다.");
            }
            if(year % 400 == 0){
                System.out.println("윤년이다");
            }
        }

        // 2의 배수면 짝수 아니면 홀수
        int number = 5;
        if(number % 2 == 0){
            System.out.println("짝수");
        } else{
            System.out.println("홀수");
        }

        /*
        어떤 학생의 시험점수가 입력 되었을 때,
        80점을 넘으면 "Good Job"
        못넘으면 "Too Bad"
        */
        int score = scanner.nextInt();
        if (score > 80) {
            System.out.println("Good job");
        }else{
            System.out.println("Too Bad");
        }

        int result;
        int x = 10;
        int y = -2;
        if (x > 0){
            if(y > 0){
                result = 1;
            }else{
                result = 2;
            }
        }else{
            if(y > 0){
                result = 3;
            }else{
                result = 4;
            }
        }
        System.out.println(result);

        // 0 ~ 100
        score = scanner.nextInt();
        if(0 <= score && score <= 100){
            if (score > 80){
                System.out.println("Good Job");
            }else{
                System.out.println("Too Bad");
            }
        }else{
            System.out.println("잘못된 입력입니다.");
        }

        // 0 ~ 30 : 좋음
        // 31 ~ 80 : 보통
        // 81 ~ 150 : 나쁨
        // 151 ~ : 매우 나쁨
        int dust = 15;
        if (dust <= 30){
            System.out.println("좋음");
        } else if (dust <=80) { //dust > 30은 무조건 성립
            System.out.println("보통");
        } else if (dust <= 150) {
            System.out.println("나쁨");
        }else {
            System.out.println("매우 나쁨");
        }

        // 하나의 if라도 맞으면 나머지 조건은 확인 안한다.
        int zero = 0;
        if (zero == 0){
            System.out.println("is zero");
        }
        else if (10 % zero == 0){
            System.out.println("is factor");
        }
        else {
            System.out.println("not factor");
        }

        String input = scanner.nextLine();
        // (확인하고 싶은 값)
        switch (input){
            case "w":   // input == "w"
                System.out.println("up");
                break;
            case "a":   // input == "a"
                System.out.println("left");
                break;
            case "s":   // input == "s"
                System.out.println("down");
                break;
            case "d":   // input == "d"
                System.out.println("right");
                break;
            // 기본동작, 필수 아님
            default:
                System.out.println("invalid");
                break;
        }
        switch (input) {
            case "w" ->
                    System.out.println("up");
            case "a" ->
                    System.out.println("left");
            case "s" ->
                    System.out.println("down");
            case "d" ->
                    System.out.println("right");
        }
    }
}
