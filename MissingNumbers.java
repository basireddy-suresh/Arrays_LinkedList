public class MissingNumbers {
    public static void findMissingNumbers(int[] arr) {
        int nextNumber = arr[0] + 1;
        for (int i = 1; i < arr.length; i++) {
            while (nextNumber < arr[i]) {
                System.out.print(nextNumber + " ");
                nextNumber++;
            }
            nextNumber = arr[i] + 1;
        }
    }
    public static void main(String[] args) {
        int[] arrNum1 = {1, 2, 4, 5, 6};
        System.out.print("Missing numbers: ");
        findMissingNumbers(arrNum1);
        int[] arrNum2 = {1, 2, 3, 5, 6, 8, 10, 11, 14};
        System.out.print("\nMissing numbers: ");
        findMissingNumbers(arrNum2);
    }
}

