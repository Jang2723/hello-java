package d4prob;
import java.util.Scanner;
/*
int[]을 두개 받아,
두 배열이 합쳐진 배열을 반환하는 메서드를 작성하시오.
*/
public class H5methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {10,20,30,40};
        int[] b = {6, 7, 8};
        int[] num = ArraySum(a,b);

        for(int i : num){
            System.out.println(i);
        }
    }
    public static int[] ArraySum(int[] a,int[] b){
       int[] result = new int [a.length + b.length];
        for (int i = 0; i < result.length; i++) {
            if( i < a.length){ //a배열 먼저 입력 a.length = 5
                result[i] = a[i];
            }
            else{
                result[i] = b[(i + b.length - result.length)];
            }
        }
        return result;
    }
}
