public class Main {
    public static void main(String[] args) {

        String st = "ana are mere";
        int nrVocale = 0;
        int nrConsoane = 0;
        String vocale = "aeiouAEIOU";

        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            if (Character.isLetter(c)) {
                if (vocale.indexOf(c) != -1) {
                    nrVocale++;
                } else {
                    nrConsoane++;
                }
            }
        }

        System.out.println("Numărul de consoane: " + nrConsoane);
        System.out.println("Numărul de vocale: " + nrVocale);
    }
}
