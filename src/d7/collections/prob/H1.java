package d7.collections.prob;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*### H1

엔터로 구분된 입력이 임의의 횟수만큼 이뤄진다.
`q`가 입력되면 모든 데이터가 입력된 것이라고 생각할 때,
여태까지 입력한 내용중 **정수**만을 선별하여,
`<첫번째 정수> + <두번째 정수> + <세번째 정수> = <총합>`
의 형태로 출력하시오.
힌트: `Integer.parseInt` 메서드는 정수로 표현 불가능한 문자열에 대해 `NumberFormatException`을 발생시킨다.

예시 입출력
입력1:
```text
1
2
3
4
q
```
출력1:
```text
1 + 2 + 3 + 4 = 10
```
---
입력2:
```text
1,
정수 아님
2
1.01
q
```
출력2:
```text
2 = 2
```*/
public class H1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();
        while(true){
            String input = scanner.nextLine();
            if("q".equals(input)) break; // 종료 조건
            try{
                inputList.add(Integer.parseInt(input));
            }// ignored 쓰면 catch문에 아무것도 안써도 무시함
            catch (NumberFormatException ignored){}
        }

        int sum = 0;
        for (int i = 0; i < inputList.size(); i++) {
            sum += inputList.get(i);
            System.out.print(inputList.get(i));
            if (i != inputList.size() -1){
                System.out.print(" + ");
            }
        }
        System.out.println(String.format(" = %d", sum));
    }
}
