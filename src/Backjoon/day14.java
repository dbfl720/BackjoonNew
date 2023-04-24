package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day14 {

	public static void main(String[] args) throws IOException {
		// 세탁소 사장 동혁
		// 쿼터(Quarter, $0.25)의 개수, 다임(Dime, $0.10)의 개수, 니켈(Nickel, $0.05)의 개수, 페니(Penny, $0.01)의 개수를 구하는 프로그램
		//  동전의 개수를 최소
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;
		
		StringBuilder sb = new StringBuilder(); // StringBuilder()는 속도를 빠르게 하기 위해 사용. 
		
		for (int i = 0; i < T; i++) {
			int C = Integer.parseInt(br.readLine());
			sb.append(C / quarter + " ");  // 동전의 개수를 최소화 하기 위해 큰 수부터 나눈다.  - append()는 문자열을 더하는 역할.
			C %= quarter;
			sb.append(C / dime + " ");
			C %= dime;
			sb.append(C / nickel + " ");
			C %= nickel;
			sb.append(C / penny +" ");
			
			 
		}
		System.out.print(sb);
				

	}

}
