package org.example;

import java.util.Scanner;

// Shift을(를) 두 번 눌러 전체 검색 대화상자를 열고 'show whitespaces'를 입력한 다음,
// Enter를 누르세요. 그러면 코드 내에서 공백 문자를 확인할 수 있습니다.
public class DebugingError {
    public static void main(String[] args) {
        //TODO: 배열에서 주워진 범위의 합을 구하는 프로그램을 구하시오.
        //애매한 자료형은 long으로 선언하는 습관을 가지자
        Scanner sc = new Scanner(System.in);
        int testcase = 4;
        long answer = 0;
        System.out.println("start");
        long A[] = new long[100001];
        long S[] = new long[100001];

        for(int i=1; i<100000; i++){
            A[i] = (long) (Math.random() * Integer.MAX_VALUE);
            S[i] = S[i-1] + A[i];
        }

        for(int t=1; t<testcase; t++){
            int query = 10;
            for(int i = 0; i<query; i++){
                int start = 2;
                int end = 10;
                answer += S[end] - S[start-1];
                System.out.println(S[10]+" "+S[1]);
                System.out.println(S[10]-S[1]);
                System.out.println(t + " : " + answer);
            }

        }
    }
}