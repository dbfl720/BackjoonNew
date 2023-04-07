package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day04 {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		// 평균은 넘겠지
		// 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
		// 둘째 줄부터 각 테스트 케이스마다 학생의 수 N
		// 이어서 N명의 점수
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		// 숫자로 변환
		int C = Integer.parseInt(br.readLine());
		StringTokenizer st;  // BufferedReader는 입력과정에서 한 줄을 통째로 읽기 때문에 읽어들인 문자열을 StringTokenizer을 통해 공백을 기준으로 분리해주어야 한다.
		
		int[] arr;
		
		for (int i = 0; i < C;  i++) {
			st = new StringTokenizer(br.readLine()," ");   // 학생 수 및 성적 입력
			
			int N = Integer.parseInt(st.nextToken());   // 학생 수  // st에서 입력받은 부분에서 첫번째 공백에서 잘라 학생 수만 저장.
			arr = new int[N]; 
			
			
			double sum = 0;  // 성적 누적 합 변수
			// 성적 입력 부분
			for (int j = 0; j < N; j++) {
				int val = Integer.parseInt(st.nextToken());   // 성적 저장 //st에서 입력받은 그 다음 부분의 공백에서 잘라 학생 수만 저장.
				arr[j] = val;   //arr[] - 성적이 들어가 있음. 
				sum += val;   // 성적 누적 합
			}
			
			
			double average = (sum / N);  // 평균
			double count = 0;   //  평균 넘는 학생 수 변수
			// 평균 넘는 학생 비율 찾기
			for (int j = 0; j < N; j++) {
				if(arr[j] > average) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",(count/N) * 100);  // 반올림해서 소수 셋째 자리 출력
		}
		
		
		
		br.close();
		

	}

}
