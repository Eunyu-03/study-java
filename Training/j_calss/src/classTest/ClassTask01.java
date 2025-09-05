package classTest;

// 동물이 3마리 있다.
// 모든 동물은 이름, 나이, 성별이 있다.
// 3마리 동물은 각자 자기소개를 할 수 있다.
// 클래스를 활용하여 3마리 동물이 자기소개할 수 있게 구현한다.

class Animal{
	
	String name;
	int age;
	String gender;
	
	public Animal(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	void introducePrint(){
		System.out.println("안녕하세요. 재 이름은 "+this.name+", 나이는 "+this.age+"살, 성별은 "+this.gender+"입니다.");
	}
}

public class ClassTask01 {
	public static void main(String[] args) {
		Animal animal1=new Animal("사자", 30, "남성");
		Animal animal2=new Animal("오리", 15, "여성");
		Animal animal3=new Animal("개", 3, "남성");
		
		animal1.introducePrint();
		animal2.introducePrint();
		animal3.introducePrint();
		
	}
}
