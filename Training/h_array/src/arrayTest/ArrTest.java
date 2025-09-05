package arrayTest;

public class ArrTest {
	public static void main(String[] args) {
		int [] [] arrData= {
				{3, 4, 5},
				{7, 8, 9}
		};
		
		System.out.println(arrData[0][0]);
		
		int rowLength=arrData.length;
		int colLength=arrData[0].length;
		int length=rowLength*colLength;
		
		for(int i=0; i<rowLength; i++) {
			for(int j=0; j<colLength; j++) {
				System.out.println(arrData[i][j]);
			}
		}
	}
}
