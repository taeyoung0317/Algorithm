package algorithm1stair;

import java.util.Scanner;

public class M2S {

	public static void main(String[] args) {
		/*
		 * 프로그램 명: m2s 제한시간: 1 초 분을 입력으로 받아 초로 변환하는 프로그램을 작성하시오.
		 * 
		 * 입력 분 m 이 자연수로 주어진다. ( 1 <= m <= 60) 출력 변환 된 초를 출력 예의 형식으로 출력한다. 출력을 간단히 하기 위해
		 * 1 분도 1 minutes 로 쓰기로 한다. 입출력 예 입력
		 * 
		 * 2
		 * 
		 * 출력
		 * 
		 * 2 minutes is 120 seconds.
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.printf("분 단위의 숫자를 초단위로 변경할 m값 : \n");
		int m = sc.nextInt();
		if(1<=m && m<=60) {
			System.out.printf("%d분을 초 단위로 변경하면 %d초 입니다.\n",m,m*60);
			break;
		}else {
			System.out.printf("m의 값을 1부터 60까지의 정수를 입력해주십시오.\n");
		}
		}
		sc.close();
	}

}
