package chapter3;

import java.util.Scanner;

public class For10_2439 {
	public static void main(String[] args) {
		//별찍기
		//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		//오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
		
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
