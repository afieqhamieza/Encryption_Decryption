import java.util.*;

public class Question2 {
    public static void main(String[] args) {

        // define and initialize array that contains all 29 ASCII characters
        char[] Z29 = "abcdefghijklmnopqrstuvwxyz ,.".toCharArray();

        // define key map
        HashMap<Integer, Integer> encryptMap = new HashMap<>();
        HashMap<Integer, Integer> decryptMap = new HashMap<>();

        // define a list that will store the encrypted text and decrypted text
        List<Character> encrypt_text = new ArrayList<Character>();
        List<Character> decrypt_text = new ArrayList<Character>();

        // define padding
        char padding = '-';

        // defining scanner
        Scanner input = new Scanner(System.in);

        // ---------- Take input of m ----------
        System.out.print("Enter value of m: ");
        int m_in = input.nextInt();
        input.nextLine();
        // ------- End of take input of m -------

        // ---------- Take input of key value ----------
        System.out.print("Enter a key (ex. 43125): ");
        String key_in = input.nextLine();

        int key_arr[] = new int[key_in.length()];
        for (int i = 0; i < key_in.length(); i++) {
            key_arr[i] = Character.digit(key_in.charAt(i), 10);
        }
        // ------- end of Take input of key value -------

        // ------------ Take input of plain text ----------
        System.out.print("Enter a plain text: ");
        String plain_text = input.nextLine();

        plain_text = plain_text.toLowerCase();
        int plainTxt_length = plain_text.length();
        // --------- end of Take input of plain text -------

        // ---------- initialize encrypt map ----------
        for (int i = 0; i < key_arr.length; i++) {
            encryptMap.put(i + 1, key_arr[i]);
        }
        // ------- end of initialize encrypt map -------

        // ---------- defining and initializing matrix ---------
        int m_col = m_in;
        int m_row = (int) Math.ceil((float) plainTxt_length / m_col);

        char[][] matrix = new char[m_row][m_col];

        for (int i = 0; i < m_row; i++) {
            for (int j = 0; j < m_col; j++) {
                matrix[i][j] = padding;
            }
        }

        for (int i = 0, j = 0, k = 0; k < plainTxt_length; k++) {
            matrix[i][j] = plain_text.charAt(k);
            j++;
            if (j == m_col) {
                j = 0;
                i++;
            }
        }
        // ------- end of defining and initializing matrix ------

        // ---------- displaying matrix -----------
        // for (int i = 0; i < m_row; i++) {
        //     for (int j = 0; j < m_col; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // ---------- end of displaying matrix -----------

        // define encryptMatrix and decryptMatrix
        char[][] encryptMatrix = new char[m_row][m_col];
        char[][] decryptMatrix = new char[m_row][m_col];

        // ----------- encryption ---------
        for (int j = 0; j < m_col; j++) {
            int[] temp = new int[m_row];
            for (int i = 0; i < m_row; i++) {
                temp[i] = encryptMap.get(j + 1);
                encryptMatrix[i][temp[i] - 1] = matrix[i][j];
            }
        }
        // -------- end of encryption ------

        // ---------- displaying matrix -----------
        System.out.println("Encrypt matrix...");
        for (int i = 0; i < m_row; i++) {
            for (int j = 0; j < m_col; j++) {
                System.out.print(encryptMatrix[i][j] + " ");
            }
            System.out.println();
        }
        // ---------- end of displaying matrix -----------

        // ---------- displaying cipher text -----------
        for (int j = 0; j < m_col; j++) {
            for (int i = 0; i < m_row; i++) {
                encrypt_text.add(encryptMatrix[i][j]);
            }
        }

        for (int i = 0; i < encrypt_text.size(); i++) {
            System.out.print(encrypt_text.get(i));
        }
        // ---------- end of displaying cipher text -----------

        // ---------- initialize decryptMap ---------
        for (HashMap.Entry<Integer, Integer> entry : encryptMap.entrySet()) {
            int v = entry.getValue();
            int k = entry.getKey();
            decryptMap.put(v, k);
        }
        // ------ end of decryptMap initializing -------

        // ----------- decryptMatrix initializing ----------
        for (int j = 0; j < m_col; j++) {
            int[] temp = new int[m_row];
            for (int i = 0; i < m_row; i++) {
                temp[i] = decryptMap.get(j + 1);
                decryptMatrix[i][temp[i] - 1] = encryptMatrix[i][j];
            }
        }
        // ----------- decryptMatrix initializing ----------

        // ---------- displaying matrix -----------
        System.out.println("decrypt matrix...");
        for (int i = 0; i < m_row; i++) {
            for (int j = 0; j < m_col; j++) {
                System.out.print(decryptMatrix[i][j] + " ");
            }
            System.out.println();
        }
        // ---------- end of displaying matrix -----------

        // ---------- decrypting ----------
        for (int i = 0; i < m_row; i++) {
            for (int j = 0; j < m_col; j++) {
                if (decryptMatrix[i][j] != padding)
                    decrypt_text.add(decryptMatrix[i][j]);
            }
        }

        System.out.println("decrypting...");
        for (int i = 0; i < decrypt_text.size(); i++) {
            System.out.print(decrypt_text.get(i));
        }
        // ------- end of decrypting -------

    }
}
