package prob4;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		/* 구현코드 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액 : ");

		// 입력된 금액을 저장하는 변수
		int money = scanner.nextInt();

		// 각 몫을 저장하는 배열
		int[] mok = new int[10];

		// 나누는 값
		int a = 50000;
		int b = 10000;

		// 계산 알고리즘

		if (money / a != 0) { // 5만원
			mok[0] = money / a;
			money = money - mok[0] * a;
			a = a / 10;
		} else if (money / b != 0) { // 1만원
			mok[1] = money / b;
			money = money - mok[1] * a;
			b = b / 10;
		} else if (money / a != 0) { // 5천원
			mok[2] = money / a;
			money = money - mok[2] * a;
			a = a / 10;
		} else if (money / b != 0) { // 1천원
			mok[3] = money / b;
			money = money - mok[3] * a;
			b = b / 10;
		} else if (money / a != 0) { // 5백원
			mok[4] = money / a;
			money = money - mok[4] * a;
			a = a / 10;
		} else if (money / b != 0) { // 1백원
			mok[5] = money / b;
			money = money - mok[5] * a;
			b = b / 10;
		} else if (money / a != 0) { // 50원
			mok[6] = money / a;
			money = money - mok[6] * a;
			a = a / 10;
		} else if (money / b != 0) { // 10원
			mok[7] = money / b;
			money = money - mok[7] * a;
			b = b / 10;
		} else if (money / a != 0) { // 5원
			mok[8] = money / a;
			money = money - mok[8] * a;
			a = a / 10;
		} else if (money / b != 0) { // 1원
			mok[9] = money / b;
			money = money - mok[9] * a;
			b = b / 10;
		}
		
		System.out.println("5만 : " + mok[0] +" 1만 : " + mok[1] + " 5천 : " + mok[2] + " 1천 : " + mok[3]+ " 100원 : " + mok[4]+ " 50원 : " + mok[5] + " 10원 : " + mok[6] );

	}
}
