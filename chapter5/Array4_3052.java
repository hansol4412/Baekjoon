package chapter5;
import java.util.HashSet;
import java.util.Scanner;
public class Array4_3052 {

	public static void main(String[] args) {
		//나머지
		/*
		 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
		 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
		 */
		
		Scanner stdIn = new Scanner(System.in);
		int[] inputArray = new int[10];
		HashSet<Integer> hashset = new HashSet<Integer>();
		
		for(int i = 0; i<inputArray.length; i++) {
			inputArray[i] = stdIn.nextInt();
			hashset.add(inputArray[i]%42);
		}
				
//		for(int i = 0; i<inputArray.length; i++) {
//			System.out.println(remainArray[i]);
//		}
		
		System.out.println(hashset.size());
	}

}
