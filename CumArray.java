
public class CumArray {
	public static void calculateCumulativeMultiple(int[] arr) {
        int cumulativeMultiple = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                cumulativeMultiple = 0;
            }
            cumulativeMultiple *= arr[i];
            arr[i] = cumulativeMultiple;
        }
    }
    public static void main(String[] args) {
        int[] arrNum = {5, 3, 4, 2, 0, 8};
        try {
            calculateCumulativeMultiple(arrNum);
            System.out.print("arrNum = [");
            for (int i = 0; i < arrNum.length; i++) {
                System.out.print(arrNum[i]);
                if (i < arrNum.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    
}
