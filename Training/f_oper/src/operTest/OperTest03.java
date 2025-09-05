package operTest;

public class OperTest03 {

	public static void main(String[] args) {
		int data=10;
		
//		data에 1을 더해 다시 담았으므로 data=11이 됨
		data=data+1;
//		이 라인을 실행하고 증가하기 때문에 출력값 11
		System.out.println(data++);
//		위 라인이 끝나고 1 증가, 또 1 증가하고 이 라인을 실행하기 때문에 출력값 13 
		System.out.println(++data);
		
	}

}
