import java.util.*;

public class Question1 {
    public static void main(String[] args) {

        // define and initialize plain text
        String plain_txt = "meet me at the rooftop";
        plain_txt = plain_txt.toLowerCase();

        // define and initialize array that contains all 29 ASCII characters
        char[] Z29 = "abcdefghijklmnopqrstuvwxyz ,.".toCharArray();

        // define encryptMap and decryptMap
        HashMap<Character, Character> encryptMap = new HashMap<>();
        HashMap<Character, Character> decryptMap = new HashMap<>();

        // define a list that will store the encrypted text and decrypted text
        List<Character> encrypt_text = new ArrayList<Character>();
        List<Character> decrypt_text = new ArrayList<Character>();

        // ---------- list to store random permutations ----------
        List<Character> shuffleList = new ArrayList<Character>();

        for (char c : Z29) {
            shuffleList.add(c);
        }

        Collections.shuffle(shuffleList);
        // ------- end of list to store random permutations -------

        // ---------- initialize encryptMap ----------
        for (int i = 0; i < Z29.length; i++) {
            encryptMap.put(Z29[i], shuffleList.get(i));
        }
        // ------- end of encryptMap initializing -------

        // ---------- initialize decryptMap ---------
        for (HashMap.Entry<Character, Character> entry : encryptMap.entrySet()) {
            char v = entry.getValue();
            char k = entry.getKey();
            decryptMap.put(v, k);
        }
        // ------ end of decryptMap initializing -------

        // ---------- encryption ----------
        System.out.println("\n\nEncrypting...");
        System.out.println("plain text: " + plain_txt);
        System.out.print("cipher text: ");

        for (int i = 0; i < plain_txt.length(); i++) {
            char c = plain_txt.charAt(i);
            encrypt_text.add(encryptMap.get(c));
            System.out.print(encrypt_text.get(i));
        }
        System.out.println();
        // ------- end of encryption -------

        // --------- decryption ---------
        System.out.println("\n\nDecrypting...");
        System.out.print("cipher text: ");
        encrypt_text.forEach(System.out::print);
        System.out.println();
        System.out.print("plain text: ");

        char[] temp = new char[encrypt_text.size()];
        for (int i = 0; i < encrypt_text.size(); i++) {
            temp[i] = encrypt_text.get(i);
            decrypt_text.add(decryptMap.get(temp[i]));
            System.out.print(decrypt_text.get(i));
        }
        System.out.println();
        // ------ end of decryption ------

        System.out.println();

    }
}
