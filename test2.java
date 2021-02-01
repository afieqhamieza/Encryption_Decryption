import java.util.*;

/**
 * test2
 */
public class test2 {

    public static void main(String[] args) {

        char[] Z29 = "abcdefghijklmnopqrstuvwxyz ,.".toCharArray();

        // delete later
        // for (int i = 0; i < Z29.length; i++) {
        // System.out.print(Z29[i] + ", ");
        // }
        // System.out.println();
        // end of delete later

        // Initializing a Dictionary for encryption
        // Dictionary encryptDict = new Hashtable();
        HashMap<Character, Character> encryptMap = new HashMap<>();

        // choosing random numbers for key
        // int size = Z29.length;

        // ArrayList<Integer> list = new ArrayList<Integer>(size);
        // ArrayList<Integer> randElement = new ArrayList<Integer>(size);
        // for (int i = 1; i <= size; i++) {
        // list.add(i);
        // }

        // Random rand = new Random();
        // while (list.size() > 0) {
        // int index = rand.nextInt(list.size());
        // randElement.add(list.remove(index));
        // }

        List<Character> shuffleList = new ArrayList<Character>();
        for (char c : Z29) {
            shuffleList.add(c);
        }

        Collections.shuffle(shuffleList);

        // char[] cipherArray = new char[shuffleList.size()];
        // for (int i = 0; i < shuffleList.size(); i++) {
        //     cipherArray[i] = shuffleList.get(i);
        // }

        // delete later
        // for (int i = 0; i < cipherArray.length; i++) {
        // System.out.print(cipherArray[i] + ", ");
        // }
        // System.out.println();
        // end of delete later

        for (int i = 0; i < Z29.length; i++) {
            encryptMap.put(Z29[i], shuffleList.get(i));
        }

        // delete later
        // System.out.println("Value : " + encryptDict.get('k'));
        // end of delete later

        String plain_txt = "I am studying Data Encryption";
        plain_txt = plain_txt.toLowerCase();

        // char cipher_txt[];
        // ArrayList cipher_arrayList = new ArrayList();
        List<Character> cipher_txt = new ArrayList<Character>();

        System.out.println("\n\nEncrypting...");
        System.out.println("plain text: " + plain_txt);
        System.out.print("cipher text: ");

        for (int i = 0; i < plain_txt.length(); i++) {
            char c = plain_txt.charAt(i);
            // System.out.print(c+ " ");
            // cipher_array.get(i) = encryptDict.get(c);
            // System.out.print(encryptDict.get(c)+", ");

            cipher_txt.add(encryptMap.get(c));
            System.out.print(cipher_txt.get(i));

        }
        System.out.println();

        // System.out.println(encryptMap.getKey('a'));

        // for (HashMap.Entry<Character, Character> entry : encryptMap.entrySet()) {
        // if (entry.getValue().equals('a')) {
        // System.out.println(entry.getKey());
        // }
        // }

        HashMap<Character, Character> decryptMap = new HashMap<>();
        char[] temp = new char[cipher_txt.size()];

        // initializing decryptMap
        for (HashMap.Entry<Character, Character> entry : encryptMap.entrySet()) {
            // if (entry.getValue() == 'a') {
            // System.out.println("The key for value is " + entry.getKey());
            // break;
            // }

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
            // System.out.print(cipher_arrayList.get(i));
            temp[i] = cipher_txt.get(i);
            // System.out.print(c+ " ");
            // cipher_array.get(i) = encryptDict.get(c);
            // System.out.print(encryptDict.get(c)+", ");

            // if (entry.getValue() == 'a') {
            //     System.out.println("The key for value is " + entry.getKey());
            //     break;
            // }
            decrypt_text.add(decryptMap.get(temp[i]));
            System.out.print(decrypt_text.get(i));
            // System.out.print(temp[i]);

        }
        System.out.println();

        

        System.out.println();
    }
}