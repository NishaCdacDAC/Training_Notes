class Demo {
	public static void main(String[] args) {
		
		int x = 2;
		show(x);
	}

	static void show(int n) 
	{
		if(n == 0)
		return;

		System.out.println("show() called with parameter : " + n);
		show(n-1);	//recursive call
		System.out.println("show() called with parameter : " + n);
	}
}