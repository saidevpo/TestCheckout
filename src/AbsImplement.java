

public class AbsImplement extends AbsTest{

	@Override
	void m1() {
		System.out.println("abstract method 1"); 	
	}

	@Override
	void m2() {
		System.out.println("abstract method 2");
		System.out.println("abstract method 2 updated");
		
	}
	
	public static void main(String[] args) {
		AbsTest T = new AbsImplement();
		T.m1();
		T.m2();
		T.m3();
	}

}
