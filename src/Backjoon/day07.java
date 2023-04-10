package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 너의 평점은
		// 전공평점을 계산해주는 프로그램
		// 전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.
		// 20줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분
		
		
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		String[][] studentInfo = new String[20][3];     // 20 :총 20줄 ,  3 : 과목명-학점-등급
		
		double sumScore = 0;  // 학점의 총합 
		double sumScoreAndGrade = 0;   // 전공과목별 (학점 x 과목평점)의 합
		
		
		// 전공과목별 합과 학점의 총합 구하기.
		for( int i = 0; i < 20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			studentInfo[i][0] = st.nextToken(); // 과목명  // st에서 입력받은 다음 부분의 공백에서 잘라 저장
			studentInfo[i][1] = st.nextToken(); //학점
			studentInfo[i][2] = st.nextToken(); // 등급
			
			//  등급이 P인 과목은 계산에서 제외
			if (!studentInfo[i][2].equals("P")) {
				sumScoreAndGrade += calcScoreAndGrade(Double.parseDouble(studentInfo[i][1]), studentInfo[i][2]);
				sumScore += Double.parseDouble(studentInfo[i][1]);
			}
		} // for
		
		
		
		// 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값
		if (sumScoreAndGrade != 0) {
			sumScoreAndGrade /= sumScore;
		}
		
		
		System.out.printf("%f", sumScoreAndGrade);
		
	}
	
	
	
	
	// 전공과목별 (학점 × 과목평점)의 합
	private static double calcScoreAndGrade(double score, String grade) {
		double sum = 0;
		
		switch (grade) {
		case "A+" :
			sum = score * 4.5;
			break;
			
		case "A0" :
			sum = score * 4.0;
			break;
			
		case "B+" :
			sum = score * 3.5;
			break;
			
		case "B0" :
			sum = score * 3.0;
			break;
			
		case "C+" :
			sum = score * 2.5;
			break;
			
		case "C0" :
			sum = score * 2.0;
			break;
			
		case "D+" :
			sum = score * 1.5;
			break;
			
		case "D0" :
			sum = score * 1.0;
			break;
			
		}
		
		return sum;
	}

}