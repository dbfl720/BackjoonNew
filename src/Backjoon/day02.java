package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day02 {

	public static void main(String[] args) throws IOException {
		// 팰린드롬인지 확인하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuffer sb = new StringBuffer(str);
		
		

		if(str.equals(sb.reverse().toString())) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	} 

}
