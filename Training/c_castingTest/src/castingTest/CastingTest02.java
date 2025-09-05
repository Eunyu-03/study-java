package castingTest;

public class CastingTest02 {
	public static void main(String[] arg) {
		
//		좌->우로 읽어들이기 때문에 공백+3->"3"이라는 문자열, 3+8->"3"이라는 문자열+8이므로 38로 출력됨
		System.out.println(""+3+8);
		
//		마찬가지로 3+8->11이라는 정수, 11+공백->"11"이라는 문자열로 출력됨
		System.out.println(3+8+"");

//		정수형 변수 result를 선언 후 4라는 값을 지정
		int result=4;
//		문자열과 변수의 값을 명령어 한 줄로 출력하기 위해선 괄호 안에서 +로 이어 준다.
		System.out.println("1+3="+result);
	}
}
