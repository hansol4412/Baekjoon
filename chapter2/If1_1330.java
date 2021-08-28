package chapter2;

import java.util.Scanner;

public class If1_1330 {

	public static void main(String[] args) {
		// 두 수 비교하기
		// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
		Scanner stdIn = new Scanner(System.in);

		int num1 = stdIn.nextInt();
		int num2 = stdIn.nextInt();

		if (num1 > num2) {
			System.out.println(">");
		} else if (num1 < num2) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}

	}

}
