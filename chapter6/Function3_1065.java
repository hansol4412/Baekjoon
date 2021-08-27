package chapter6;

import java.util.Scanner;

public class Function3_1065 {

	public static void main(String[] args) {
		// 한수
		/*
		 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
		 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
		 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
		 * 1부터 99까지는 모두 한수로 본다
		 * 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
		 */
		Scanner stdIn = new Scanner(System.in);
		int inputNum = stdIn.nextInt();
		int cnt = 0;
		
		if(inputNum<100) {
			cnt = inputNum;
		} else {
			cnt = 99;
			for(int i = 100; i <= inputNum; i++) {
				cnt+=hansoo(i);
			}
			if(inputNum==1000) cnt--;
		}
		
		System.out.println(cnt);
	}
	
	public static int hansoo(int n) {
		int onum = n;
		int num1 = n % 10;
		n = n/10;
		int num2 = n % 10;
		n = n/10;
		int num3 = n % 10;
		if((num1-num2)==(num2-num3)) {
		//if (num2*2 == num1 + num3)
			return 1;
		} else {
			return 0;
		}
	}
}
