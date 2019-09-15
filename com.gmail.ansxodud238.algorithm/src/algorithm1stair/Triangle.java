package algorithm1stair;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		/*
		 * 프로그램 명: triangle 제한시간: 1 초 삼각형 넓이를 구하는 문제이다.
		 * 
		 * 넓이 = 밑변 * 높이 / 2 입력 두 자연수가 입력으로 주어진다. 두 수는 1000 이하의 자연수이고 ,차례대로 밑변과 높이이다. 출력
		 * 넓이를 소수 이하 2 자리 ( 세 번째 자리에서 반올림 ) 까지 출력한다. 입출력 예 입력
		 * 
		 * 9 83
		 * 
		 * 출력
		 * 
		 * 373.50
		 */
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.printf("밑변과 높이를 입력해주십시오.\n");
			double base=sc.nextInt();
			double height=sc.nextInt();
			if(base<1000 && height<1000) {
				System.out.printf("삼각형의 넓이 : %.3f\n", base*height/2);
				break;
			}else {
				System.out.printf("밑변과 높이를 1000이하의 자연수를 입력해 주십시오.\n");
			}
		}
		
		
		sc.close();
	}

}
