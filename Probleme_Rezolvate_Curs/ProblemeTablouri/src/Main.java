
public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{1, -11, -1, 2, 4, 1, 4, 234, 2, 1, -9, -121};
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) System.out.println(array[i]);
        }
        System.out.println();

        String[] vector = new String[]{"ana", "cornel", "George", "Amadeus"};
        for (String i : vector) {
            System.out.println(i);
        }

        for (String i : vector) {
            if (Character.isUpperCase(i.charAt(0)))
                System.out.println(i);
        }

        double[][] matrice = new double[][]{
                {1.1, 21.2, 2.1},
                {12, 112, 1, 1},
                {1.12, 12, 11, 9},
                {9.0, 1.2, 12, 1},
        };

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0; i<matrice.length; i++){
            System.out.println(matrice[i][i]);
        }

    }
}