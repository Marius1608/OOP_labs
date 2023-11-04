public class MatriceComplexa {
    private int n;
    private int m;
    private NrComplex[][] matrice;

    public MatriceComplexa(int n, int m) {
        this.n = n;
        this.m = m;
        this.matrice = new NrComplex[n][m];
    }

    public MatriceComplexa(NrComplex[][] matrice) {
        this.n = matrice.length;
        this.m = matrice[0].length;
        this.matrice = matrice;
    }

    public NrComplex get(int row, int col) {
        return matrice[row][col];
    }

    public void set(int row, int col, NrComplex value) {
        matrice[row][col] = value;
    }

    public MatriceComplexa adunare(MatriceComplexa a){

        if (n != a.n || m != a.m) {
            System.out.println("Dimensiunile matricelor necorespunzatoare");
        }
        MatriceComplexa rezultat = new MatriceComplexa(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rezultat.set(i, j, this.get(i, j).adunare(a.get(i, j)));
            }
        }

        return rezultat;
    }

    public MatriceComplexa scadere(MatriceComplexa a) {
        if (n != a.n|| m != a.m) {
            System.out.println("Dimensiunile matricelor nu corespund pentru scădere.");
        }

        MatriceComplexa rezultat = new MatriceComplexa(n,m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rezultat.set(i, j, this.get(i, j).scadere(a.get(i, j)));
            }
        }
        return rezultat;
    }

    public MatriceComplexa inmultireCuScalar(int scalar) {

        MatriceComplexa rezultat = new MatriceComplexa(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                rezultat.set(i, j, this.get(i, j).inmultire(scalar));
        }
        return rezultat;
    }


    public void afisareMatrice() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

}