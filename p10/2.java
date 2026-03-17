// Herical inheritance
class New{
	void h1(){
		System.out.println("Hello from h1");
	}
}

class Newone extends New{
	void h2(){
		System.out.println("Hello From h2");
	}
}

class Newtwo extends New{
	void h3(){
		System.out.println("Hello From h3");
	}
}

class Main{
	public static void main(String[] args){
		Newtwo h = new Newtwo();
		Newone k = new Newone();
		h.h3();
		k.h2();
		h.h1();
		k.h1();
	}
}