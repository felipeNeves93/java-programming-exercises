package exercises.codesignal.adjacentelementsproduct;

public class AdjacentElementProduct {

    public int getLargestAdjacentElementProduct(int[] numbers) {
        if (numbers.length <= 1) {
            return 0;
        }

        int largestAdjacentElementProduct = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length - 1; i++) {
            int productResult = this.getNextProduct(numbers, i);

            largestAdjacentElementProduct = Math.max(productResult, largestAdjacentElementProduct);
        }

        return largestAdjacentElementProduct;
    }

    private int getNextProduct(int[] numbers, int index) {
        return numbers[index] * numbers[index + 1];
    }
}
