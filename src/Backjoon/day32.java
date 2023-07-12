package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class day32 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//대지
		// 첫째 줄에는 점의 개수 N개,  N 줄에는 각 점의 좌표가 두 개의 정수로 한 줄에 하나씩 주어진다.
		// N 개의 점을 둘러싸는 최소 크기의 직사각형의 넓이를 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());
		
		int[] x = new int[n];
		int[] y = new int[n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
			
		}
		
		Arrays.sort(x);  // Arrays.sort() 오름차순 정렬 
		Arrays.sort(y);
		
		System.out.print((x[n - 1] - x[0]) * (y[n - 1] - y[0]));  // 직사각형 넓이 구하기 

	}

}
