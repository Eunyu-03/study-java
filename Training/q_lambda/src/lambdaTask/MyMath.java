package lambdaTask;

import java.util.Scanner;

public class MyMath {

	public static Calc operate(String oper) {
		return oper.equals("+") ? (n1, n2) -> n1 + n2 : (n1, n2) -> n1 - n2;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		OperCheck opercheck=(e)->{
			String result="";
			for (int i = 0; i < e.length(); i++) {
				if (e.charAt(i)=='+'||e.charAt(i)=='-') {
					result+=e.charAt(i);
				}
			}
			
			return result.split("");
		};
		
	}
}
