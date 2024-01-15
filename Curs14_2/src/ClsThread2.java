public class ClsThread2 implements Runnable{
    public void run(){
        try{
            ///System.out.println("Thread: " + Thread.currentThread().getId() + " ruleaza!");
            for(int i=0; i<5; i++){
                System.out.println( i +" "+ Thread.currentThread().getName() +" ID"  + Thread.currentThread().getId());
            }
        }
        catch (Exception e){
            System.out.println("Exceptie prinsa!");
        }
    }
}
