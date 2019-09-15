package algorithm1stair;

import java.util.Scanner;

public class Op {

	public static void main(String[] args) {
		/*
		 * 프로그램 명: op 제한시간: 1 초 두 자연수 a,b 를 입력으로 받아 a+b(합),a-b(차),a*b(곱),a/b(몫),a%b(나머지)
		 * 를 구하는 프로그램을 작성하시오. a 가 5 이고 , b 가 3 이면
		 * 
		 * 5+3=8 5-3=2 5*3=15 5/3=1 5%3=2 입력 두 수 a,b 는 1000 이하이다. 출력 숫자와 연산자 사이에 공백이 없이
		 * 출력 예의 형식으로 출력한다. 입출력 예 입력
		 * 
		 * 3 5
		 * 
		 * 출력
		 * 
		 * 3+5=8 3-5=-2 3*5=15 3/5=0 3%5=3
		 */

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.printf("자연수 2개를 입력해주십시오 : \n");
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x < 1000 && y < 1000) {
				System.out.printf("x+y=%d\n", x + y);
				System.out.printf("x-y=%d\n", x - y);
				System.out.printf("x*y=%d\n", x * y);
				System.out.printf("x/y=%d\n", x / y);
				System.out.printf("x/y의 나머지 값 : %d\n", x % y);
				break;
			} else {
				System.out.printf("x와 y의 값을 1000이하의 자연수로 입력하여 주십시오.\n");
			}

		}
		sc.close();
	}

}
