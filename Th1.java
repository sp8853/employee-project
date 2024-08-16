
public class Th1 extends Thread{
    public void MyThread(){
        System.out.println("The Thread is running...");
        try{
        Thread.sleep(3000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("wait is over now");
        try{
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("ho ghya wait khatam");
    }
    public static void main(String[] args) {
     Th1 as = new Th1();
     as.MyThread();   
    }
}