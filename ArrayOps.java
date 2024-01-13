public class ArrayOps {
    public static void main(String[] args) {

    }

    public static int findMissingInt(int[] array) {
        int arrayLength = array.length;
        int missingNumber = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] != i + 1) {
                missingNumber = i + 1;
                break; // Break out of the loop once the missing number is found
            }
        }

        return missingNumber;
    }

    public static int secondMaxValue(int[] array) {
        int max = array[0];
        int secondMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > secondMax && array[i] < max) {
                secondMax = array[i];
            }
        }
        return secondMax;
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
