package chapter3;

import java.util.Scanner;

public class For11_10871 {
	public static void main(String[] args) {
		//x보다 작은수
		//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		Scanner stdIn = new Scanner(System.in);
		int cnt = stdIn.nextInt();
		int num = stdIn.nextInt();
		
		for(int i=0; i<cnt; i++) {
			int n = stdIn.nextInt();
			if(n<num) {
				System.out.println(n);
			}
		}
	}
}
