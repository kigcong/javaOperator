package ifCondintion;

import java.util.Scanner;

/*
 * @Date : 2015.07.09
 * @Autor : me
 * @Story : 사칙연산 계산 프로그램
 * */
public class ArithmeticCalc {
	/*
	 * 오더 사칙연산 계산기 덧셈, 뺄셈, 곱셈, 나눗셈(몫 : (), 나머지:()) 사칙연산 기호도 입력받음 +,*,-,/ 출력결과
	 * ===심플 계산기=== 5x5= 25 5+5= 10 6÷5= 1 (1) 5-6= -1
	 */
	public void calc(){
		//선언부
		int i=0,j=0,k=0,m=0;
		String opcode = "";
		Scanner scanner = new Scanner(System.in);
		//연산부
		System.out.println("첫번째 숫자 값을 입력하세요");
		 i = scanner.nextInt();
		 System.out.println("두번째 숫자 값을 입력하세요");
		 j = scanner.nextInt();
			System.out.println("연산자를 입력하세요");
			opcode= scanner.next();
		
		
		if (opcode.equals("+")){
			opcode="+";
			k=i+j;
		}else if(opcode.equals("-")){
			opcode="-";
			k=i-j;
		}else if(opcode.equals("*")){
			opcode="*";
			k=i*j;
		}else if(opcode.equals("/")){
			opcode="/";
			k=i/j; 
			m=i%j;
		
				
			}
			
		else{
			System.out.println("입력값이 올바르지 않습니다.");
		}
		
	 
	 System.out.println( i+opcode+j+"="+k+"("+m+")"   );
	

	 }

}
