package d7.collections.prob;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
### H5

어떤 가게의 메뉴 `<메뉴명> <가격>`형태로 계속 입력되다가,
`"order"`가 입력되면 그 뒤에 주문이 `<메뉴명> <갯수>`형태로 입력되기 시작하며,
`"done"`가 입력되면 주문이 완료된다.
사용자의 주문을 받고 총액을 출력하시오.

예시 입출력:
입력1
```text
Americano 1500
Cappuccino 2000
Latte 2500
Mocha 3000
order
Latte 2
Americano 2
Cappuccino 1
done
```
출력1:
```text
10000
```
* */
public class H5 {
    public static void main(String[] args) {
        /*어떤 가게의 메뉴 `<메뉴명> <가격>`형태로 계속 입력되다가,
`"order"`가 입력되면 그 뒤에 주문이 `<메뉴명> <갯수>`형태로 입력되기 시작하며,
`"done"`가 입력되면 주문이 완료된다.
사용자의 주문을 받고 총액을 출력하시오.
*/
        Scanner scanner = new Scanner(System.in);
        // 메뉴 저장용 Map
        Map<String, Integer> menu = new HashMap<>();
        while (true) {
            String line = scanner.nextLine(); // 메뉴 명, 가격 입력
            if ("order".equals(line))
                break;
            String[] menuLine = line.split(" ");
            menu.put(menuLine[0], Integer.parseInt(menuLine[1])); // 메뉴명, 가격 저장
        }
        int sum = 0;
        while (true) {
            String order = scanner.nextLine(); // 주문 입력받기
            String[] orderCount = order.split(" "); //공백으로 분리 저장
//            String menuName = orderCount[0]; // 메뉴 이름
//            Integer menuCount = Integer.parseInt(orderCount[1]); // 메뉴 갯수
            if ("done".equals(order)) break;
//            sum += menu.get(menuName) * menuCount; // 메뉴 가격 * 갯수

            System.out.println();

        }
        System.out.println(sum);
    }
}
 // q3 참고해서 다시풀기