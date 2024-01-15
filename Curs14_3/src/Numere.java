public class Numere {
    public void negatve(int k){
        for(int i=-k,cnt=0; i<0; i++,cnt++){
            System.out.println("Nr negativ: " + i);
            if(cnt==2){
                try {
                    Thread.sleep(10000);
                }catch (Exception e){
                    System.out.println("Exceptie Tratata !");
                }
            }
        }
    }
    public void pozitive(int k){
        for(int i=0; i<k; i++){
            System.out.println("Nr pozitiv: " +i);
        }
    }
}
