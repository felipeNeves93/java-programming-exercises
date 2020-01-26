package exercises.codesignal.shapearea;

public class ShapeArea {

    public int getShapeArea(int numberOfSquares) {
        if (numberOfSquares == 0) {
            return 0;
        }

        if (numberOfSquares == 1) {
            return 1;
        }

        int squaredResult = numberOfSquares * numberOfSquares;

        return squaredResult + this.getSquaredResultFromPreviousNumber(numberOfSquares);
    }

    private int getSquaredResultFromPreviousNumber(int currentNumber) {
        int previousNumber = currentNumber - 1;

        return previousNumber * previousNumber;
    }
}
