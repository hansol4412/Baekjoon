package chapter5;

import java.util.Scanner;

public class Array6_8958 {

	public static void main(String[] args) {
		// OX퀴즈
		/*
		 "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
		 "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
		 OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
		*/
		Scanner stdIn = new Scanner(System.in);
		int inputNum = stdIn.nextInt();
		String[] inputArray = new String[inputNum];
		int[] output = new int[inputNum];
		for(int i=0; i<inputNum; i++) {
			inputArray[i] = stdIn.next();
		}
		
		for(int i =0; i<inputNum; i++) {
			String[] strArray = inputArray[i].split("");
			int sum=0;
			int cnt=0;
			for(int j=0; j<strArray.length; j++) {
				if(strArray[j].equals("X")) {
					cnt=0;
				} else {
					cnt++;
					sum = sum+cnt;
				}
			}
			output[i]=sum;
		}
		
		for(int i =0; i<output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
