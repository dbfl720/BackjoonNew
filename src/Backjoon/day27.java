package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day27 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 직사각

		
	   // < 1번 풀이 >
//		Scanner scan = new Scanner(System.in);
//		
//		int A = scan.nextInt();
//		int B = scan.nextInt();
//		
//		int C = A * B;
//		
//		System.out.println(C);
		
		
		// < 2번 풀이 >
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int A = Integer.parseInt(br.readLine()), B = Integer.parseInt(br.readLine());
		
		System.out.println(A * B);
	}

}
