package chapter5;

import java.util.Scanner;

public class Array7_4344 {

	public static void main(String[] args) {
		//평균은 넘겠지
		/*
		 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
		 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
		 */
		Scanner stdIn = new Scanner(System.in);
		int caseNum = Integer.parseInt(stdIn.nextLine());
		String[] input = new String[caseNum];
		float[] avg = new float[caseNum];
		float[] aboveAvg = new float[caseNum];
		
		for(int i=0; i<caseNum; i++) {
			input[i] = stdIn.nextLine();
		}
		
		for(int i=0; i<caseNum; i++) {
			String[] strArray = input[i].split(" ");
			//평균구하기
			int sum = 0;
			for(int j=1; j<strArray.length; j++) {
				sum = sum + Integer.parseInt(strArray[j]);
			}
			avg[i] = (float)sum /Integer.parseInt(strArray[0]);
			
			//평균보다 높은 점수를 가진사람
			int cnt=0;
			for(int j=1; j<strArray.length; j++) {
				if(avg[i]<Integer.parseInt(strArray[j])) cnt++;
			}
			aboveAvg[i] = (float)cnt/Integer.parseInt(strArray[0])*100;	
		}
		
		//출력하기
		for(int i=0; i<caseNum; i++) {
			System.out.println(String.format("%.3f", aboveAvg[i])+"%");
		}
	}
}
