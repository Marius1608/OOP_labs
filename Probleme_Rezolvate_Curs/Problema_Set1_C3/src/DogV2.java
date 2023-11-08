public class DogV2 {
    private int size;
    private String name;

    //trebuie getter si setter de oarece variabilele instanta sunt prrivate


    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DogV2 " + "size=" + size + ", name='" + name + '\'' ;
    }
}
