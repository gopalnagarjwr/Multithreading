class Thread2 implements Runnable{
      int n;
    Thread2(int i){
        this.n=i;
    }
      public void run() {
          for (int i = 1; i <= 5; i++) {
              System.out.print(i*n + " ");
              try{
                  Thread.sleep(500);
              }catch (Exception e){

              }
          }
      }

}

public class Runable {
    public static void main(String[] args){
        Thread2 p=new Thread2(2);
        Thread2 p1=new Thread2(3);
        Thread t=new Thread(p);
        Thread t1=new Thread(p1);
        t.start();
        t1.start();

    }
}