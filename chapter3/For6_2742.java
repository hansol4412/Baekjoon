package chapter3;

import java.util.Scanner;

public class For6_2742 {
	public static void main(String[] args) {
		//기찍 N
		//자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		for(int i=num; i>=1; i--) {
			System.out.println(i);
		}
	}
}
