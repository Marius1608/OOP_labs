import static java.lang.System.arraycopy;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        int [] arr=new int[]{1,2,3};
        int [] r=arr; //shellow copy
        r[1]=500;
        System.out.println(arr[1]);

        int []t;//deep copy
        //t = arraycopy(r);

        int s=0,dr=arr.length-1;
        while (s<dr){
            int temp=arr[s];
            arr[s]=arr[dr];
            arr[dr]=temp;
            s++;
            dr--;
        }

        for(int i:arr){
            System.out.println(i);
        }

        int [][]matrice =new int[3][3];
        int rows= matrice.length;
        int cols=matrice[0].length;
    }
}