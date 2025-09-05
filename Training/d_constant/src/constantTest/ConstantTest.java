package constantTest;

public class ConstantTest {
   public static void main(String[] args) {
//	   상수 ON, OFF 선언 및 값 지정
      final int ON = 187568;
      final int OFF = 187455;
      
//      각 상수 출력
      System.out.println(ON);
      System.out.println(OFF);
      
//      로그인 실패: 0
//      로그인 성공: 1
//      관리자: 2
      
//      마찬가지로 상수 선언 및 값 지정
      final int LOGIN_SUCCESS_STATUS = 0;
      final int LOGIN_FAIL_STATUS = 1;
      final int LOGIN_ADMIN_STATUS = 2;
      
//      각 상수 출력
      System.out.println(LOGIN_SUCCESS_STATUS);
      System.out.println(LOGIN_FAIL_STATUS);
      System.out.println(LOGIN_ADMIN_STATUS);
      
   }
}
