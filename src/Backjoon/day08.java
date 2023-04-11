package Backjoon;

import java.util.Scanner;

public class day08 {

	public static void main(String[] args) {
		// 행렬 덧셈
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int[][] arr1 = new int[N][M];
		int[][] arr2 = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr1[i][j] = scan.nextInt();
			}
		}
		
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr2[i][j] = scan.nextInt();
			}
		}
		
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(arr1[i][j] + arr2[i][j] + " ");
				
				if(j == M - 1)
					System.out.println();
			}
		}

	}

}
