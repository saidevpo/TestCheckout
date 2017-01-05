

public abstract class AbsTest {

	/*
	 *1) Abstract classes can have abstract as well as non abstract methods
	 *2) Cannot create object for the abstract class
	 *3) Abstract methods end with semicolon	 * 
	 * */
	AbsTest(){
		System.out.println("Abstract constructor");
	}
	abstract void m1();
	abstract void m2();
	void m3(){
		System.out.println("Direct method");
	}
}
