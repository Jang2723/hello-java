package d6.prob.Q1;

public class Magazine extends Book{ // 월간지
    //Magazine 클래스는 몇년몇월 호인지,
    // 주제가 무엇인지에 대한 정보를 가지고 있다.
    private final int year; // 몇년
    private final int month; // 몇월
    private final String subject; // 주제
    
    public Magazine(String title, int pages, int year, int month, String subject){
        super(title, pages);
        this.year = year;
        this.month =month;
        this.subject = subject;
    }

    @Override
    public void printInfo(){
        System.out.println(String.format("title : %s", getTitle()));
        System.out.println(String.format("pages : %d", getPages()));
        System.out.println(String.format("year : %d",year));
        System.out.println(String.format("month : %d",month));
        System.out.println(String.format("subject : %s",subject));



    }
}
