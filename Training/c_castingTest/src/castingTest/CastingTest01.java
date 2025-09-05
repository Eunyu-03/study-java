package castingTest;

public class CastingTest01 {

	public static void main(String[] args) {
//		자동 형변환
//		정수/정수의 결과를 출력
		System.out.println(5/2);
//		정수/실수의 결과를 출력
		System.out.println(5/2.0);
		
//		강제 형변환
//		정수형 변수를 실수형 변수로 형변환 후 연산
		System.out.println(5/(double)2);
//		실수형 변수를 정수형 변수로 형변환 후 연산, 소수점 아래 숫자는 없어진다.
		System.out.println((int)2.9+5);
		
//		구분을 위한 선
		System.out.println("----------------------------");
		
//		변수를 실수형으로 선언 후 값을 지정
		double num1=8.43;
		double num2=2.59;
//		각 실수형 변수를 정수형으로 변환 후 연산
		int result=(int)num1+(int)num2;
		
//		출력되는 값은 소수점 아래 숫자를 날린 후 연산된 10
		System.out.println(num1+"+"+num2+"="+result);
	}

}
