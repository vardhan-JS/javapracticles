// Demonstrating Overriding
class New{
	void h1(){
		System.out.println("Hello from h1");
	}
}

class Newone extends New{
	@overriding
	void h1(){
		System.out.println("Hello From h2");
	}
}


class Main{
	public static void main(String[] args){
		Newone k = new Newone();
		k.h1();
	}
}