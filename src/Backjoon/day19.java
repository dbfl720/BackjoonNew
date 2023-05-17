package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class day19 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//  long형은 264-1으로 약 1844경 정도 된다. 입력 범위가 long형을 넘는다.
		//  BigInteger은 문자열 형태로 이루어져 있어 숫자의 범위가 무한하기에 어떠한 숫자이든지 담을 수 있다.
		// BigInteger은 문자열이기에 사칙연산이 안된다. 그렇기에 BigIntger 내부의 숫자를 계산하기 위해서는 BigIntger 클래스 내부에 있는 메서드를 사용해야 한다.
		/*
		 * add() 메소드는 해당 BigInteger 객체와 파라미터(인자)로 들어온 
		 * BigInteger객체의 더한 값을 BigInteger 타입으로 반환한다.
		 */
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		BigInteger A = new BigInteger(st.nextToken()); // BigInteger을 초기화하기 위해서는 문자열을 인자 값으로 넘겨주어야 한다. BigInteger가 문자열로 되어 있기 때문이다.
		BigInteger B = new BigInteger(st.nextToken());
		
		A = A.add(B);
		
		System.out.println(A.toString());
	}
}
