class PerformanceEvaluator{
     
      static void f1(){
      for(int i=0;i<25;i++){
       System.out.println(2000000);
      }
    }
     static void f2(){
     System.out.println(2000000);
     System.out.println(2000000);
     System.out.println(2000000);
     System.out.println(2000000);ra
     System.out.println(2000000);
     System.out.println(2000000);
     System.out.println(2000000);
     System.out.println(2000000);
     System.out.println(2000000);
     System.out.println(2000000);
     System.out.println(2000000);
     System.out.println(2000000);
     System.out.println(2000000);
     System.out.println(2000000);
     System.out.println(2000000);
     System.out.println(2000000);
     System.out.println(2000000);
     System.out.println(2000000);
     System.out.println(2000000);
     System.out.println(2000000);
     System.out.println(2000000);
     System.out.println(2000000);
     System.out.println(2000000);
     System.out.println(2000000);
     System.out.println(2000000);


    }
  public static void main(String[] args){
   double f1avg,f2avg;
   long f1tt=0,f2tt=0;
   long st,et;
   int nooftimes=40;

for(int i=0;i<nooftimes;i++){
    st=System.currentTimeMillis();
    f2();
    et=System.currentTimeMillis();
    f2tt+=et-st;
}
   f2avg= f2tt/(double)nooftimes;

   for(int i=0;i<nooftimes;i++){
    st=System.currentTimeMillis();
    f1();
    et=System.currentTimeMillis();
    f1tt+=et-st;
}
   f1avg= f1tt/(double)nooftimes;

   System.out.print("Time taken by f2:");
   System.out.println( f2tt);
   System.out.print("Avg Time taken by f2:");
   System.out.println( f2avg);
   System.out.print("Time taken by f1:");
   System.out.println(f1tt);
   System.out.print("Avg Time taken by f1:");
   System.out.println(f1avg);
}

}