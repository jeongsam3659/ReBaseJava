package udmy.act16.interface2;

public class Project {
	
	interface Test {
		void nothing1();
		default void nothing2() {
			
		}
	}
	
	class Class1 implements Test{

		@Override
		public void nothing1() {
			
		}
		
	}
	
	class Class2 implements Test{

		@Override
		public void nothing1() {
			
		}
		
	}

	public static void main(String[] args) {
		ComplexAlgorithm algorithm = new DummtAlgorithm();
		System.out.println(algorithm.Calorithm(10, 20));
	}

}
