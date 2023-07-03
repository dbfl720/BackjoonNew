package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day25 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 정수 N이 주어졌을 때, 소인수분해하는 프로그램

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		
		
		// <1번 풀이>
//		//n이 1이 될 때까지 반복
//		int i =2;
//		while (n != 1) {
//			// i가 n의 약수이면 나누고 출력
//			if (n % i == 0) {
//				n /= i;
//				sb.append(i + "\n");
//			} else {
//				i++;
//			}
//		}
//		
//		System.out.print(sb);
		
		
		
		
		//<2번 풀이>
		for (int i = 2; i <= Math.sqrt(n); i++) { // 에라토스테네스의 체.
			while (n % i == 0) {
				sb.append(i).append('\n');
				n /= i;
			}
		}
		
		if ( n!= 1) {     // 인수를 갖고 있는데 출력을 못하는 것을 방지하기 위해 한번 더 출력 
			sb.append(n);
		}
		System.out.print(sb);
	}

}
