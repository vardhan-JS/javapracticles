interface I{
	int add(int a, int b);
}

interface J{
	int y=20;
}

class Test implements I,J{
	public int add(int a, int b ){
		return a+b;
	}

	public  static void main(String[] args){
		Test m = new Test();
		int result = m.add(4,5);
		System.out.println("Addition"+ result);
	}
}