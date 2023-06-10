class Test{
	static int a = 20;
	int b = 30;
	void m1(){
		
	}
		public static void main(String[] args) {
			System.out.println(a);
			System.out.println(Test.a);
			Test t = new Test();
			t.m1();
			System.out.println(t.a);
		
	}
}