package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day10 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 세로읽기
		//총 다섯줄의 입력이 주어진다. 각 줄에는 최소 1개, 최대 15개의 글자들이 빈칸 없이 연속으로 주어진다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[][] ch = new char[5][15];  // 문자 넣을 char형 배열 선언 ( 세로 5 가로 15)
		
		for(int i = 0; i < ch.length; i++) {
			String str = br.readLine();  // 문자열을 5번 입력받고 
			
			for(int j = 0; j < str.length(); j++) {
				ch[i][j] = str.charAt(j);  // 입력받은 문자열의 한문자 한문자 배열에 순서대로 넣어줌 위처럼 String 변수에서 사용할 수 있으며, charAt(i) i 자리에는 int 형 변수를 넣어서 원하는 위치의 문자를 가져올 수 있다.
											// charAt()은 문자열에서 문자 하나를 추출할 수 있는 메서드이다. 
			}
			
		}
		
		
		for (int i = 0; i < 15; i++) {
			for(int j = 0; j < 5; j++) {
				if(ch[j][i] == ' ' || ch[j][i] == '\0')  // 출력을 할 떄, 참조한 인덱스가 공백 또는 null 문자 일 경우, 넘어가고 계속 진행 ( continue )
					continue;
				
				System.out.print(ch[j][i]);  // 세로로 문자를 하나씩 읽기
			}
		}
		
	
		
		
		
		
		
	}

}
