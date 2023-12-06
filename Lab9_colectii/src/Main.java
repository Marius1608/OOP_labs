import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<String> fructe=new ArrayList<>();
        fructe.add("Apple");
        String apple=fructe.get(0);
        //fructe.remove(0);
       //fructe.clear();

        for(String a: fructe){
            if(a=="Apple")
                a="Kiwi";
        }

        ListIterator<String>iterator=fructe.listIterator();
        while(iterator.hasNext()){
            String f=iterator.next();
            if (f.compareTo("Apple")==0)
                iterator.set("Orange");
        }

    }
}