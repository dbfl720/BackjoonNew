package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day05 {

	public static void main(String[] args) throws IOException {
		
		// 크로아티아 알파벳
		// 목록에 없는 알파벳은 한 글자씩 센다.
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String str = br.readLine();
		


		int length = str.length();
		int count = 0;
		
		for (int i = 0; i < length; i++) {
			char charAt = str.charAt(i);  //charAt() 메소드는 문자열을 배열로 보고 해당 위치의 문자를 반환하는 메소드다. 시작값은 0 이다.
			
			// c~ 라면?
			// i 의 값이 문자열 길이(str.length) 에서 -1 값보다 작을 경우에만 다음 조건문을 실행 // ( dz= 를 검사할 때는 i 가 str.length - 2 보다 작아야한다. )
			if (charAt == 'c' && i < length - 1) {
				// 만약 charAt 다음 문자가 '=' 또는 '-' 이라면?
				if(str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
					// i+1 까지가 하나의 문자이므로 다음 문자를 건너 뛰기 위해 1 증가
					i++;
				}
				
			} 
			
			
			
			// d~ 라면 ? 
			else if (charAt == 'd' && i < length - 1) {
				if(str.charAt(i + 1) == '-') {
					i++;
				
			} else if (str.charAt(i + 1) == 'z' && i < length - 2) {
					// dz= 일 경우라면?
					if(str.charAt(i + 2) == '=') {
						i += 2;
					}
				}	
			}
			
			
			// lj, jn 라면 ? 
			else if ((charAt == 'l' || charAt == 'n') && i < length - 1) {
				if (str.charAt(i + 1) == 'j') {
					i++;
				}
			}
			
			
			// s= , z= 라면 ? 
			else if ((charAt == 's' || charAt == 'z') && i < length - 1) {
				if (str.charAt(i + 1) == '=') {
					i++;
				}
				
			}
			
			
			 count++;
			
			
		} // for문
		
		System.out.println(count);
		
		
		

	}

}
