package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day15 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 중앙 이동 알고리즘
		// 과정을 N번 거친 후 점 몇 개를 저장해야 하는지 구하는 프로그램
		// 즉, 가로  x 가로 = 총 점의 개수. 
		// 첫째 줄에 N이 주어진다. (1 ≤ N ≤ 15)
		// 총 점의 개수가 9, 25, 81 ... 순으로 늘어난다.
		// 가로의 점 길이 =  1 + (2^n)
		// 1 + (2^1), 1 + (2^2), 1 + (2^3) 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int dot = 1 + (int)Math.pow(2, N);      // 제곱을 계산하는 함수 Math.pow() //Math.pow(3,2) 이라고 하면 3의 2제곱
		System.out.println(dot * dot);
	
	
	}

}
