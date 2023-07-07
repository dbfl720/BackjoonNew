package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day30 {

	public static void main(String[] args) throws IOException {
		
		//축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램
		//세 점의 좌표가 한 줄에 하나씩 
		//직사각형의 네 번째 점의 좌표를 출력

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] A = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
		st = new StringTokenizer(br.readLine(), " ");
		int[] B = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
		st = new StringTokenizer(br.readLine(), " ");
		int[] C = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
		
		
		int x;
		int y;
		
		// x 좌표 비교
		// A번 x좌표, B번 x좌표 비교
		if (A[0] == B[0]) {
			x = C[0];
		}
		
		// A번 x좌표, C번 X좌표 비교
		else if (A[0] == C[0]) {
			x = B[0];
		}
		
		// B번 x좌표와 C번 x좌표 비교
		else {
			x = A[0];
		}
		
		
		
		// y 좌표 비교
		// A번 y좌표, B번 y좌표 비교
		if (A[1] == B[1]) {
			y = C[1];
		}
		
		// A번 y좌표, C번 y좌표 비교
		else if (A[1] == C[1]) {
			y = B[1];
		}
		
		// B번 y좌표와 C번 y좌표 비교
		else {
			y = A[1];
		}
		
		
		System.out.println(x + " " + y);
	}
	
	
}
