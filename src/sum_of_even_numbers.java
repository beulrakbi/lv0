import java.util.Arrays;
import java.util.Scanner;

public class sum_of_even_numbers {
    public static void main(String[] args) {
        /*
        1. 정수 n 입력받기
        2. n이하 짝수만 골라내기  (배열에 받기)
        3. 짝수만 골라낸거 더할 변수 만들어서 더한 값 넣기

        제한사항 0<n<1000
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요. : ");
        int num = sc.nextInt();
        //정수를 입력받기 위해 Scanner함수 이용

        int[] even = new int[num];
        for (int i = 0, j = 1; i <= even.length-1; i++) {
            if (j % 2 == 0) {
                even[i] = j;
            }
            j++;
        }

        int sum= 0;
        for (int i=0; i<=even.length-1; i++){
            sum += even[i];
        }

        System.out.println(sum);

    }
}
