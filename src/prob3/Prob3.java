package prob3;

import java.util.Scanner;

public class Prob3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요:");

		String s = scanner.nextLine();

		/* 나머지 코드를 구현합니다. */

		char[] a = s.toCharArray(); // String을 새로운 문자 배열로 변환하는 메소드

		for (int i = 0; i < a.length; i++) {
			for (int j = 0 ; j <= i ; j++) {
				
				if((a[j] >= 97) && (a[j] <= 122)){	// 대문자로 전환
					a[j] -= 32;
				}
				System.out.print(a[j]);
				
			}
			System.out.println();
		}

		scanner.close();
	}
}
