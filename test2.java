// // Java program for encoding the string

// import java.util.Scanner; // Import the Scanner class
// public class test2
// {

//    // Function generates the encoded text
//    static String encoder(char[] key)
//    {
//        String encoded = "";
      
//        // This array represents the
//        // 26 letters of alphabets
//        boolean[] arr = new boolean[26];

//        // This loop inserts the keyword
//        // at the start of the encoded string
//        for (int i = 0; i < key.length; i++)
//        {
//            if (key[i] >= 'A' && key[i] <= 'Z')
//            {
//                // To check whether the character is inserted
//                // earlier in the encoded string or not
//                if (arr[key[i] - 65] == false)
//                {
//                    encoded += (char) key[i];
//                    arr[key[i] - 65] = true;
//                }
//            }
//            else if (key[i] >= 'a' && key[i] <= 'z')
//            {
//                if (arr[key[i] - 97] == false)
//                {
//                    encoded += (char) (key[i] - 32);
//                    arr[key[i] - 97] = true;
//                }
//            }
//        }

//        // This loop inserts the remaining
//        // characters in the encoded string.
//        for (int i = 0; i < 26; i++)
//        {
//            if (arr[i] == false)
//            {
//                arr[i] = true;
//                encoded += (char) (i + 65);
//            }
//        }
//        return encoded;
//    }

//    // Function that generates encodes(cipher) the message
//    static String cipheredIt(String msg, String encoded)
//    {
//        String cipher = "";

//        // This loop ciphered the message.
//        // Spaces, special characters and numbers remain same.
//        for (int i = 0; i < msg.length(); i++)
//        {
//            if (msg.charAt(i) >= 'a' && msg.charAt(i) <= 'z')
//            {
//                int pos = msg.charAt(i) - 97;
//                cipher += encoded.charAt(pos);
//            }
//            else if (msg.charAt(i) >= 'A' && msg.charAt(i) <= 'Z')
//            {
//                int pos = msg.charAt(i) - 65;
//                cipher += encoded.charAt(pos);
//            }
//            else
//            {
//                cipher += msg.charAt(i);
//            }
//        }
//        return cipher;
//    }   // Driver code
//    public static void main(String[] args)
//    {
      
//         Scanner myObj = new Scanner(System.in); // Create a Scanner object
      

//           System.out.println("Enter length of key : " ); //length of the key

//         int len = myObj.nextInt();
//         myObj.nextLine();

//        // Hold the Keyword
//            System.out.println("enter Keyword : " );

//        String key = myObj.nextLine(); // Read user input
  
//        System.out.println("Keyword : " + key);

//        // Function call to generate encoded text
//        String encoded = encoder(key.toCharArray());

//        // Message that need to encode
//            System.out.println("enter message : " );
//        String message = myObj.nextLine(); // Read user input
//        System.out.println("Message before Ciphering : " + message);

//        // Function call to print ciphered text
//        System.out.println("Ciphered Text : " + cipheredIt(message,
//                encoded));
//    }
// }