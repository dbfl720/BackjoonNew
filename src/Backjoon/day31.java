package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day31 {

	public static void main(String[] args) throws IOException {
		// 수학은 체육과목 입니다. 
		// 도형의 둘레 길이 구하는 프로그램.
		// n = 1  -> 4
		// n = 2  -> 8
		// n = 3  -> 12
		// N의 범위가 int의 범위를 초과하므로 long형을 쓴다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		long a = Long.parseLong(br.readLine());
		
		System.out.println(a * 4);
		
		
				
		
	}

}
