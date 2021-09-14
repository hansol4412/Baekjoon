package chapter4;

import java.util.Scanner;

public class While_10952 {
	public static void main(String[] args) {
		//A+B
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int num1 = stdIn.nextInt();
			int num2 = stdIn.nextInt();
			if(num1==0 && num2 ==0) break;
			else {
				System.out.println(num1+num2);
			}
		}
	}
}
