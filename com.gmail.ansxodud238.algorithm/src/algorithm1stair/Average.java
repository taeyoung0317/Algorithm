package algorithm1stair;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		/*
		 * 프로그램 명: average 제한시간: 1 초 네 정수를 입력 받아 평균을 출력하는 프로그램을 작성하세요. 정수 입력 사이에는 공백으로
		 * 구분되며 , 평균은 소수 2 째 자리까지 출력하세요.(소수 3 번째 자리에서 반올림)
		 * 
		 * 입력 입력은 1 에서 100 사이의 자연수가 입력된다. 출력 입출력 예 입력
		 * 
		 * 7 7 7 7
		 * 
		 * 출력
		 * 
		 * 7.00
		 * 
		 * 입력
		 * 
		 * 2 5 9 5
		 * 
		 * 출력
		 * 
		 * 5.25
		 */
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.printf("1부터 100까지의 숫자 네개를 입력해주십시오.\n");
			double a = sc.nextInt();
			double b = sc.nextInt();
			double c = sc.nextInt();
			double d = sc.nextInt();
			if (0 < a && a <= 100 && 0 < b && b <= 100 && 0 < c && c <= 100 && 0 < d && d <= 100) {
				System.out.printf("네 정수의 평균값 : %.3f\n", (a + b + c + d) / 4);
				break;
			} else {
				System.out.printf("1부터 100까지의 자연수를 입력해 주십시오.\n");
			}
		}
		sc.close();
	}
}
