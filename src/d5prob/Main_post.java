package d5prob;

import java.util.Scanner;

public class Main_post {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title  = scanner.next();
        String contents = scanner.next();
        String pass = scanner.next();
        Post post1 = new Post(title,contents,pass);

        // post 출력
        post1.printPost();
        System.out.println();
        System.out.println("제목 수정(수정할 제목, 비밀번호)");
        System.out.println();
        System.out.println("제목 수정 : " + post1.editTile(scanner.next(),scanner.next()));
        System.out.println();
        post1.printPost();
        System.out.println();
        System.out.println("내용 수정 (수정할 내용, 비밀번호)");
        System.out.println();
        System.out.println("내용 수정 : " + post1.editContent(scanner.next(), scanner.next()));
        post1.printPost();

    }
}
