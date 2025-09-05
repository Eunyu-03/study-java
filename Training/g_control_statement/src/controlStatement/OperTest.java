package controlStatement;

public class OperTest {

	public static void main(String[] args) {
		//1~10 중 4까지만 출력하기 위해 3일 때(i+1이 4) break
		for(int i=0; i<10; i++) {
			System.out.println(i+1);
			if(i==3) {
				break;
			}
		}
		
		//1~10 중 4 빼고 출력하기 위해 3일 때(i+1이 4) continue로 출력을 생략
		for(int i=0; i<10; i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i+1);
		}
	}

}
