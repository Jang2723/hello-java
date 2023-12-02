package d7.collections.prob;

import java.util.*;

/*
### H3
엔터로 구분된 누군가의 이름 입력이 임의의 횟수만큼 이뤄진다.
`q`가 입력되면 모든 데이터가 입력된 것이라고 생각할 때,
여태까지 입력된 이름을 중복없이 알파벳 순서데로 출력하시오.

힌트: `Collections.sort`를 이용하면 리스트를 정렬할 수 있다.

예시 입출력
입력1:
```text
Chad
Dave
Alex
Brad
q
```
출력1:
```text
Alex
Brad
Chad
Dave
```
---
입력2:
```text
Chad
Dave
Alex
Brad
Alex
Dave
q
```
출력2:
```text
Alex
Brad
Chad
Dave
```

*/
public class H3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> nameSet = new HashSet<>();
        while(true){
            String str = scanner.nextLine();
            if ("q".equals(str)) break;
            // 집합은 기본적으로 중복을 허용하지 않는다.
            nameSet.add(str);
        }
        // list로 변환
        List<String> nameList = new ArrayList<>(nameSet);
        // ()안에 set 넣어주는 것만으로도 for문이 필요없음
        Collections.sort(nameList);
        for (String str: nameList) {
            System.out.println(str);
        }
    }
}
