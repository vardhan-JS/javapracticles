interface I{
	static int x = 10;
}

interface J{
	final int y=69;
}

class Main implements I,J{
	void display(){
	System.out.println("Hello form I"+ x);
	System.out.println("Hello from J"+ y);
}
	public static void main(String[] args){
		Main n = new Main();
		n.display();
	}
}