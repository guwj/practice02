package prob4;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		/* 구현코드 */
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		// 각각의 몫을 저장하는 배열
		int[] value = new int[10];
		
		
		
		// 금액 입력
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액 : ");
		int input = scanner.nextInt();
		
		// 계산
		for(int i= 0 ; i < money.length ; i++){
			value[i] = input / money[i];
			input = input - ( value[i] * money[i] );
		}
		
		for(int i = 0 ; i < money.length ; i++){
		System.out.println(money[i] + "원 : " + value[i]);
		}
		
		scanner.close();
	}
}
