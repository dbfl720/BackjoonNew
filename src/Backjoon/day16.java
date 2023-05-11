package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day16 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 벌집
		// 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램
		// 규칙 : 방의 개수는 6개씩 늘어난다. 최소값의 개수는 1개씩 늘어난다. 
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());    // br.readLine()은 문자열로 데이터를 읽는다. 꺼내 쓸때는 int로 바꿔야함. (Integer.pareInt())
		int count = 1; // 겹수 ( 최소 루트)
		int range = 2;  // 범위 ( 최소값 기준)
		
		if (N == 1) { // N이  1일 경우 1을 출력 
			System.out.print(1);
		}
		
		else {
			while (range <= N) { // 범위가 N보다 커지기 직전까지 반복 
				range = range + (6 * count); // 다음 범위의 최소값으로 초기화. 방 개수가는 6개씩 늘어나기 때문에. 
				count++;
			}
			System.out.print(count);
		}
	}

}
