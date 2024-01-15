public class Multithread extends Thread{
    public void run(){
        try{
            System.out.println("Theread " + this.getId()+ " ruleaza!");
        }
        catch (Exception e){
            System.out.println("Execptie prinsa!");
        }
    }
}
