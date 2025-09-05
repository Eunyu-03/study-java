package methodTest;

public class MethodTask02 {
	
//	5개의 정수를 입력받고 최대값과 최소값을 구해 주는 메소드
	
	int[] maxMin(int[] num) {
		int max=num[0];
		int min=num[0];
		int[] result=new int[2];
		for(int i=0; i<num.length-1; i++) {
			if(num[i]<num[i+1]) {
				max=num[i+1];
			}
			if(num[i]>num[i+1]) {
				min=num[i+1];
			}
		}
		result[0]=max;
		result[1]=min;
		return result;
	}
	
	public static void main(String[] args) {
		MethodTask02 methodTest02=new MethodTask02();
		
		int[] result=methodTest02.maxMin(new int[] {1, 2, 3, 4, 5});
		System.out.println(result[0]);
		System.out.println(result[1]);
	}

}
