import java.util.*;

/**
 * test2
 */
public class test2 {

    public static void main(String[] args) {

        char[] Z29 = "abcdefghijklmnopqrstuvwxyz ,.".toCharArray();

        // delete later
        // for (int i = 0; i < Z29.length; i++) {
        //     System.out.print(Z29[i] + ", ");
        // }
        // System.out.println();
        // end of delete later
        

        // Initializing a Dictionary for encryption
        Dictionary encryptDict = new Hashtable();
        HashMap<Character, Character> map = new HashMap<>(); 


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

        List<Character> eList = new ArrayList<Character>();
        for (char c : Z29) {
            eList.add(c);
        }

        Collections.shuffle(eList);

        char[] cipherArray = new char[eList.size()];
        for (int i = 0; i < eList.size(); i++) {
            cipherArray[i] = eList.get(i);
        }

        // delete later
        // for (int i = 0; i < cipherArray.length; i++) {
        //     System.out.print(cipherArray[i] + ", ");
        // }
        // System.out.println();
        // end of delete later

        for (int i = 0; i < Z29.length; i++) {
            map.put(Z29[i], cipherArray[i]);
        }

        //delete later
        // System.out.println("Value : " + encryptDict.get('k'));
        //end of delete later


        String plain_txt= "I am studying Data Encryption";
        char cipher_txt[];
        ArrayList cipher_arrayList = new ArrayList();

        System.out.println("\n\nEncrypting...");
        System.out.println("plain text: "+ plain_txt);
        System.out.print("cipher text: ");


        plain_txt = plain_txt.toLowerCase();
        for (int i = 0; i < plain_txt.length(); i++){
            char c = plain_txt.charAt(i);        
            // System.out.print(c+ " ");
            // cipher_array.get(i) = encryptDict.get(c);
            // System.out.print(encryptDict.get(c)+", ");
            
            cipher_arrayList.add(map.get(c));
            System.out.print(cipher_arrayList.get(i));

        }
        System.out.println();


        System.out.println("\n\nDecrypting...");
        System.out.print("cipher text: ");
        cipher_arrayList.forEach(System.out::print);
        System.out.println();
        System.out.print("plain text: ");


        // for(Entry<String, Integer> entry: encryptDict.entrySet()) {

        //     // if give value is equal to value from entry
        //     // print the corresponding key
        //     if(entry.getValue() == value) {
        //       System.out.println("The key for value " + value + " is " + entry.getKey());
        //       break;
        //     }
        //   }




        System.out.println();
    }
}