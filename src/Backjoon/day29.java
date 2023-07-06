package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day29 {

	public static void main(String[] args) throws IOException {
		// 직사각형 탈출
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		

		int MinX = Math.min(x, w - x);     // x축 최소 거리 구하기  // Math.min()함수 - 두 인자 값 중 작은 값을 리턴. 
		int MinY = Math.min(y, h - y);     // y축 최소 거리
		
		// x와 y축 최소거리 중 가장 적은 값
		System.out.println(Math.min(MinX, MinY));
	}

}
