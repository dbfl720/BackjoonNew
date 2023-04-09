package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day06 {

	static BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
	
	public static void main(String[] args) throws IOException {
		// 그룹 단어 체커
		//문자가 연속해서 나타나는 경우
		//떨어져서 나타나기 때문에 그룹 단어가 아니다.
		// 의사코드 활용.
		
		int count = 0;
		int N = Integer.parseInt(br.readLine());  // 문자열로 데이터를 읽으니 반드시 꺼내서 쓸 때 int 형으로 쓰고자 한다면 Integer.parseInt()로 String 을 int 형으로 변환
		
		for (int i = 0; i < N; i++) {
			if (check() == true) {
				count++;
			}
		}
		
		System.out.println(count);
			

	}  // main
	
	
	
	
	// 그룹 단어 체크   
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];  // 단어 총 개수 - 26 
		int prev = 0;   // 이전 문자 
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);     // i번째 문자 저장(현재 문자)  // char형 문자들을 int형 변수에 대입하면 문자값에 해당하는 10진수 코드번호가 저장되는 것입니다.
			
			
			// 앞선 문자와  i번째 문자가 같지 않다면?
			if (prev != now) {
				
				
				// 해당 문자가 처음 나오는 경우 (false인 경우)
				if (check[now - 'a'] == false) {
					check[now - 'a'] = true;    // true로 바꾼다.
					prev = now;  // now를 prev로 변환 (다음턴 체크)
				}
				
				
				// 해당 문자가 이미 나온 적이 있는 경우 (그룸단어가 아니게 된다 )
				else {
					return false;     // 함수 종료
				}
			}
			
			
			
			
			// 앞선 문자와 i번째 문자가 같다면? (연속된 문자)
			else {
				continue;  // 반복문 끝으로 이동하여 다음 반복으로 넘어간다.
			}
		}
		
		 return true;
	} // check()

}
