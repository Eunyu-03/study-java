package staticTest;

class Data {
	int data;
	static int dataS = 10;

	public Data() {
		;
	}

	public Data(int data) {
		this.data = data;
	}

	void increase() {
		System.out.println(++data);
	}

	static void increaseS() {
		System.out.println(++dataS);
	}

	public class StaticTest01 {
		public static void main(String[] args) {
			Data data1 = new Data(10);
			Data data2 = new Data(10);
            
			Data.increaseS();
			Data.increaseS();
			Data.increaseS();
			Data.increaseS();
			Data.increaseS();
            
			data2 = new Data(10);
            
			Data.increaseS();
			Data.increaseS();
			Data.increaseS();
			Data.increaseS();
			Data.increaseS();
            
			System.out.println();
			data1.increase();
			data1.increase();
			data1.increase();
			data1.increase();
			data1.increase();

			data1 = new Data(10);

			data1.increase();
			data1.increase();
			data1.increase();
			data1.increase();
			data1.increase();

		}
	}
}
