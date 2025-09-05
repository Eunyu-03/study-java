package methodTest;

public class MethodTask01 {
	
//	(1) A~Z까지 출력하는 메소드
	
	void aToZ() {
		for(int i=0; i<26; i++) {
			System.out.print((char)(i+65));
		}
		System.out.println("");
	}
	
//	(2) aceg...y까지 출력하는 메소드
	
	void aToY() {
		for(int i=0; i<13; i++) {
			System.out.print((char)(i*2+97));
		}
		System.out.println("");
	}
	
//	(3) 특수문자, 숫자, 알파벳의 아스키 코드를 찾아 주는 메소드
	
	String ascii(char ascii) {
		String result;
		if(!((int)ascii>=0&&(int)ascii<=127)) {
			result="Error";
		}
		else {
			result=String.format("%d", (int)ascii);
		}
		return result;
		
	}
	
//	(4) 정수 계산기 메소드
	
	String calculator(int num1, char oper, int num2) {
		String result;
		if (oper=='+') {
			result=String.format("%d", num1+num2);
		}
		else if(oper=='-') {
			result=String.format("%d", num1-num2);
		}
		else if(oper=='*') {
			result=String.format("%d", num1*num2);
		}
		else if(oper=='/') {
			if(num2==0) {
				result="error";
			}
			else {
				result=String.format("%d", num1/num2);
			}
		}
		else if(oper=='%') {
			result=String.format("%d", num1%num2);
		}
		else {
			result="error";
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		MethodTask01 methodtask=new MethodTask01(); 
		
//		(1) 구현
		methodtask.aToZ();
		
//		(2) 구현
		methodtask.aToY();
		
//		(3) 구현
		System.out.println(methodtask.ascii('s'));
		
//		(4) 구현
		System.out.println(methodtask.calculator(3, '*', 5));
		
	}

}
