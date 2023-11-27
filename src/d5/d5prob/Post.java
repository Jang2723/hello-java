package d5.d5prob;

import java.time.LocalDateTime;

/*
* ### Q3

게시판의 게시글을 나타내는 `Post` 클래스를 만들어보자.

1. `Post`는 제목, 본문, 작성일, 수정일, 비밀번호에 대한 정보가 담겨있다.
   - 비밀번호는 게시글을 작성한 사람을 구분하기 위한 임의의 문자열이다.
   - 작성일, 수정일은 `LocalDateTime` 클래스를 활용한다.
     - `LocalDateTime.now()` 메서드는 현재 시각을 반환한다.
2. `Post`가 최초로 생성될 때 전달되는 데이터는 제목, 본문, 비밀번호이다.
   - 작성일, 수정일은 현재 시각으로 자동으로 할당된다.
   - 이때, 최초로 할당되는 시각은 둘이 일치해야 한다.
3. `printPost` 메서드를 가지고 있다.
   - `printPost`는
     ```
     제목: <제목>
     본문: <본문>
     작성일: <작성일>
     수정일: <수정일>
     ```
     의 형태로 내용물을 출력한다.
4. 제목을 수정할 `editTitle` 메서드를 가지고 있다.
   - 성공 여부를 `boolean` 데이터로 반환한다.
   - 인자로 새로 작성할 제목과 비밀번호를 받는다.
   - 입력된 비밀번호가 원래의 비밀번호와 다를 경우 실패한다.
5. 본문을 수정할 `editContent` 메서드를 가지고 있다.
   - 성공 여부를 `boolean` 데이터로 반환한다.
   - 인자로 새로 작성할 본문과 비밀번호를 받는다.
   - 입력된 비밀번호가 원래의 비밀번호와 다를 경우 실패한다.*/
public class Post {
    public String title; // 제곰
    public String contents; // 본문
    public LocalDateTime createdDay; // 작성일
    public LocalDateTime modiDay; // 수정일
    public String password; // 비밀번호

    public Post(String title, String contents, String password){ //최초 생성 - 전달되는 데이터는 제목, 본문, 비밀번호
        this.title = title;
        this.contents = contents;
        this.password = password;
        this.createdDay = LocalDateTime.now();
        this.modiDay = this.createdDay;
    }

    public void printPost(){
        System.out.println("제목: " + this.title);
        System.out.println("본문: " + this.contents);
        System.out.println("작성일: " + this.createdDay);
        System.out.println("수정일: " + this.modiDay);
    }

    public boolean editTile(String title, String pass){
        if (this.password.equals(pass)){ // 비밀번호 일치, 제목 수정
            this.title = title;
            this.modiDay = LocalDateTime.now();
            return true;
        }
        else{// 비밀번호 일치 x, 제목 수정 x
            return false;
        }
    }

    public boolean editContent(String contents, String password){
        if (this.password.equals(password)){ // 비밀번호 일치, 제목 수정
            this.contents = contents;
            this.modiDay = LocalDateTime.now();
            return true;
        }
        else{// 비밀번호 일치 x, 제목 수정 x
            return false;
        }
    }

}