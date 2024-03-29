public class ArrayOps {
    public static void main(String[] args) {

    }

    public static int findMissingInt(int[] array) {
        int arrayLength = array.length;

        // Check if 0 is missing
        if (array[0] != 0) {
            return 0;
        }

        // Check for missing integers in the middle
        for (int i = 1; i < arrayLength; i++) {
            if (array[i] != array[i - 1] + 1) {
                return array[i - 1] + 1;
            }
        }
        return array[arrayLength - 1] + 1;
    }

    public static int secondMaxValue(int[] array) {
        int max = array[0];
        int countMax = 0; // Counter to track occurrences of max
        int secondMax = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
                countMax = 1; // Reset count when a new max is found
            } else if (array[i] == max) {
                countMax++; // Increment count if max is found again
            } else if (array[i] > secondMax && array[i] < max) {
                secondMax = array[i];
            }
        }

        return countMax >= 2 ? max : secondMax; // Return max if it appears twice, otherwise secondMax
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        boolean sameElements = true;
        for (int number : array1) {
            boolean found = false;
            // Check if the number is present in Array2
            for (int compareNumber : array2) {
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
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                increasing = false;
            }
            if (array[i] > array[i - 1]) {
                decreasing = false;
            }
        }

        return increasing || decreasing;
    }

}
