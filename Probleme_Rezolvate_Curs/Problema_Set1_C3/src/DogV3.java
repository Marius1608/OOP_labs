public class DogV3 {

    private int size;
    private String name;

    public int getSize() {
        return size;
    }
    public String getName(){
        return name;
    }

    public void setSize(int size){
        this.size=size;
    }

    public void setName(String name){
        this.name=name;
    }

    public DogV3(){
        this.name="";
        this.size=0;

    }

    public DogV3(int s,String n) {
        this.name=n;
        this.size=s;
    }


    @Override
    public String toString() {
        return "DogV3 " + "size=" +size +" name="+name;

    }
}
