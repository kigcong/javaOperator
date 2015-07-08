package ifCondintion;

public class IfElse {
	public static void main(String[] args) {
		int x=1, y=2; // 지변 초기화
		if ((x==1)&&(y==1)) { // &&엔퍼센트 읽으시고 and연산자
			System.out.println("x는 1이면서, y도 2이다.");
		}else if ((x==3)||(y==3)) {//|| 컬럼 읽으시고 or 연산자
			System.out.println("x는 1이거나, y는 2이다.");
		}else{
			System.out.println("해당 상황이 없습니다.");
		}
	}
}
