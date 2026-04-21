import java.io.FileReader;
import java.io.FileNotFoundException;
class Old{
	public static void main(String args[]) throws FileNotFoundException{
		try{
			java.io.FileReader fr = new FileReader("abc");
		}
		catch(FileNotFoundExecption FnFe){
			System.out.print("File not found Exeption!");
		}
		int[] arr=new int[]{5,10,15,20};
		try{
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundException a){
	   		System.out.println("Array Bound Exception!!");
		}
		int a=10 ;
		int b=0;
		try{
			int result=10/0;
		 	System.out.print(result);
		}
		catch(ZeroDivisionException FnFe){
			System.out.print("Exception caught zero division exception!!!");
		}
		
	} 
}