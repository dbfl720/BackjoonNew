package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day20 {

	public static void main(String[] args) throws IOException {
		// 배수와 약수
		
		String f = "factor\n";
		String m = "multiple\n";
		String n = "neither\n";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 선언 
		StringBuilder sb = new StringBuilder();  // 인스턴스를 생성할 때 지정된 문자열을 변경 가능.  StringBuffer와 거의 같음.
		StringTokenizer st;  // 공백 단위로 데이터를 가공
		
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			
			if (first == 0 && second == 0)
				break;
			
			if (second % first == 0) {  // 약수 
				sb.append(f); // append 메서드는 입력된 값을 문자열로 반환해서 덧붙임
			}
			
			else if (first % second == 0) { // 배수 
				sb.append(m);
			}
			else {
				sb.append(n);
			}
		}
		
		System.out.println(sb);
		

	}

}
