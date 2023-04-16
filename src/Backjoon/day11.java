package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day11 {

	public static void main(String[] args) throws IOException {
		// 가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지
		// 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이
		// 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램
		// 이중 for-loop을 이용 ? 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int area = 0;  // 검은 영역 넓이
		int n = Integer.parseInt(br.readLine());   //색종이 개수
		boolean[][] arr = new boolean[100][100];   //도화지 // ** 기본값 = false
		
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			// 색종이 검은색 영역의 넓이를 구하는 공식. 
			// 입력받은 지점의 배열 값이 false일 경우 true로 바꿔주고 area 값을 1씩 증가시킵니다.
			// 같은 지점이 나오더라도 이미 true이기 때문에 값은 증가되지 않는다.
			// 전체 도화지 값 = false , 검은색 도화지 = true
			for (int j = x; j< x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					if (!arr[j][k]) {  // true가 아닌 범위 
						arr[j][k] = true;
						area++;
					}
				}
			}
			
			
		}
		System.out.println(area);
	}

}
