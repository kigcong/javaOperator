package variable;
/*
 * @Date : 2015.07.07
 * @Autor : me
 * @Story : 연산 코드에 관한 문법
 * */
public class Total {
	public static void main(String[] args) {
		// 국어점수는 데이터 타입이 정수이다.
		// 변수명은 kor
		// 할당도니 값은 80
		//int kor = 80;
		//int eng = 70;
		//int math =50;
		// 같은 데이터 타입의 변수를 여러개
		// 선언과 할당할때는 다음과 같이 한다.
			int kor=60,eng=60,math=60;
			int total = 0; //지역 변수 초기화
			total = kor + eng +math; //지역변수 연산
			int avg = 0;//평균 구하기 : 총좀 / 과목수
			avg = total/3;
			System.out.println("총점 :"+total);
			System.out.println("평균 :"+avg);
			
}
}
