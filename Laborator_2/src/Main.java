import java.util.Scanner ;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int inputValue = input.nextInt() ;
        System.out.println("Valoarea este: " + inputValue);

        int maxInt = Integer.MAX_VALUE;
        System.out.println(maxInt+5);

        int minInt = Integer.MIN_VALUE;
        System.out.println(minInt-5);

        double maxFloat = Double.MAX_VALUE;
        System.out.println(maxFloat*3);

        double maxFloatNr2=Double.MAX_VALUE;
        System.out.println(maxFloatNr2/3);

        System.out.println();

        try {

            System.out.println(maxInt / inputValue);
            System.out.println(inputValue/maxInt);
            System.out.println(minInt/inputValue);
            System.out.println(inputValue/minInt);
        }

        catch(ArithmeticException exception)
        {
            System.out.println("Valoarea gresita ");
            inputValue = input.nextInt() ;
        }

        System.out.println("New value " + inputValue);

    }

}