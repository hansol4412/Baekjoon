package chapter3;

import java.util.Scanner;

public class For7_11021 {
	public static void main(String[] args) {
		//A+B
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		for(int i=1; i<=num; i++) {
			int num1 = stdIn.nextInt();
			int num2 = stdIn.nextInt();
			System.out.printf("Case #%d: %d\n",i,num1+num2);
		}
	}
}
