import java.util.*;

/**
 * test2
 */
public class test2 {

    public static void main(String[] args) {

        char[] Z29 = "abcdefghijklmnopqrstuvwxyz ,.".toCharArray();

        HashMap<Character, Character> encryptMap = new HashMap<>();

        List<Character> shuffleList = new ArrayList<Character>();
        for (char c : Z29) {
            shuffleList.add(c);
        }

        Collections.shuffle(shuffleList);

        for (int i = 0; i < Z29.length; i++) {
            encryptMap.put(Z29[i], shuffleList.get(i));
        }

        String plain_txt = "I am studying Data Encryption";
        plain_txt = plain_txt.toLowerCase();

        List<Character> cipher_txt = new ArrayList<Character>();

        System.out.println("\n\nEncrypting...");
        System.out.println("plain text: " + plain_txt);
        System.out.print("cipher text: ");

        for (int i = 0; i < plain_txt.length(); i++) {
            char c = plain_txt.charAt(i);
            cipher_txt.add(encryptMap.get(c));
            System.out.print(cipher_txt.get(i));
        }
        System.out.println();

        HashMap<Character, Character> decryptMap = new HashMap<>();
        char[] temp = new char[cipher_txt.size()];

        // initializing decryptMap
        for (HashMap.Entry<Character, Character> entry : encryptMap.entrySet()) {
            char v = entry.getValue();
            char k = entry.getKey();
            decryptMap.put(v, k);
        }

        System.out.println("\n\nDecrypting...");
        System.out.print("cipher text: ");
        cipher_txt.forEach(System.out::print);
        System.out.println();
        System.out.print("plain text: ");

        List<Character> decrypt_text = new ArrayList<Character>();

        for (int i = 0; i < cipher_txt.size(); i++) {
            temp[i] = cipher_txt.get(i);
            decrypt_text.add(decryptMap.get(temp[i]));
            System.out.print(decrypt_text.get(i));

        }
        System.out.println();

        System.out.println();
    }
}