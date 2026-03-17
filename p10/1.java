// demonstrating using single innheritance 

class New{
	void dog(){
		System.out.println("Dog  is an animal ");
	}
}

class Newone extends New{
	void apple(){
		System.out.println("apple is the fruit");
	}	
}
class Main{
  	public static void main(String[] args){
		Newone n = new Newone();
		n.dog();
		n.apple();
	}
}

