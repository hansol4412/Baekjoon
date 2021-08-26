package chapter6;

import java.util.Scanner;

public class Function1_15596 {

	public static void main(String[] args) {
		// 정수 N개의 합
		/*
		 * 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
		 */
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		int[] a = new int[num];
		for(int i =0; i<a.length; i++) {
			a[i] = stdIn.nextInt();
		}
		Function1_15596 num1 = new Function1_15596();
		System.out.println(num1.sum(a));
	}
	
	long sum(int[] a) {
        long ans = 0;
        for(int i =0; i<a.length; i++){
            ans += a[i];
        }
        return ans;
    }	    
}
