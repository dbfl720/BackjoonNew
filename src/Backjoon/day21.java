package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day21 {

	public static void main(String[] args) throws IOException {
		// 약수 구하기
		

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i <= N; i++) {
			// 약수를 찾을 때마다 K를 하나씩 감소
			if (N % i == 0) {
				K--;
			}
			
			// K번째  i 출력하고 종료시키기
			if (K == 0) {
				System.out.println(i);
				return;
			}
		}
		
		// 만약 K번째까지 못갔다면 // K번째 약수가 없다면 0 출력 
		if (K != 0) {
			System.out.println(0);
		}
		
		
		
		
	}

}
