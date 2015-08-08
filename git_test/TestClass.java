class TestClass {
	TestClassChild ch;
	
	public TestClasss(){
		
		ch = new TestClassChild();
		
		
	}
	public static void main(String [] args) {
		TestClass tc = new TestClass();
		tc.ch.Show("Hello Helper class with Interface");
		
		System.out.println("Hi! Testing git");
	}

}
