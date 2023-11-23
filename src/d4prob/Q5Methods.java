package d4prob;
public class Q5Methods {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};
        int[] result = reverse(numbers);
        for (int num : result) {
            System.out.println(num);
        }
    }

    public static int[] reverse(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            // numbers[i]가 result[]의 어디에? - 마지막에서 i 만큼 앞으로
            // numbers.length - 1 - i
            result[i] = numbers[numbers.length - 1 - i];
        }
        return result;
    }

}