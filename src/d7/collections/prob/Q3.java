package d7.collections.prob;

/*
어떤 가게의 메뉴 <메뉴명> <가격>형태로 계속 입력된다.
"order"가 입력되었을 때,
사용자의 단일 주문을 받고 금액을 출력하시오.

예시 입출력
입력1:
Americano 1500 -> Scanner 사용, nextLine string.split(" ") 공백 구분
Cappuccino 2000                         // Integer.parseInt(1500)
Latte 2500
Mocha 3000
order 주문이 들어오면
Latte 사용자의 주문이 입력된다.

출력1:
2500
*/




import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
//        String americano = "americano 1500";
//        String[] menuLine = americano.split(" ");
//        System.out.println(Arrays.toString(menuLine));// [americano, 1500]

        Scanner scanner = new Scanner(System.in);
        // 메뉴 저장용 Map
        Map<String, Integer> menu = new HashMap<>();
        while(true){
            String line = scanner.nextLine();
            if("order".equals(line))
                break;
            // split을 쓰면
            // menuLine[0]애 메뉴명
            // menuLine[1]에 메뉴가격이 들어감 (문자열로 저장됨)
            String[] menuLine = line.split(" "); //여기부터 내가 작성 못했음
            // 이름과 가격을 분리한다.
//            String menuName = menuLine[0];
//            Integer menuPrice = Integer.parseInt(menuLine[1]);
            menu.put(menuLine[0],Integer.parseInt(menuLine[1]));
        }
        // 주문받을 준비
        String order = scanner.nextLine();
        System.out.println(menu.get(order));
    }
}
