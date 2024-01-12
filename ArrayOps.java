public class ArrayOps {
    public static void main(String[] args) {

    }

    public static int findMissingInt(int[] array) {
        int[] Numbers = { 3, 0, 1 };
        int arrayLength = Numbers.length;
        int missingNumber = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (Numbers[i] != i + 1) {
                missingNumber = i + 1;
                break; // Break out of the loop once the missing number is found
            }
        }

        return missingNumber;
    }

    public static int secondMaxValue(int[] array) {
        int[] Numbers = { 4, 3, 7, 4, 9, 6 };
        int max = Numbers[0];
        int secondMax = Numbers[0];
        for (int i = 1; i < Numbers.length; i++) {
            if (Numbers[i] > max) {
                max = Numbers[i];
            }
        }
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] > secondMax && Numbers[i] < max) {
                secondMax = Numbers[i];
            }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        int[] Array1 = { 5, 2, 1, -4, 3 };
        int[] Array2 = { 5, -4, 3, 1 };
        boolean sameElements = true;
        for (int number : Array1) {
            boolean found = false;
            // Check if the number is present in Array2
            for (int compareNumber : Array2) {
                if (number == compareNumber) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                sameElements = false;
                break; // Exit outer loop if any number from Array1 is not found
            }
        }
        return sameElements;
    }

    public static boolean isSorted(int[] array) {
        int[] Numbers = { 7, 5, 4, 3, -12 };
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < Numbers.length; i++) {
            if (Numbers[i] < Numbers[i - 1]) {
                increasing = false;
            }
            if (Numbers[i] > Numbers[i - 1]) {
                decreasing = false;
            }
        }

        return increasing || decreasing;
    }

}
