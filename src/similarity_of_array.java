import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class similarity_of_array {
    public static void main(String[] args) {

        /*
        s1, s2 배열 생성
        result 배열에 0 초기화 s1, s2 같으면 result++;
        for문 안에 if문 사용해서 같은 문자 비교
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("s1문자 n개 입력 : ");
        String[] s1 = new String[sc.nextInt()];
        for (int i = 0; i < s1.length; i++) {
            s1[i] = sc.next();
        }
        System.out.println(Arrays.toString(s1));

        System.out.print("s2 문자 n개 입력 : ");
        String[] s2 = new String[sc.nextInt()];
        for (int i = 0; i < s2.length; i++) {
            s2[i] = sc.next();
        }
        System.out.println(Arrays.toString(s2));

        int result = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (Objects.equals(s1[i], s2[j])) {
                    result++;
                    break; // 똑같은 문자 2개면 두 번 읽으니까 break
                }
            }
        }

//        int result=0;
//        if (s1.length > s2.length){
//        for (int i=0; i<s1.length; i++){
//                if (Objects.equals(s1[i], s2[i])){
//                    result++;
//                }
//            }
//        } else {
//            for (int i=0; i<s2.length; i++){
//                if (Objects.equals(s2[i], s1[i])){
//                    result++;
//                }
//            }
//        }

        System.out.println(result);
    }
}
