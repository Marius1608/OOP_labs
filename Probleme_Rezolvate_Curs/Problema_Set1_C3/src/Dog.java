public class Dog {
    int size;
    String name;

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog " + "size=" + size + ", name='" + name + '\'';
    }
}
