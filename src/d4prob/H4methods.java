package d4prob;
/*
 int[]을 인자로 받아,

배열의 값들 중 최댓값의 위치를 반환하는 "maxWhere"
배열의 값들 중 최솟값의 위치를 반환하는 "minWhere"
배열의 값들 중 최댓값과 최솟값의 차이를 반환하는 "maxDiff"
메서드를 각각 작성하시오
*/
public class H4methods {
    public static int maxWhere(int[] numbers){
        //배열의 값들 중 최댓값의 위치를 반환하는 "maxWhere"
        //numbers.length > 0 이 검증이 있으면 더 좋음
        int max = numbers[0];
        int index = 0;
        for (int i = 0; i< numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
                index = i;
            }
        }
        return index;
    }
    public static int minWhere(int[] numbers){
        //배열의 값들 중 최솟값의 위치를 반환하는 "minWhere"
        //int[] numbers ={8, 4, 20, 26, 33, 49, 53, 12};
        int min = numbers[0];
        int index = 0;
        for(int i = 1; i< numbers.length; i++){
                if(numbers[i] < min){
                    min = numbers[i];
                    index = i;
                }
            }
        return index;
    }
    public static int maxDiff(int[] numbers) {
        // 배열의 값들 중 최댓값과 최솟값의 차이를 반환하는 "maxDiff"
        return numbers[maxWhere(numbers)] - numbers[minWhere(numbers)];
    }
    public static void main(String[] args) {
        int[] numbers ={68, 4, 20, 26, 33, 49, 53, 12};
        System.out.println(String.format("max : %d, min : %d, maxDiff : %d",
                numbers[maxWhere(numbers)],numbers[minWhere(numbers)],
                maxDiff(numbers)));
    }
}
