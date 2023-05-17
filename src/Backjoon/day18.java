package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day18 {

	public static void main(String[] args) throws IOException {
		
		// 달팽이는 올라가고 싶다.
		//  높이가 V미터인 나무 막대를 올라갈 것이다.
		//  낮에 A미터 올라갈 수 있다. 
		// 밤에 잠을 자는 동안 B미터 미끄러진다.
		// 정상에 올라간 후에는 미끄러지지 않는다
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());
		
		int day = (length - down) / (up - down);    // down은 항상 up보다 횟수가 하나 작기 때문에, 마지막에 도달할 때(length) down의 수를 뺀다. - 정점에 도달하면 미끄러지 지지 않기 때문. // 결과적으로 나눈 몫은 최소한의 일 수가 됨.
		if ((length - down) % (up - down) != 0 ) {  // 나머지가 남는 경우는 하루가 더 소요되므로 day++; 
			day++;
		}
		System.out.println(day);
	}
}
