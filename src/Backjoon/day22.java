package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day22 {

	public static void main(String[] args) throws IOException {
		// 어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 하며 판단하는 프로그램 작성
		// 입력의 마지막엔 -1
		// n이 완전수라면, n을 n이 아닌 약수들의 합으로 나타내어 출력
		// 약수들은 오름차순으로 나열
		// n이 완전수가 아니라면 n is NOT perfect. 를 출력
		
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		while(n != -1) {
			
			sb.setLength(0);  // StringBuilder 0으로 초기화. 
			sb.append(n + " = 1");  // 모든 약수에는 1이 포함되므로 
			sum = 1;  // 1을 고정. 
		
			
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					sb.append(" + " + i);
					sum += i;
				}
			}
			
			if (sum == n) {
				System.out.println(sb);
			} else {
				System.out.println(n + " is NOT perfect.");
			}
			
			n = Integer.parseInt(br.readLine());  // n을 다시 입력 
		}
	}

}
