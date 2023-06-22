
class Thread1 extends Thread{
  synchronized public void run(){
        for (int i=1; i<=5; i++){
            System.out.print(i+" ");
            try {
                sleep(300);
            }catch (Exception e){
                System.out.println("Exception throw");
            }
        }
    }
}

public class Main {
    public static void main(String[] args){
        Thread1 p=new Thread1();
        Thread1 p1=new Thread1();
       p.start();
       p1.start();

    }
}