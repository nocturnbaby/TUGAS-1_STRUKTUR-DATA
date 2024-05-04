public class nomorempat {
    public static void main(String[] args) {
        String[][] alfabet = {
            {"p", "s", "n"},
            {"w", "l", "b"},
            {"f", "r", "e"},
        };

        System.out.println("Isi array alfabet: ");
        for (int i = 0; i < alfabet.length; i++) {
            for (int j = 0; j < alfabet[i].length; j++) {
                System.out.println(alfabet[i][j] + " ");
            }
            System.out.println();
        }
    }
}
