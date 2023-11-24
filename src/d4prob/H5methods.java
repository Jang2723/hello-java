package d4prob;
import java.util.Scanner;
/*
int[]을 두개 받아,
// 추가 내용 : 첫번째 배열의 마지막 원소 뒤에, 두번째 배열의 첫번째 원소가 오도록
두 배열이 합쳐진 배열을 반환하는 메서드를 작성하시오.
*/
public class H5methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] front = {10,20,30,40};
        int[] back = {6, 7, 8};
        int[] num = ArraySum(front,back);

        for(int i : num){
            System.out.println(i);
        }
    }
    public static int[] ArraySum(int[] front,int[] back){
       int[] result = new int [front.length + back.length];
        for (int i = 0; i < result.length; i++) {
            if( i < front.length){ //a배열 먼저 입력 a.length = 5
                result[i] = front[i];
            }
            else{
                result[i] = back[(i + back.length - result.length)];
            }
        }
        // 1. 외부에 result 원소 순서용 변수 만드어서 for 두번
//        int idx = 0;
//        for (int i = 0; i < front.length; i++) {
//            result[idx] = front[i];
//            idx++;
//        }
//        for (int i = 0; i < back.length; i++) {
//            result[idx] = back[i];
//            idx++;
//        }
        //2. fori 두번 돌되, 두번째(back)할 떄는 위치를 front.length
        //3. 그냥 한번에 하겠다. -> 내가 한 방법
        return result;
    }
}
