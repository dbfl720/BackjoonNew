package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day12 {
	public static void main(String[] args) throws IOException {
		
	
		// 진법 변환
		// 10진법으로 바꿔 출력하는 프로그램
		// 숫자로 표시할 수 없는 자리 -> 알파벳 대문자를 사용
//		- 어떤 진수든 10진수로 바꾸는 방법은 똑같다
//
//		- 각 자리의 10진수 숫자 * 진수의 각 자리수 제곱을 모두 더한 값이다
//
//		ex) 2진수 1101 일때
//
//		1*2^3 + 1*2^2 + 0*2^1 + 1*2^0 = 13
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String n = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		
		long result = 0;
		int idx = 0; 
		int num = 0;  //계산하기 위해 각 자리 숫자를 10진수로 바꿔준다
		for (int i = n.length() - 1; i >= 0; i--) {
			char c = n.charAt(i);
			if (c >= '0' && c <= '9')
				num = c - '0';     // 0~9 사이는 그대로 출력
			else 
				num = c - 55;   //A~Z는 숫자로 변경   // ex. A는 아스키 코드 값으로 65 이므로 - 55를 빼면 10진수로 변환.
			result += num * Math.pow(b, idx++);   // 거듭 제곱 구하기 Math.pow(대상숫자,지수)  // ex. (5,2) - 5의 2제곱.
		}
		
		System.out.println(result);
	}
	
	
}