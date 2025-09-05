package interfaceTest;

public class Simul {
	public static void main(String[] args) {
		Puppy puppy=new Puppy();
		Cat kitty=new Cat();
		Tiger tiny=new Tiger();
		
		puppy.showHands();
		puppy.poop();
		puppy.sitDown();
		
		kitty.showHands();
		kitty.poop();
		kitty.sitDown();
		
//		아무것도 출력되지 않음
		tiny.showHands();
		tiny.poop();
//		아무것도 출력되지 않음
		tiny.sitDown();
	}
}
