package d7.collections.prob;

import java.util.*;

/*
* ### H2

엔터로 구분된 입력이 임의의 횟수만큼 이뤄진다.
`q`가 입력되면 모든 데이터가 입력된 것이라고 생각할 때,
여태까지 입력한 정수가 몇가지가 되는지와 그 총합을 출력하시오.

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
4
10
```
---
입력2:
```text
3
2
2
3
q
```
출력2:
```text
2
5
```
---
입력3:
```text
1,
정수 아님
2
1.01
q
```
출력3:
```text
1
2
```*/
public class H2 { // 다시 풀어서 더 코드가 간결해짐
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> inputSet = new HashSet<>();
        //여태까지 입력한 정수가 몇가지가 되는지와 그 총합을 출력하시오.
        while(true){
            String input = scanner.nextLine();
            if("q".equals(input)) break;
            try{
                inputSet.add(Integer.parseInt(input)); // 중복을 제거한 정수 입력
            }catch (NumberFormatException ignored){}
        }

        int sum =0;
        List<Integer> inputList = new ArrayList<>(inputSet);
        for (int i = 0; i < inputSet.size(); i++) {
           sum += inputList.get(i); // 리스트에서 하나씩 꺼내 총합 구하기
        }
        System.out.println(inputSet.size());
        System.out.println(sum);
    }
}
