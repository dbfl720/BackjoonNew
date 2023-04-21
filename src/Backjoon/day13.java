package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day13 {
	// 진법 변환 2
	// 10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램
	// 10진법 -> B진법으로 바꾸는 방법 : 나눌수 없을 때까지 나눈 후, 마지막 몫과 나머지를 아래부터 위로 순서대로 적기. 
	
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int N = Integer.parseInt(st.nextToken());
	int B = Integer.parseInt(st.nextToken());
	
	StringBuilder sb = new StringBuilder(); // StringBuilder()는 속도를 빠르게 하기 위해 사용. 
	
	// 영어 대문자 65 ~ 90
	while (N != 0) {  // 나머지 값을 출력하고 몫이 0이 될 때까지 나눠준다.
		if (N % B >= 10) {
			sb.append((char) ((N % B) + 55));  // 아스키 코드 - 영어 대문자 65 ~ 99  // 나머지 값이 10 이상이면 55더하기. 
			
		} else {
			sb.append(N % B);  // StringBuilder - append()는 문자열을 더하는 역할.
		}
		N /= B;
	}
	
	System.out.println(sb.reverse().toString());  // 문자열 출력 - toString()이용. 
	}
}
