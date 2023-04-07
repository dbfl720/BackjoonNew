package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day03 {

	public static void main(String[] args) throws IOException {
		// 단어 공부
		// 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램
		// 장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		

		int[] arr = new int[26];   // 영문자 개수 : 26
		String s = br.readLine();
		
		for(int i = 0; i < s.length(); i++) {
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
				arr[s.charAt(i) - 'A']++;    // 대문자 범위 // 인덱스 값 구하기.
			} else {
				arr[s.charAt(i) - 'a']++;   // 소문자 범위
			}
		}
		
		
		
		
		
		int max = -1; // 최대값
		char ch = '?';  // ? 값
		
		for (int i = 0; i < 26; i ++) {  //  배열 순회  // 영문자 개수 : 26 
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);   // 대문자로 출력해야 하므로 65를 더해준다.  65 = 대문자 
			}
			
			else if (arr[i] == max) {
				ch = '?';
			}
		}
		
		System.out.println(ch);
 		
	
	}

}
