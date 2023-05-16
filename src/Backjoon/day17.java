package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day17 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 분수찾기
		// T % 2 가 0 일 때는 대각선 위 방향, 1 일 때는 아래 방향으로 진행
		// n번째 대각선은 n개의 개수
		//입력받을 X 값
		//해당 범위의 대각선 칸 개수 ( cross_count )
		//해당 대각선 직전 대각선 까지의 칸의 누적 합 ( prev_count_sum )
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int X = Integer.parseInt(br.readLine());
	
	
	int cross_count = 1;
	int prev_count_sum = 0;
	

	while (true) {
		// 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
		if (X <= prev_count_sum + cross_count) {
			
			if (cross_count % 2 == 1) {  // 대각선의 개수가 홀수라면
				
				// 분자는 대각선상 블럭의 개수 - (x번째 - 직전 대각선까지의 블럭 개수 - 1)   => 대각선의 개수와 분모와 분자의 합 차이가 1이라서  -1 1
				// 분모는 x 번째 - 직전 대각선까지의 블럭 개수
				System.out.println((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
				break;
			}
			
			
			else { // 대각선의 개수가 짝수라면
				   // 홀수 반대로 출력
				System.out.println((X - prev_count_sum) + "/" +(cross_count - (X - prev_count_sum - 1)));
				break;
			}
			
		} else {
			prev_count_sum += cross_count;
			cross_count++;
		}
	}
	}

}
