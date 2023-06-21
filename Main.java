class A{
   synchronized void add(int n) throws Exception
    {
     for(int i=1; i<=5; i++){
         System.out.print(i*n+" ");
             Thread.sleep(1000);
     }
    }
}
class B extends Thread{
    A i;
      B(A i){
          this.i=i;
      }
      public void run(){
          try {
              i.add(5);
          }catch (Exception e){

          }

      }
}
class C extends Thread{
    A i;
    C(A i){
        this.i=i;
    }
    public void run(){
        try {
            i.add(6);
        }catch (Exception e){

        }
    }
}
public class Main {
    public static void main(String[] args) {
        A p=new A();
        B k=new B(p);
        C k1=new C(p);

        try {
            k.start();
            k1.start();
        }catch (Exception e){}
    }
}