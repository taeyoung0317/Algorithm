package algorithm1stair;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		/*
		 * 프로그램 명: swap 제한시간: 1 초 두 정수를 입력으로 받아 수를 교환하는 프로그램을 작성하시오. 입력 두 정수가 입력으로 주어진다.
		 * 출력 두 정수를 바꾸어서 출력한다. 입출력 예 입력
		 * 
		 * 10 20
		 * 
		 * 출력
		 * 
		 * 20 10
		 * 
		 * 입력
		 * 
		 * 5 1
		 * 
		 * 출력
		 * 
		 * 1 5
		 */
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.printf("자리를 변경할 두 정수를 입력해주십시오.\n");
			int first = sc.nextInt();
			int second = sc.nextInt();
			int c = 0;
			if (first > 0 && second > 0) {
				c = first;
				first = second;
				second = c;
				System.out.printf("first : %d, second : %d \n", first, second);
				break;
			} else {
				System.out.printf("0이상의 정수를 입력하여 주십시오.\n");
			}

		}

		sc.close();
	}

}
