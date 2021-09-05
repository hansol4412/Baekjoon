package chapter3;

import java.util.Scanner;

public class For3_8393 {
	public static void main(String[] args) {
		//합
		//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		int sum=0;
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
