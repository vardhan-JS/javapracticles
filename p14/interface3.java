interface I{
	default void show(){
		System.out.print("Hello Form I");
	}
}

interface J{
	default void show(){
		System.out.print("Hello From J");		
	}
}

class Test implements I,J{
	
	public void show(){
		 I.super.show();
	}
	public static void main(String[] args){
		Test g = new Test();
		g.show();
	}
}