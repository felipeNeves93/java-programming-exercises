package exercises.codesignal.addborder;

public class AddBorder {
    public String[] addBorder(String[] picture) {
        String[] arrayWithBorders = new String[picture.length + 2];
        String calculatedBord = this.calculateBord(picture[0].length());

        this.addBorderInTheBegining(arrayWithBorders, calculatedBord);
        this.addBorderInTheEnd(arrayWithBorders, calculatedBord);

        int initIndexArrayWithBorders = 1;
        int endIndexArrayWithBorders = arrayWithBorders.length -1;

        for(int index = initIndexArrayWithBorders; index < endIndexArrayWithBorders; index ++){
            String word = picture[index -1];
            arrayWithBorders[index] = this.formWordWithBorders(word);
        }

        return arrayWithBorders;
    }

    private String calculateBord(int wordLength){
        final int NUMBER_OF_LINES_TO_ADD = 2;

        StringBuilder bord = new StringBuilder();

        int bordSize = wordLength + NUMBER_OF_LINES_TO_ADD;

        for(int index = 0; index < bordSize; index ++){
            bord.append("*");
        }

        return bord.toString();
    }

    private String formWordWithBorders(String word){
        StringBuilder wordToReturn = new StringBuilder();

        wordToReturn.append("*")
                .append(word)
                .append("*");

        return wordToReturn.toString();
    }

    private void addBorderInTheBegining(String[] array, String calculatedBord){
        array[0] = calculatedBord;
    }

    private void addBorderInTheEnd(String[] array, String calculatedBord){
        int endPosition = array.length - 1;

        array[endPosition] = calculatedBord;
    }
}
