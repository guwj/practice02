package prob5;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        int intArray[] = new int[5];
        double sum = 0;
        System.out.println("5개의 숫자를 입력하세요.");
        
        // 입력된 숫자 5개 배열에 저장
        for(int i = 0 ; i < intArray.length ; i++){
        	intArray[i] = in.nextInt();
        }
       
        // 입력된 숫자 5개 합
        for( int value : intArray){
        	sum = sum + value;
        }
        
        // 평균값 출력
        System.out.println("평균은 " + sum/5 + "입니다");
	}

}
