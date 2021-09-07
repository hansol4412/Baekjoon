package chapter3;

import java.util.Scanner;

public class For5_2741 {
	public static void main(String[] args) {
		//N찍기
		//자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		for(int i=1; i<=num; i++) {
			System.out.println(i);
		}
	}
}
