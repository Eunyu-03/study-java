package castingTest;

public class Encryption {
   public static void main(String[] args) {
	   
//	  password라는 문자열 변수 선언 후 ehdjrdl1234라는 값을 지정
      String password = "ehdtjrdl1234";
//    encryptedPassword라는 암호화된 변수 선언 후 초기화, decryptedPassword라는 다시 암호화를 푼 변수 선언 후 초기화
      String encryptedPassword = "", decryptedPassword = "";
//    KEY값을 변하지 않는 상수로 선언, 3으로 지정
      final int KEY = 3;
      
//    i가 0의 초기값을 가지고 반복문 실행, 한 번 반복할 때마다 1씩 더해지며 password의 길이보다 작을 때까지만 반복
      for (int i = 0; i < password.length(); i++) {
//    	 encryptedPassword라는 변수에 password의 i번째 값(0부터 시작)*KEY값(3)을 한 결과를 더해가며 문자열을 완성
//    	  암호화되어 저장된다
         encryptedPassword += (char)(password.charAt(i) * KEY);
      }
      
//      암호화된 password를 출력
      System.out.println(encryptedPassword);
      
//      동일한 반복문을 encryptedPassword에 적용
      for (int i = 0; i < encryptedPassword.length(); i++) {
//    	  decryptedPassword라는 변수에 encrtptedPassword의 i번째 값(0부터 시작)/KEY값(3)을 한 결과를 더해가며 문자열을 완성
    	  decryptedPassword += (char)(encryptedPassword.charAt(i) / KEY);
      }
      
//      암호화가 풀린 password를 출력
      System.out.println(decryptedPassword);
      
   }
}
