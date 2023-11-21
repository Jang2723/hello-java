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
        System.out.println(result);
        //괄호가 최우선
        result = (10 + 5) * 3;
        System.out.println(result);

        // %의 우선순위는?
        result = (10 + 5 % 3) /3 + 2 * 3;
        System.out.println(result);

    }
}
