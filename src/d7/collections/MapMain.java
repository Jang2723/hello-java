package d7.collections;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        // 핸드폰 - 연락처
        // 연락처를 검색하는 기준?
        // 이름 - 전화번호
        // Map
        // Key - Value
        // 메뉴 - 가격
        // 전공 - 전공생들
        Map<String, String> contactBook = new HashMap<>();
        // Map에  연락처 저장
        contactBook.put("Alex","010-Alex-Alex");
        contactBook.put("Brad","010-Brad-Brad");
        contactBook.put("Chad","010-Chad-Chad");
        contactBook.put("Eric","010-Eric-Eric");
        // Map에서 연락처 찾아오기
        System.out.println(contactBook.get("Alex"));
        System.out.println(contactBook.get("Chad"));
        System.out.println(contactBook.get("Brad"));
        // 1. 없는 것을 가져올 때 null이 된다.
        System.out.println(contactBook.get("Dave"));
        // 2. 있는걸 넣을 때는 덮어씌운다.
        contactBook.put("Eric","010-IM-GONE");
        // 전공생 수
        // CSE - 10
        // EE - 20
        // ME - 15
        // BA - 30
        Map<String, Integer> majorCount = new HashMap<>();
        majorCount.put("CSE",10);
        majorCount.put("EE",20);
        majorCount.put("ME",15);
        majorCount.put("BA",30);
        System.out.println(majorCount);

        // 만약 데이터를 넣어야 되는 상황에, 새로운 전공이 생기면?
        // 1. majorCount.get("major") == null
        String newMajor = "ENG";
        if (majorCount.get(newMajor) == null){
            majorCount.put(newMajor, 1);
        }else{
            int before = majorCount.get(newMajor);
            majorCount.put(newMajor, before + 1);
        }

        // 2. putIfAbsent
        Integer before = majorCount.putIfAbsent(newMajor ,1);
        if (before != null){
            majorCount.put(newMajor, before +1);
        }

        Map<String, List<String>> majorStudents = new HashMap<>();
        majorStudents.put("CSE", new ArrayList<>());
        List<String> cseStudents = majorStudents.get("CSE"); // CSE의 값을 가져오게 되는데 CSE의 값이 new ArrayList<>()니까 배열을 만든다는뜻
        //  majorStudents.get("CSE") == new ArrayList<>() 같은 뜻
        cseStudents.add("Alex");
        cseStudents.add("Brad");
        cseStudents.add("Chad");
        System.out.println(majorStudents);

        // keySet(), entrySet()
        // Map을 순회하고 싶으면 둘중 하나 선택할 수 있다.
        // keySet() - key 로만 구성된 set
        Set<String> kesSet = contactBook.keySet();
        for (String key : kesSet ){
            System.out.println(key);
            System.out.println(contactBook.get(key));
        }

        // entrySet() - (key - value) 쌍(Entry)으로 구성된 set
        // Entry는 key와 value를 조회할 수 있는 메서드를 가지고 있다.
        for (Map.Entry<String, String> entry : contactBook.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // git config user.email 이메일
        // git confing user.name 아이디

        // 사람 한명에 대한 정보
        // name = alex
        // age = 25
        // major = cse




    }
}
