package ifCondintion;

import java.util.Scanner;

/*
 * @Date : 2015.07.09
 * @Autor : me
 * @Story : if- else예제
 *  오더는 
 *  학생		국어		영어		수학		총점		평균		합격여부	
 *  -----------------------------------
 *  (홍길동)	(90)	(90)	(90)	(270)	(90)	(장학생)
 *  
 *  평균이 90점 이상이면 장학생 평균이 70점이상 _ 90점 미만이면 합격
 *  평균이 70점 미만이면 불합격
 * */

public class CalcAvgMain {
	public static void main(String[] args) {
		
		//선언부
		String name= "", msg="";
		// 점수는 연산을 해야되서 int 타입으로 정해져야 한다.
		int kor=0,eng=0,math=0,sum=0,avg=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 : ");
		name = scanner.next();
		System.out.println("국어 : ");
		kor = scanner.nextInt();
		System.out.println("영어 : ");
		eng = scanner.nextInt();
		System.out.println("수학 : ");
		math = scanner.nextInt();
		sum = kor + eng + math;
		avg = (int)sum/3;
		//연산부
		if (avg>=90) {
			msg="장학생";
		} else if ((avg >= 70)&&(avg<=90)) {
			msg="합격";
		}else{
			msg="불합격";
		}
		//출력부
	
		
		System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
		System.out.println("--------------------------------------");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg+"\t"+msg);
		
	
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*int student=0, sum=0, avg=0, ok=0, a=0, b=0, c=0;
		
		String math = "", english="", literal="", name="";
		
				
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("학생 이름은?");
		name = scanner.next();
		
		r.next();
		
		
		System.out.println("영어점수를 입력하시오");
		english = scanner.next();
		
		System.out.println("수학점수를 입력하시오");
		
		
		System.out.println("국어점수를 입력하시오");
		literal = scanne
		math = scanner.next();
		
		sum = a+b+c;
	
		avg = sum/3;
		
		
		
		
			if (avg >= 90) {
				
				System.out.println("장학생");
				
			} else if ((avg >= 70) || (avg <= 90)) {
				System.out.println("합격");
				
				else
				{
					System.out.println("불합격");
				

			}

}
}
}*/