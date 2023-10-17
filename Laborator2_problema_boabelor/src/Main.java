import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        int nrCasuteSah = 64; //nr de casuste 8x8
        BigInteger nrTotalBoabe = BigInteger.ZERO;
        BigInteger nrCurentDeBoabe = BigInteger.ONE;

        for (int i = 0; i < nrCasuteSah; i++) {
            nrTotalBoabe = nrTotalBoabe.add(nrCurentDeBoabe);
            nrCurentDeBoabe = nrCurentDeBoabe.multiply(BigInteger.TWO);

        }
        System.out.println("Nr boabe="+nrTotalBoabe);
    }
}