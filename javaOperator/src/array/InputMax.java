package array;

import java.util.Scanner;

/*
 * @Date : 2015.07.13
 * @Autor : me
 * @Story : int 형 배열 입력값 중 최대값 구하기
 * */

public class InputMax {
	public static void main(String[] args) {
		System.out.println("3개의 점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String message = "";
		int max = 0;

		// 배열선언 및 초기화
		// for-loop으로 입력 받고
		// 비교로직은 if 문을 사용하세요.
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();

		if(arr[i]>max){
			max = arr[i];
		}
	}

		
		System.out.println(max);

	}

}







