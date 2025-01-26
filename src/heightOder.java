import java.util.Arrays;
import java.util.Scanner;

public class heightOder {
    public static void main(String[] args) {

        /*
        1.반 학생 수 입력 받아서 배열 수 정하기
        2. 반 친구들 키가 입력될 배열 생성
        3.머쓱이 키 변수 설정
        4.for문에 if믄 사용해서 큰 사람 있을 때 more변수 ++
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("반 학생 수 : ");
        int[] student = new int[sc.nextInt()]; //배열 생성

//        System.out.println(Arrays.toString(student)); // 배열 생성 확인

        for (int i = 0; i<student.length; i++){
            System.out.println(i+1 +"번 학생 키를 입력하세요:");
            student[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(student)); //배열에 값 들어간느지 확인

        int myHeight = 170;
        int more = 0;
        for (int i=0; i<student.length; i++){
            if (myHeight < student[i]){
                more++;
            }
        }

        System.out.println("머쓱이보다 큰 사람의 수는:" + more + "명 입니다.");


    }
}
