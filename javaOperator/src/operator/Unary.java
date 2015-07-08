package operator;
/*
 * @Date : 2015.07.08
 * @Autor : me
 * @Story : 단항연산자문법
 * */


public class Unary {	
	/*
		 * 단항연산자
		*  i++(후위연산자)또는 ++i(전위연산자)
		 * */
		
	public static void main(String[] args) {
	int i=5, j=0, x=5, y=0; // 지역변수는 디폴트 값으로 초기화
	
	j=i++;
	//후위형은 변수값을 읽어온 후 연산하다.
	System.out.println("j의값 :\t"+j);
	
	// 전위형은 x의 값을 증가시키고 연산한다.
	//i=i+1;
	y= ++x;
	System.out.println("y의값 :\t"+y);
	}
}
