public class StringOps {
    ////////////////////////////////////////////////////////////
    ////// ///////
    ////// Reminder: ///////
    ////// allowed methods ///////
    ////// ///////
    ////// 1.charAt(int index) ///////
    ////// 2.length() ///////
    ////// 3.substring(int start) ///////
    ////// 4.substring(int start,int ends) ///////
    ////// 5.indexOf(String str) ///////
    ////// ///////
    ////// The rest are not allowed ! ///////
    ////// if you want to use a different ///////
    ////// method, and you can implement ///////
    ////// it using material from the course ///////
    ////// you need to implement a version of ///////
    ////// the function by yourself. ///////
    ////// ///////
    ////// see example for substring ///////
    ////// in Recitation 3 question 5 ///////
    ////// ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {

    }

    public static String capVowelsLowRest(String string) {
        String newString = "";
    for (int i = 0; i < string.length(); i++) {
        char c = string.charAt(i);
        // Check if the character is a lowercase vowel
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            c = (char) (c - 32); // Convert to uppercase using ASCII
        }
        // Check if the character is an uppercase vowel
        else if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            // Do nothing, keep it as an uppercase vowel
        }
        else if (Character.isUpperCase(c)) {
            c = (char) (c + 32); // Convert to lowercase using ASCII
        }
        newString += c;
    }
    return newString;
    }

    public static String camelCase(String string) {
        int length = string.length();
        boolean capitalizeNext = false;
        String result = "";

        for (int i = 0; i < length; i++) {
            char currentChar = string.charAt(i);

            // Check if the character is a whitespace using ASCII
            if (currentChar >= 32 && currentChar <= 47 || currentChar == 59 || currentChar == 60) {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                // Convert to uppercase using ASCII
                if (currentChar >= 'a' && currentChar <= 'z') {
                    result += (char) (currentChar - 32);  // ASCII difference for uppercase
                } else {
                    result += currentChar;
                }
                capitalizeNext = false;
            } else {
                // Convert to lowercase using ASCII
                if (currentChar >= 'A' && currentChar <= 'Z') {
                    result += (char) (currentChar + 32);  // ASCII difference for lowercase
                } else {
                    result += currentChar;
                }
            }
        }

        return result;
    }

    public static int[] allIndexOf(String string, char chr) {
        int count = 0;

    // First pass to determine the size of the array
    for (int i = 0; i < string.length(); i++) {
        if (string.charAt(i) == chr) {
            count++;
        }
    }

    // Declare the array based on the count
    int[] indices = new int[count];

    // Second pass to populate the array with indexes
    int index = 0;
    for (int i = 0; i < string.length(); i++) {
        if (string.charAt(i) == chr) {
            indices[index++] = i;
        }
    }

    return indices;
    }
}
