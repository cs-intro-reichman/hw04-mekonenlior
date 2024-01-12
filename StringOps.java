public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String string) {
        String input = "Hello World";
        String newInput = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Check if the character is a lowercase vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                c = (char) (c - 32); // Convert to uppercase using ASCII
            } 
            // Check if the character is an uppercase vowel
            else if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                c = (char) (c + 32); // Convert to lowercase using ASCII
            }
            newInput += c;
        }
        return newInput;
    }

    public static String camelCase (String string) {
        String word1 = "Hello";
        char a = word1.charAt(0);
        if (a >= 'A' && a <= 'Z') {
            a = (char) (a + 32);
        }
        word1 = a + word1.substring(1);
        System.out.println(word1);

        String word2 = "world";
        char b = word2.charAt(0);
        if (b >= 'a' && b <= 'z') {
            b = (char) (b - 32);
        }
        word2 = b + word2.substring(1);
        System.out.println(word2);
        return "";
    }

    public static int[] allIndexOf (String string, char chr) {
        String input = "Hello World";
        char letter = 'o';
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == letter) {
                System.out.println(i);
            }
        }
        return new int[1];
    }
}
