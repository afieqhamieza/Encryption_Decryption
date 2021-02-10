import java.util.*;

public class Question1_1 {

    public static void main(String[] args) {
        char[] Z32 = "abcdefghijklmnopqrstuvwxyz .,?()".toCharArray();

        String text = "cryptography";
        text = text.toLowerCase();

        List<Integer> index_in = new ArrayList<Integer>();

        
        for (int i = 0; i < text.length(); i++) {
            System.out.println();
            char c = text.charAt(i);
            
            for (int j = 0; j < Z32.length; i++){
                if (c == Z32[j]) {
                    index_in.add(j);
                }
            }
        }

        System.out.println(index_in);
    }
}