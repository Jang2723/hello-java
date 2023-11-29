package d7.optional;

import java.util.Optional;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /* 에러가 될수도 안 될수도 있음...
        //System.out.println(nullOrString().length());
        String nullable = nullOrString();
        if (nullable == null) System.out.println("got : null");
        else System.out.println(nullable);

        Optional<String> optionalString = Optional.ofNullable(nullOrString());
        if (optionalString.isPresent()){
            System.out.println(optionalString.get());
        }else {
            System.out.println("got: null");
        }

        String result = Optional.ofNullable(nullOrString()).orElse("got: null");
        System.out.println(result);*/
        // 조건문을 통한 null 체크
        String result = nullOrString();
        if (result != null){
            System.out.println(result);
        } else {
            System.out.println("got : null");
        }

        // 어떤 메서드든 Optional.ofNullable() 메서드를 통해서
        // 결과를 반환하게 한다. // 정적 메서드를 통해 새로운 객체를 만드는것 : 정적 팩토리
        Optional<String> optionalResult = Optional.ofNullable(nullOrString());
        // isPresent : null이 아닌 값이 들어올때 true
        // isEmpty : null일때 true
        if (optionalResult.isPresent()){
            System.out.println(optionalResult.isPresent());
            System.out.println(optionalResult.isEmpty());
            System.out.println(optionalResult.get());
        } else{
            System.out.println(optionalResult.isPresent());
            System.out.println(optionalResult.isEmpty());
            System.out.println("got : null");
        }

        // 결과를 Optional로 받았으면, orElse를 통해
        // 결과가 null일때 기본값을 설정할 수 있다.
        String resultOrElse = Optional.ofNullable(nullOrString())
                // null이 아니면 그 값이,
                // null이면 인자로 전달한 값이
                .orElse("got : null from orElse");
        System.out.println(resultOrElse);

        // 메서드에서 직접 온 Optional을 다루자.
        String resultFromOptinal = nullOrOpt()
                .orElse("got : null from orElse method");
        System.out.println(resultFromOptinal);
    }

    public static Optional<String> nullOrOpt(){
        Random random = new Random();
        if (random.nextInt() % 2 == 0)
            // Optional.of 로 Optional을 만든다.
            return Optional.of("Concrete String");
        // null 결과는 Optional.empty()
        else return Optional.empty();
    }


    public static String nullOrString() {
        Random random = new Random();
        if (random.nextInt() % 2 == 0)
            return "not null string";
        else return null;
    }
}
