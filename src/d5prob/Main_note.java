package d5prob;

import java.util.Scanner;

public class Main_note {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("제목 : ");
        String title = scanner.next();
        System.out.print("페이지 수 : ");
        int pageCount = scanner.nextInt();
        Note note1 = new Note(title,pageCount);
        System.out.print("작성할 페이지 번호 : ");
        int writeNum = scanner.nextInt();
        System.out.print("작성할 내용 : ");
        scanner.nextLine();
        String content = scanner.nextLine();
        note1.write(writeNum,content);
        note1.read(writeNum);

        System.out.println();
        System.out.println();
        System.out.println("총 몇 쪽 작성됨? : " + note1.writeCount());
        System.out.println();
        System.out.println("작성된 내용");
        note1.printContent();


    }
}
