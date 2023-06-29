package Backjoon;

import java.util.Scanner;

public class day23 {

	public static void main(String[] args) {
		// 소수 찾기
		// 소수는 1보다 큰 정수이고, 1과 자기 자신으로만 나누었을 때 나머지가 0인 경우 
		// 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int num = 0;
		int count = 0;
		
		for(int i = 0; i < N; i++) {  // N번 반복 
			num = scan.nextInt();
			
			for (int j = 2; j <= num; j++) { // 1은 소수가 아니라서, 2부터 시작~ 
				
				
				if (j == num) { // 자기 자신 수가 나오면 소수. 
					count++;
				}
				
				if (num % j == 0) { // num을 j나눈 나머지가 0이되면 빠져 나온다
					break;
				}
			}
		}
		
		System.out.println(count);
		

	}

}
