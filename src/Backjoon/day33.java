package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day33 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 삼각형 외우기
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		if (a + b + c != 180) {
			System.out.println("Error");
		} else {

			if (a == 60 && b == 60 && c == 60) {
				System.out.println("Equilateral");
			} else if (a == b || a == c || b ==c) {
				System.out.println("Isosceles");
			} else {
				System.out.println("Scalene");
			}
		}

	}

}
