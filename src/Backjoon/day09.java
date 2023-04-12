package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day09 {

	public static void main(String[] args) throws IOException {
		// 최대값
		//첫째 줄에 최댓값을 출력
		//  둘째 줄에 최댓값이 위치한 행 번호와 열 번호를 빈칸을 사이에 두고 차례로 출력
		//  최댓값이 두 개 이상인 경우 그 중 한 곳의 위치를 출력
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 9 x 9 이차원 배열 생성
		int[][] arr = new int[9][9];
		
		
		
		for (int i = 0; i < 9; i++) {     // 행
			String[] strArr = br.readLine().split(" ");
			for (int j = 0; j < strArr.length; j++) {      // 열
				arr[i][j] = Integer.parseInt(strArr[j]);  // 열을 입력받는 것을 [j]에 저장.
			}
		}
		
		
		int max = 0; // 최대값
		int row = 0;  // 행
		int colum = 0;    // 열
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
					row = i;
					colum = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.println((row + 1) + " " + (colum + 1));
		
		
		
		
		
		

	}

}
