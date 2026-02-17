public class logica{

static void printpatterns(int n){
   String spc=" ", srt="*"; 
   int mid =(n+1)/2;
   if(n%2==0){
   System.out.print("Enter the even no");
}
   else{
      for(int i=1;i<=mid;i++){
   if(i==1){
   System.out.println(spc.repeat(mid-i)+srt.repeat(1));
}
   else{
   System.out.println(spc.repeat(mid-i)+srt.repeat(1)+spc.repeat(2*i-3)+srt.repeat(1));
}
}
     for (int i = mid - 1; i >= 1; i--){
   if(i==1){
   System.out.println(spc.repeat(mid-i)+srt.repeat(1));
}
   else{
   System.out.println(spc.repeat(mid-i)+srt.repeat(1)+spc.repeat(2*i-3)+srt.repeat(1));
}
}

}
  
}

    public static void main(String[] args){
    printpatterns(11);
}

}