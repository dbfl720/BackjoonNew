package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day24 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 소수는 1보다 큰 정수이고, 1과 자기 자신으로만 나누었을 때 나머지가 0인 경우 
		// 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골르기
		// 소수의 합과 최솟값을 찾는 프로그램
		// 소수가 없을 경우는 첫째 줄에 -1을 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int min = N;
		
	
		for (int i = M; i <= N; i++) { // 소수 구하기
			
			boolean check = true;   // 소수인 경우 true , 아닌 경우  false 
			
			if (i == 1) {  // 1은 소수가 아니라서 건너뛰기.
				continue;
			}
			
			for (int j = 2; j <= Math.sqrt(i); j++) { // 2부터 시작~ i의 제곱근 까지.  (에라토스테네스의 체)
													//Math.sqrt() : double타입의 인수를 전달하면 인수에 대한 double타입의 제곱근 값을 리턴
				if (i % j == 0) {  // 소수가 아니므로 false로 변경 
					check = false;
				}
			}
			
			
			if (check) { // 소수일 때
				
				sum += i;  // 합 누적 
				
				if(min > i) { // 소수들 중에서 최소값 구하기 
					min = i;
				}
				
			}
			
			
			
		}
		
		if (sum == 0) {
			
			System.out.println(-1);
			return;
		}
		
		System.out.println(sum + "\n" + min);
	}

}
