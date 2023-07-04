package Backjoon;

import java.util.StringTokenizer;

public class day26 {

	public static void main(String[] args) {
		
		// split()과 StringTokenizer 비교 
		
		
		String data = "100,,,200,300";
		
		String[] result = data.split(",");
		StringTokenizer st = new StringTokenizer(data, ",");
		
		
		// split()
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + "|");
		}
		
		System.out.println("개수:" + result.length);
		
		
		// StringTokenizer 
		int i = 0;
		for (; st.hasMoreTokens(); i++)
			System.out.print(st.nextToken() + "|");
		
		System.out.println("개수:" + i);

		
		
	}

}
