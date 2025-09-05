package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
//		각 쓰레드는 각자의 자원에 접근한다.
//		즉, 자원을 공유하지 않는다.
		
		Thread1 thread1= new Thread1("♡");
		Thread1 thread2= new Thread1("☆");
		
		thread1.start();
		thread2.start();
		
		Runnable resource1=new Thread2();
		Runnable resource2=new Thread2();
		
		Thread thread3=new Thread(resource1, "1번 이름");
		Thread thread4=new Thread(resource2, "2번 이름");
		
		thread3.start();
		thread4.start();
	}
}
