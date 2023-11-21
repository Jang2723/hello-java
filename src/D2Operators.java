public class D2Operators {
    public static void main(String[] args) {
        int plus = 10+20;
        int minus = 20-10;
        int multiply = 20*10;
        int divide = 20/10;
        int modulo = 15%10;
        System.out.println(plus);       //30
        System.out.println(minus);      //10
        System.out.println(multiply);   //200
        System.out.println(divide);     //2
        System.out.println(modulo);     //5

        // 사칙연산의 우선순의
        int result = 10 + 5 * 3;
        System.out.println(result);     //25
        //괄호가 최우선
        result = (10 + 5) * 3;
        System.out.println(result);     //45
        // %의 우선순위는?
        result = (10 + 5 % 3) /3 + 2 * 3;
        System.out.println(result);     //10

        System.out.println(21/10);  //2

        // 1. 데이터를 받는 애를 int가 아니라 double로 해보자.
        double doubleDivede = 21 / 10;
        System.out.println(doubleDivede);   //2.0

        // 2. 나누기 전에 실수로 만들어 주자.
        // 피연산자 중 하나라도 double이라면 결과도 double
        doubleDivede = 21.0 / 10;
        System.out.println(doubleDivede);   //2.1

        // 피연산자 둘다 정수 변수면?
        // 형변환(Type Casting)
        int intResult = (int)2.1;

        System.out.println(intResult);

        // 선 변환을 통한 나누기 연산
        int left = 21;
        int right = 10;
        double castedResult = (double)left / right;
        System.out.println(castedResult);

        // 명시적 형변환 데이터 손실
        long bigInt = 4294967296L;
        System.out.println((int)bigInt);

        // char 형 변환
        int asciiA = 65;
        System.out.println((char) asciiA);
        System.out.println((char) (asciiA + 10 ));

        // String 덧셈
        // String Concatenation
        System.out.println("여기에 10을 입력하시오: " + 10);
        System.out.println(10 + " + " + 10 + " = " + 20);
        String formula = 10 + " + " + 10 + " = " + 20;
    }
}
