package array;

import java.util.Scanner;

/*
 * @Date : 2015.07.13
 * @Autor : me
 * @Story : int 형 배열 입력예제
 * */
public class InputSum {
	public static void main(String[] args) {
		int sum=0,avg=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("3개의 숫자를 입력하세요");
		int[]arr = new int[3];  //3개 숫자 저장 공간 
		// 배열에 값을 입력하라고 하면 무조건 for Ctrl + space
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			
			
		}
		// 입력된 값을 합산해보세요 
		/*for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");    출력*/
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
			
		}
		System.out.println(sum);
		
		
		
		//입력된 값의 평균을 내보세요 
		System.out.println(sum/arr.length);
		
		
		
		}
	}


