import java.util.*;

public class Question2 {
    public static void main(String[] args) {

        // define and initialize array that contains all 29 ASCII characters
        char[] Z29 = "abcdefghijklmnopqrstuvwxyz ,.".toCharArray();

        // define encryptMap and decryptMap
        // HashMap<Character, Character> encryptMap = new HashMap<>();
        // HashMap<Character, Character> decryptMap = new HashMap<>();

        // define key map
        HashMap<Integer, Integer> keyMap = new HashMap<>();

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
        // System.out.println(m_in);
        // ------- End of take input of m -------

        // ---------- Take input of key value ----------
        System.out.print("Enter a key (ex. 43125): ");
        String key_in = input.nextLine();

        int key_arr[] = new int[key_in.length()];
        for (int i = 0; i < key_in.length(); i++) {
            key_arr[i] = Character.digit(key_in.charAt(i), 10);
            // System.out.print(key_arr[i]+", ");
        }
        // ------- end of Take input of key value -------

        // ------------ Take input of plain text ----------
        System.out.print("Enter a plain text: ");
        String plain_text = input.nextLine();

        plain_text = plain_text.toLowerCase();
        int plainTxt_length = plain_text.length();
        // System.out.println(plain_text);
        // --------- end of Take input of plain text -------

        // ---------- initialize key map ----------
        for (int i = 0; i < key_arr.length; i++) {
            keyMap.put(i + 1, key_arr[i]);
        }
        // ------- end of initialize key map -------

        // ---------- defining and initializing matrix ---------
        int m_col = m_in;
        int m_row = (int) Math.ceil((float) plainTxt_length / m_col);
        // System.out.println("check");
        char[][] matrix = new char[m_row][m_col];

        System.out.println(plainTxt_length);
        System.out.println("col is " + m_col + " and row is " + m_row);

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
        for (int i = 0; i < m_row; i++) {
            for (int j = 0; j < m_col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // ---------- end of displaying matrix -----------


        // ----------- encryption ---------
        // int element_size = matrix[0].length * matrix.length;
        // for (int i = 0; i < m_row; i++) {
        // for (int j = 0; j < m_col; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }
        // -------- end of encryption ------

    }
}
