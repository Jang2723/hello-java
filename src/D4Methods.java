public class D4Methods {

    // main 메서드
    public static void main(String[] args) {
        System.out.println("이것도 메서드 입니다!");
        System.out.println(addTwoInt(10, 20));

        int a = 10;
        int b = 10;
        // 두개의 정수를 더하고 두배 하여라.
//        int c = (a + b) * 2; // 요 뒤에 뭐가 올까요
        int c = addAndTwice(a, b);
        System.out.println(c);
        System.out.println(threeIntAvg(a, b, c));
        int[] numbers = {-1, 0, 1};



        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                index = i;
                break;
            }
        }
        System.out.println(index);


        int[] nums = {2, 3, 1, 4, 6};
        System.out.println(findOneReturn(nums));
        System.out.println("------------");
        System.out.println(findOneBreak(nums));

    }

    // 정수 배열을 받아서, 1이 어디있는지 반환하거나, 없으면 -1을 반환하는 메서드
    public static int findOneReturn(int[] numbers) {
        // 부정 데이터 방지도 가능
        if (numbers.length == 0) {
            // 배열의 길이가 0이면 데이터가 없으니 굳이 찾을필요 없음
            return -1;
        }
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            // 찾았다!
            if (numbers[i] == 1) {
                index = i;
                return index;
            }
        }
        System.out.println("for 종료");
        return index;
    }

    public static int findOneBreak(int[] numbers) {
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                index = i;
                break;
            }
        }
        System.out.println("for 종료");
        return index;
    }

    // 세개의 정수를 받아서, 합한 후 3으로 나눈 몫을 반환하는 메서드
    public static int threeIntAvg(int a, int b, int c) {
//        int sum = a + b + c;
//        int gAvg = sum / 3;
//        return gAvg;
        return (a + b + c) / 3;
    }

    // 두개의 정수를 더하고 두배 해서 그 결과를 반환하는 메서드
    public static int addAndTwice(int a, int b) {
        // int a = 10;
        // int b = 10;
        // 두개의 정수를 더하고 두배 하여라.
        int c = (a + b) * 2; // 요 뒤에 뭐가 올까요
        return c;
    }

    // 두개의 정수를 더하고 그 결과를 반환하는 메서드
    public static int addTwoInt(int a, int b) {
        return a + b;
    }

}