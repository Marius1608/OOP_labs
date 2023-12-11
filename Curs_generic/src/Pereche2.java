public class Pereche2 <T extends Number>{

    private T first;
    private T second;

    public Pereche2(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pereche " + "first=" + first + ", second=" + second;
    }

    public <V> void afisareDuala(V a){
        System.out.format("first:%s second %s %n" , this.toString(),a.toString());
    }

    public <V> void afisareCuPereche(Pereche<V>another){
        System.out.format("first:%s second %s,%s %n",this.toString(),another.getFirst().toString(),another.getSecond().toString());
    }

    public<V,X>void afisareCuPereche(Pereche<V>a,X b){
        System.out.format("First %s,Second %s Third %s %n",this,toString(),a.toString(),b.toString());
    }

}
