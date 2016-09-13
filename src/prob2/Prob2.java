package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "숫자를 입력하세요: " );
		
		int inputNumber = scanner.nextInt();

		/* 여기에 구현 코드를 작성 합니다. */
		
		// 총합
		int sum = 0;
		
		
		if(inputNumber % 2 == 0){		// 짝수일 경우 걸러서 합 구하기
			for(int i = 0 ; i <= inputNumber ; i++){
				if( i % 2 == 0){
					sum = sum + i;
				}
			}
		}else{							// 홀수일 경우 걸러서 합 구하기
			for(int i = 0 ; i <= inputNumber ; i++){
				if( i % 2 != 0){
					sum = sum + i;
				}
			}
		}
		
		System.out.println("결과 값 : " + sum);
		
		
		scanner.close();
	}

}
