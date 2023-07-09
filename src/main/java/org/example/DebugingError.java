package org.example;

import java.util.Scanner;

// Shift을(를) 두 번 눌러 전체 검색 대화상자를 열고 'show whitespaces'를 입력한 다음,
// Enter를 누르세요. 그러면 코드 내에서 공백 문자를 확인할 수 있습니다.
public class DebugingError {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = 1;
        int answer = 0;
        System.out.println("start");
        int A[] = new int[100001];
        int S[] = new int[100001];

        for(int i=1; i<100000; i++){
            A[i] = (int) (Math.random() * Integer.MAX_VALUE);
            S[i] = S[i-1] + A[i];
        }

        for(int t=1; t<testcase; t++){
            int query = 1000;
            for(int i = 0; i<query; i++){
                int start = 1;
                int end = 100;
                answer += S[end] - S[start-1];
                System.out.println(t + " " + answer);
            }
        }
    }
}